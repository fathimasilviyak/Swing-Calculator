import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {

	public Calculator() {
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);   //width,height
		jf.setLocation(300,150);  //position of the window on the screen
		
		//display screen
		JLabel displayLabel=new JLabel("hello");
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		
		
		
		
		jf.setVisible(true);    //window made visible
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to stop the program execution once the window is closed
	}
   
	public static void main(String[] args) {
		new Calculator();   //object for class Calculator 
	}
	
}
