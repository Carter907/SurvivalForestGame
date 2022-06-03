


public class Environment {
	
	public static final String[] animals = {"Wolf", "Bear", "Mountain Lion", "rabbit"};
	public static final String[] enviroNames = {"Forest", "City", "Mountains", "WasteLand"};
	
	public static int pHungEff = 0;
	public static int pHealthEff = 0;
	public static int pChopEff = 0;
	public static String pName = enviroNames[0];
	
	
	
	
	
	private String name; 
	private int hungEff;
	private int healthEff;
	
	public Environment(String name, int hungEff, int healthEff) {
		
		this.name = name;
		this.hungEff = hungEff;
		this.healthEff = healthEff;
		
		
		
		
	}
	
	public void changeEnviro() {
		
		int chance = (int)(Math.random()*4);
		
			Main.theEnviro = Main.environments[chance];
		
			Main.whatEnvironment.setText("Environment: " + this.name);
		
		
			pHungEff = this.hungEff;
			pHealthEff = this.healthEff;
			pName = this.name;
		
		}
	
	public void changeEnviro(int env) {
		
		Main.theEnviro = Main.environments[env];
	
		Main.whatEnvironment.setText("Environment: " + this.name);
	
	
		pHungEff = this.hungEff;
		pHealthEff = this.healthEff;
		pName = this.name;
		
	}
		
		
		
		
		
		
		
		
	}
	
	
	
	

