
import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class EnterText extends JTextField implements KeyListener{

	
	//chanceOfMoving is between 2 - 130
	public static final int chanceOfMoving = 75;
	
	public static int woodAmount = 0;
	public static boolean move;
	
	
	
	public EnterText(String text) {
		
		this.setBounds(Panel.screenWidth/2 - 150, Panel.screenHeight/2 + 35, 300, 200);
		this.setForeground(new Color(32, 158, 13));
		this.setBackground(new Color(75, 75, 75));
		this.setText(text);
		this.addKeyListener(this);
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		String text = this.getText();
		
			
			
		
		if (e.getKeyCode() == 10) {
			
			
			
			
			
			
			switch (text) {	
			
			case "drink":
				Main.Action.setText("Action Performed: you drink water");
				break;
			case "eat":
				Main.Action.setText("Action Performed: you eat a meal");
				Hunger.eatState = true;
				break;
          
			case "run":
				Stamina.runAmount = ((int)(Math.random() * 100) + 1);
				
				if (Stamina.runLeft >= Stamina.runAmount) {
					
					moveTry(Stamina.runAmount);
					Main.Action.setText("Action Performed: you run " + Stamina.runAmount + " meters");
					Stamina.runState = true;
				}else {
					Main.Action.setText("Action Performed: you don't have enough stamina"); 
				}
				break;
			case "play":
				Main.Action.setText("Action Performed: you play with your dog");
				break;
			case "chop wood":
				Main.Action.setText("Action Performed: you chop wood");
				woodAmount++;
				Main.woodText.setText("Wood: " + EnterText.woodAmount);
				break;
			case "light fire":
				if (woodAmount >= 1) {
					Main.Action.setText("Action Performed: you light a fire");
					Stamina.restState = true;
					woodAmount--;
					Main.woodText.setText("Wood: " + EnterText.woodAmount);
				}
				else {
					Main.Action.setText("Action Performed: you don't have any wood");
				}
				break;
			case "die": 
					Menu.deathScreen();
					default: 
						Main.Action.setText("Action Performed: you do nothing");
						break;
				
					
				}
			
			this.setText("");
			
		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
		
		
	}
	
	
	public static void moveTry(int chance) {
		
		int moveNum = chance + (int)((Math.random()*30) + 1);
		
		
		if (moveNum+chanceOfMoving >= 75) {
			
			
			move = true;
		}
		else {
			
			move = false;}
			
		}
		
	}
	
	
	
	
	

