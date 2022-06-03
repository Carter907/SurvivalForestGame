
import javax.swing.*;
import java.awt.*;

public class Bar extends JProgressBar {
	
	public Bar(Color color, int x, int y, int z, int v) {
		
		this.setBounds( x, y, z, v);
		this.setVisible(true);
		this.setForeground(color);
		this.setValue(100);
	}
}
