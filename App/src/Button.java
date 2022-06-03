

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;


public class Button extends JButton{

	
	public Button(String text, boolean vis, int nex, int abor, int width, int height) {
		
		super(text);
		this.setBackground(Color.BLACK);
		this.setVisible(vis);
		setBounds(nex, abor, width, height);
		this.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
	            Menu.restart();
	            
	        }  
	    });  
		
	}
	
	
	
	
}
