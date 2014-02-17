package com.outlook.jim.example_swing;

import java.awt.*;
import javax.swing.*;

public class JustaFrame extends Frame {

	public JustaFrame(){
		super();
	}
	
	public void Paint(Graphics g){
		g.drawLine(10, 10, 300, 300);
	}
	
	public static void main(String[] arg){
		JustaFrame frame = new JustaFrame();
		frame.setSize(300, 300);
		frame.setVisible(true);
		//this is a test
	}
}
