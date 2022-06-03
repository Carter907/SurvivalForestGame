import java.awt.*;

import javax.swing.JPanel;

public class Panel extends JPanel {
	
	public static final int screenWidth = 750;
	public static final int screenHeight = 500;
	

	public Panel(boolean vis) {
		
		
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));
		this.setBackground(Color.black);
		this.setVisible(vis);
		this.setLayout(null);
	}
	
	
	
}
