import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener{
	boolean isOperatorClicked=false;
	String oldValue;
	String operator;
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton,clearButton;
	JButton zeroButton;
	JButton equalButton,divButton,mulButton,minusButton,plusButton;
	
	
	public Calculator() {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);   //width,height
		jf.setLocation(300,150);  //position of the window on the screen
		
		//Display screen
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);
		
		
		
		//Buttons in calculator
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,130 , 80, 80);
		sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sevenButton.setBackground(Color.BLACK);
		sevenButton.setForeground(Color.WHITE);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130,130 , 80, 80);
		eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
		eightButton.setBackground(Color.BLACK);
		eightButton.setForeground(Color.WHITE);
		eightButton.addActionListener(this);
		jf.add(eightButton);

		nineButton=new JButton("9");
		nineButton.setBounds(230,130 , 80, 80);
		nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
		nineButton.setBackground(Color.BLACK);
		nineButton.setForeground(Color.WHITE);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		
		fourButton=new JButton("4");
		fourButton.setBounds(30,230 , 80, 80);
		fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fourButton.setBackground(Color.BLACK);
		fourButton.setForeground(Color.WHITE);
		fourButton.addActionListener(this);
		jf.add(fourButton);

		fiveButton=new JButton("5");
		fiveButton.setBounds(130,230 , 80, 80);
		fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
		fiveButton.setBackground(Color.BLACK);
		fiveButton.setForeground(Color.WHITE);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);

		sixButton=new JButton("6");
		sixButton.setBounds(230,230 , 80, 80);
		sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
		sixButton.setBackground(Color.BLACK);
		sixButton.setForeground(Color.WHITE);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30,330 , 80, 80);
		oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
		oneButton.setBackground(Color.BLACK);
		oneButton.setForeground(Color.WHITE);
		oneButton.addActionListener(this);
		jf.add(oneButton);

		twoButton=new JButton("2");
		twoButton.setBounds(130,330 , 80, 80);
		twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
		twoButton.setBackground(Color.BLACK);
		twoButton.setForeground(Color.WHITE);
		twoButton.addActionListener(this);
		jf.add(twoButton);

		threeButton=new JButton("3");
		threeButton.setBounds(230,330 , 80, 80);
		threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
		threeButton.setBackground(Color.BLACK);
		threeButton.setForeground(Color.WHITE);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30,430 , 80, 80);
		dotButton.setFont(new Font("Arial", Font.PLAIN, 30));
		dotButton.setBackground(Color.BLACK);
		dotButton.setForeground(Color.WHITE);
		dotButton.addActionListener(this);
		jf.add(dotButton);

		zeroButton=new JButton("0");
		zeroButton.setBounds(130,430 , 80, 80);
		zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
		zeroButton.setBackground(Color.BLACK);
		zeroButton.setForeground(Color.WHITE);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);

		equalButton=new JButton("=");
		equalButton.setBounds(230,430 , 80, 80);
		equalButton.setFont(new Font("Arial", Font.PLAIN, 30));
		equalButton.setBackground(Color.BLACK);
		equalButton.setForeground(Color.WHITE);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		
		divButton=new JButton("/");
		divButton.setBounds(330,130 , 80, 80);
		divButton.setFont(new Font("Arial", Font.PLAIN, 30));
		divButton.setBackground(Color.BLACK);
		divButton.setForeground(Color.WHITE);
		divButton.addActionListener(this);
		jf.add(divButton);
        
		mulButton=new JButton("x");
		mulButton.setBounds(330,230 , 80, 80);
		mulButton.setFont(new Font("Arial", Font.PLAIN, 30));
		mulButton.setBackground(Color.BLACK);
		mulButton.setForeground(Color.WHITE);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		minusButton=new JButton("-");
		minusButton.setBounds(330,330 , 80, 80);
		minusButton.setFont(new Font("Arial", Font.PLAIN, 30));
		minusButton.setBackground(Color.BLACK);
		minusButton.setForeground(Color.WHITE);
		minusButton.addActionListener(this);
		jf.add(minusButton);
		
		plusButton=new JButton("+");
		plusButton.setBounds(330,430 , 80, 80);
		plusButton.setFont(new Font("Arial", Font.PLAIN, 30));
		plusButton.setBackground(Color.BLACK);
		plusButton.setForeground(Color.WHITE);
		plusButton.addActionListener(this);
		jf.add(plusButton);
		
		clearButton=new JButton("C");
		clearButton.setBounds(430,430 , 80, 80);
		clearButton.setFont(new Font("Arial", Font.PLAIN, 30));
		clearButton.setBackground(Color.decode("#091FA1"));
		clearButton.setForeground(Color.WHITE);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		
		jf.setVisible(true);    //window made visible
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to stop the program execution once the window is closed
	}
   
	public static void main(String[] args) {
		new Calculator();   //object for class Calculator 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==sevenButton) {
			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "7");	
			}
		}
		
		else if(e.getSource()==eightButton) {
			 if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "8");	
			}
			}
		
		else if(e.getSource()==nineButton) {
			 if(isOperatorClicked) {
					displayLabel.setText("9");
					isOperatorClicked=false;
				}else {
					displayLabel.setText(displayLabel.getText()+ "9");
				}
			}
		
		else if(e.getSource()==fourButton) {
			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "4");	
			}	
		}
		
		else if(e.getSource()==fiveButton) {
			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "5");	
			}
		}
		else if(e.getSource()==sixButton) {
			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "6");	
			}
		}
		
		else if(e.getSource()==oneButton) {
			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "1");	
			}
		}
		
		else if(e.getSource()==twoButton) {
			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "2");	
			}
		}
		else if(e.getSource()==threeButton) {
			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "3");	
			}
		}
		else if(e.getSource()==dotButton) {
			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ ".");	
			}
		}
		else if(e.getSource()==zeroButton) {
			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				displayLabel.setText(displayLabel.getText()+ "0");	
			}
			
		}else if(e.getSource()==divButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator="/";
			
		}
		else if(e.getSource()==mulButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator="x";
			
		}
		else if(e.getSource()==minusButton) {
	
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator="-";
			
		}
		else if(e.getSource()==plusButton) {
			
			isOperatorClicked=true;
			oldValue=displayLabel.getText();
			operator="+";
			

		}
		else if(e.getSource()==equalButton) {
			String newValue=displayLabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			if(operator=="/") {
				float result=oldValueF/newValueF;
				displayLabel.setText(result+"");
			}
			else if(operator=="x") {
				float result=oldValueF*newValueF;
				displayLabel.setText(result+"");
			}
			else if(operator=="-") {
				float result=oldValueF-newValueF;
				displayLabel.setText(result+"");
			}
			else if(operator=="+") {
				float result=oldValueF+newValueF;
				displayLabel.setText(result+"");
			}
			
		
		
		
		
		
		}
		else if(e.getSource()==clearButton) {
			displayLabel.setText("");
		}
		
	}

	
	
}
