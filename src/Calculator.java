import javax.swing.JFrame;

public class Calculator {

	public Calculator() {
		JFrame jf=new JFrame();
		jf.setLayout(null);
		jf.setSize(600, 600);  //width,height
		jf.setVisible(true);   //
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to stop the program execution once the window is closed
	}
   
	public static void main(String[] args) {
		new Calculator(); //object for class Calculator 
	}
	
}
