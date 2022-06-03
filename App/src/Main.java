
import java.awt.*;

public class Main implements Runnable{
	
	
	public static Text Action = new Text(true, new Color(32, 158, 13), "Action Performed: ", Panel.screenWidth/2 - 360, Panel.screenHeight/2 - 75, 400, 20);
	public static Text whatEnvironment = new Text(true, new Color(32, 158, 13), "Environment: " + Environment.pName, Panel.screenWidth/2 - 360, Panel.screenHeight/2 - 50, 400, 20);
	
	public static Text died = new Text(true, new Color(158, 32, 32), "you died", Panel.screenWidth/2 - 23, Panel.screenHeight/2 - 20, 400, 20);
	public static Text woodText = new Text(true, new Color(32, 158, 13), "Wood: " + EnterText.woodAmount, Panel.screenWidth/2 - 360, Panel.screenHeight/2 - 100, 400, 20);
	
	//public Environment(String name, int hungEff, int healthEff)
	//public static final String[] enviroNames = {"Forest", "City", "Mountains", "WasteLand"};
	public static final Environment[] environments = {new Environment(Environment.enviroNames[0], 0, 0), new Environment(Environment.enviroNames[3], 2, 2), new Environment(Environment.enviroNames[1], -1, 0), new Environment(Environment.enviroNames[2], 1, 0)};
	public static Environment theEnviro = environments[0];
	

	public static Text health = new Text(true, new Color(32, 158, 13), "Health", Panel.screenWidth/2 - 160, Panel.screenHeight/2 - 255, 400, 20);
	public static Text hunger = new Text(true, new Color(32, 158, 13), "Hunger", Panel.screenWidth/2 - 160, Panel.screenHeight/2 - 225, 400, 20);
	public static Text stamina = new Text(true, new Color(32, 158, 13), "Stamina", Panel.screenWidth/2 - 160, Panel.screenHeight/2 - 240, 400, 20);
	
	public static Text key = new Text(false, new Color(32, 158, 13), "key: run, eat, chop wood, light fire, drink ", Panel.screenWidth/2 + 50, Panel.screenHeight/2 - 240, 400, 20);

  
	public static Button restartButton = new Button("restart", true, Panel.screenWidth/2 - 35, Panel.screenHeight/2 + 5, 75, 20);
  
	public static Frame myFrame = new Frame();
	public static Panel myPanel = new Panel(true);
	public static Panel deathPanel = new Panel(true);
	public static Text myText = new Text(true, Color.WHITE, "Survival Forest", Panel.screenWidth/2 - 45, Panel.screenHeight/2, 200, 20);
	public static EnterText enterText = new EnterText("Please Type your action here...");
	public static Health healthBar = new Health(Color.red, 3, 3, 200, 10);
	public static Stamina staminaBar = new Stamina(Color.yellow, 3, 16, 200, 10);
	public static Hunger hungerBar = new Hunger(Color.orange, 3, 28, 200, 10);

	public static Thread threadHunger = new Thread(hungerBar);
	public static Thread threadHealth = new Thread(healthBar);
	
	
	
	public static final int difficulty = 1;
	
	
	
	public static void main(String[] args) {

		
		myPanel.add(healthBar);
		myPanel.add(staminaBar);
		myPanel.add(hungerBar);
		myPanel.add(enterText);
		myPanel.add(Action);
		myPanel.add(myText);
		myPanel.add(health);
		myPanel.add(hunger);
		myPanel.add(stamina);
		myPanel.add(whatEnvironment);
		myPanel.add(woodText);
		myPanel.add(key);
		
		deathPanel.add(died);
		deathPanel.add(restartButton);

    
		myFrame.add(myPanel);
		
		
		myFrame.pack();

    
		Thread threadHunger = new Thread(hungerBar);
		Thread threadHealth = new Thread(healthBar);

		Main main = new Main();
		Thread thread = new Thread(main);
		
		
	
		
		
		thread.start();
    
	}
  
  public void run() {

    threadHunger.start();
    threadHealth.start();
    
    while(true) {
    	
    	
    	
    	
    	

      if (hungerBar.getValue() == 0) {


        Hunger.starveMultiplier = 1;
      
      
      }else{

        Hunger.starveMultiplier = 0;
        
      }

      if (Stamina.runState == true) {



        staminaBar.setValue(staminaBar.getValue() - Stamina.runAmount);

        Stamina.runLeft = staminaBar.getValue();

        
        Stamina.runState = false;
      }
      
      else if (Stamina.restState == true) {
    	  
    	  
    	  staminaBar.setValue(staminaBar.getValue() + Stamina.restAmount);

          Stamina.runLeft = staminaBar.getValue();
    	  
          Stamina.restState = false;
    	  
    	  
      }
      
      if (EnterText.move == true) {
    	  
    	  theEnviro.changeEnviro();
    	  EnterText.move = false;
    	  
      }
      
      if (Hunger.eatState == true) {

          hungerBar.setValue(hungerBar.getValue() + 30);
          Hunger.eatState = false;

          
        }
      
      if (healthBar.getValue() == 0) {
    	  
    	  
    	  Menu.deathScreen();
    	  
      }
      
      

      

      
     

      try {
        Thread.sleep(10); 
      }
      catch(InterruptedException e) {} 
      } 


    
    }
  }

