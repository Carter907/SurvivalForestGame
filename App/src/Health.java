import java.awt.*;

public class Health extends Bar implements Runnable{

  public static int healthMultiplyer = 500;

  
  public Health(Color color, int x, int y, int z, int v) {
    super(color ,x ,y ,z ,v);
    
    
  }
  
  @Override
	public void run() {
		
		while (true) {
			
			this.setValue(this.getValue() - Hunger.starveMultiplier - Environment.pHealthEff);
			try {
				Thread.sleep(healthMultiplyer);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}	
	}
}