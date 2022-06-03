


public class Menu extends Main{
	
	
	public static void deathScreen() {
		
		myFrame.getContentPane().removeAll();
		myFrame.getContentPane().invalidate();

		myFrame.getContentPane().add(deathPanel);
		myFrame.getContentPane().revalidate();
		
		
	}
	
	public static void restart() {
		
		
		Main.healthBar.setValue(100);
		Main.staminaBar.setValue(100);
		Main.hungerBar.setValue(100);
		EnterText.woodAmount = 0;
		Stamina.runAmount = 0;
		Stamina.runLeft = 100;
		Main.theEnviro.changeEnviro(difficulty);
		
		
		
		myFrame.getContentPane().removeAll();
		myFrame.getContentPane().invalidate();

		myFrame.getContentPane().add(myPanel);
		myFrame.getContentPane().revalidate();
		myFrame.getContentPane().repaint();
		
		
		
	}
	
	
	
}
