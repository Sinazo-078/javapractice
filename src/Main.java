import javax.swing.JOptionPane;

public class Main{
	public static void main(String[]args) {
		

	        String name = JOptionPane.showInputDialog("Enter your name");
	        JOptionPane.showMessageDialog(null, "Hello " + name);
	         
	        int Age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
	        JOptionPane.showMessageDialog(null, "your are " + Age + " years old" );
	        double  hieght = Double.parseDouble(JOptionPane.showInputDialog("Enter your age"));
	        JOptionPane.showMessageDialog(null, "your are " + hieght + "cm" );
	        
	        
	        
		
		
	}
	
}



	
