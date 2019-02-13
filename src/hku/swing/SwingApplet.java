package hku.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SwingApplet extends JApplet{

	public void init(){
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(2,1));
		JButton button = new JButton("Click me");
		
	}
}
