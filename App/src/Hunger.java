import java.awt.*;

public class Hunger extends Bar implements Runnable{



  public static Boolean eatState = false;
  public static final int hungerMultiplier = 500;
  public static int starveMultiplier = 0;

  public Hunger(Color color, int x, int y, int z, int v) {
    super(color ,x ,y ,z ,v);
    
    
  }



  
  
  @Override
	public void run() {
		
		while (true) {
			
			this.setValue(this.getValue() - (2 + Environment.pHungEff));

      

			try {
				Thread.sleep(hungerMultiplier);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}	
	}
}