import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator {

	public Calculator() {
		JFrame jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);   //width,height
		jf.setLocation(300,150);  //position of the window on the screen
		
		//Display screen
		JLabel displayLabel=new JLabel("hello");
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		
		
		//Buttons in calculator
		
		JButton sevenButton=new JButton("7");
		sevenButton.setBounds(30,130 , 80, 80);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sevenButton.setBackground(Color.BLACK);
		sevenButton.setForeground(Color.WHITE);
		jf.add(sevenButton);
		
		JButton eightButton=new JButton("8");
		eightButton.setBounds(130,130 , 80, 80);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		eightButton.setBackground(Color.BLACK);
		eightButton.setForeground(Color.WHITE);
		jf.add(eightButton);

		JButton nineButton=new JButton("9");
		nineButton.setBounds(230,130 , 80, 80);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		nineButton.setBackground(Color.BLACK);
		nineButton.setForeground(Color.WHITE);
		jf.add(nineButton);
		
		
		JButton fourButton=new JButton("4");
		fourButton.setBounds(30,230 , 80, 80);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fourButton.setBackground(Color.BLACK);
		fourButton.setForeground(Color.WHITE);
		jf.add(fourButton);

		JButton fiveButton=new JButton("5");
		fiveButton.setBounds(130,230 , 80, 80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fiveButton.setBackground(Color.BLACK);
		fiveButton.setForeground(Color.WHITE);
		jf.add(fiveButton);

		JButton sixButton=new JButton("6");
		sixButton.setBounds(230,230 , 80, 80);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sixButton.setBackground(Color.BLACK);
		sixButton.setForeground(Color.WHITE);
		jf.add(sixButton);
		
		JButton oneButton=new JButton("1");
		oneButton.setBounds(30,330 , 80, 80);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
		oneButton.setBackground(Color.BLACK);
		oneButton.setForeground(Color.WHITE);
		jf.add(oneButton);

		JButton twoButton=new JButton("2");
		twoButton.setBounds(130,330 , 80, 80);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
		twoButton.setBackground(Color.BLACK);
		twoButton.setForeground(Color.WHITE);
		jf.add(twoButton);

		JButton threeButton=new JButton("3");
		threeButton.setBounds(230,330 , 80, 80);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
		threeButton.setBackground(Color.BLACK);
		threeButton.setForeground(Color.WHITE);
		jf.add(threeButton);
		
		JButton dotButton=new JButton(".");
		dotButton.setBounds(30,430 , 80, 80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		dotButton.setBackground(Color.BLACK);
		dotButton.setForeground(Color.WHITE);
		jf.add(dotButton);

		JButton zeroButton=new JButton("0");
		zeroButton.setBounds(130,430 , 80, 80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
		zeroButton.setBackground(Color.BLACK);
		zeroButton.setForeground(Color.WHITE);
		jf.add(zeroButton);

		JButton equalButton=new JButton("=");
		equalButton.setBounds(230,430 , 80, 80);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
		equalButton.setBackground(Color.BLACK);
		equalButton.setForeground(Color.WHITE);
		jf.add(equalButton);
		
		
		JButton divButton=new JButton("/");
		divButton.setBounds(330,130 , 80, 80);
		divButton.setFont(new Font("Arial", Font.PLAIN, 30));
		divButton.setBackground(Color.BLACK);
		divButton.setForeground(Color.WHITE);
		jf.add(divButton);
        
		JButton mulButton=new JButton("x");
		mulButton.setBounds(330,230 , 80, 80);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 30));
		mulButton.setBackground(Color.BLACK);
		mulButton.setForeground(Color.WHITE);
		jf.add(mulButton);
		
		JButton minusButton=new JButton("-");
		minusButton.setBounds(330,330 , 80, 80);
		minusButton.setFont(new Font("Arial", Font.PLAIN, 30));
		minusButton.setBackground(Color.BLACK);
		minusButton.setForeground(Color.WHITE);
		jf.add(minusButton);
		
		JButton plusButton=new JButton("+");
		plusButton.setBounds(330,430 , 80, 80);
		plusButton.setFont(new Font("Arial", Font.PLAIN, 30));
		plusButton.setBackground(Color.BLACK);
		plusButton.setForeground(Color.WHITE);
		jf.add(plusButton);
		
		
		
		jf.setVisible(true);    //window made visible
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to stop the program execution once the window is closed
	}
   
	public static void main(String[] args) {
		new Calculator();   //object for class Calculator 
	}
	
}
