import javax.swing.*;
import java.awt.*;


public class Text extends JLabel {
	
	public Text(boolean vis, Color col, String text, int x, int y, int z, int v) {
		this.setFont(getFont());
		this.setBounds(x, y, z, v);
		this.setText(text);
		this.setForeground(col);
		this.setVisible(vis);
	}
	
	
}
