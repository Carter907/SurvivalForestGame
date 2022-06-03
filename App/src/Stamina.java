import java.awt.*;

public class Stamina extends Bar{

  public static boolean runState = false;
  public static boolean restState = false;
  public static final int restAmount = 20;
  public static int runAmount = 0;
  public static int runLeft = 100;
  

  public Stamina(Color color, int x, int y, int z, int v) {
    super(color ,x ,y ,z ,v);
    
    
  }
  
  
}