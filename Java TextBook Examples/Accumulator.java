import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Accumulator {

	public static void main(String[] args) {

		int days;
		double totalSales, sales;
		String input;
		
		DecimalFormat dollar = new DecimalFormat("#,##0.00");
		
		input=JOptionPane.showInputDialog("How many days of sales would you like to sum?");
		
		days=Integer.parseInt(input);
		
		totalSales=0.0;
		
		for(int i=1; i<=days; i++){
			input=JOptionPane.showInputDialog("Enter sales for day "+i+":");
			sales = Double.parseDouble(input);
			totalSales+=sales;
		}
		JOptionPane.showMessageDialog(null, "The total sales for "+days+" days are $"+dollar.format(totalSales));
		
		System.exit(0);
		
		
	}

}
