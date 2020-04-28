
// Addition program that uses JOptionPane for input and output
import javax.swing.JOptionPane; // programs that use JoptionPane

public class additon {
	public static void main(String args[]) {
		// obtain user input from JOptionPane
		String firstNumber = JOptionPane.showInputDialog("Enter First Integer ");
		String secondNumber = JOptionPane.showInputDialog("Enter Second Integer ");
		// converts String inputs to int values for use in a calculation
		int number1 = Integer.parseInt(firstNumber);
		int number2 = Integer.parseInt(secondNumber);

		int sum = number1 + number2;

		JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of two Integers ", JOptionPane.PLAIN_MESSAGE);

	}

}
