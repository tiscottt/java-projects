import javax.swing.JOptionPane;
public class RomanNumerals {

	public static void main(String[] args) {
		
		String input;
		int number;
		
		input=JOptionPane.showInputDialog("Please enter a number between 1 and 10:");
		number=Integer.parseInt(input);
		
		if(number>10 || number<1){
			JOptionPane.showMessageDialog(null, "Invalid Number");
		}else{
			switch(number){
			
				case 1: 
					JOptionPane.showMessageDialog(null, "I");
					break;
				case 2:
					JOptionPane.showMessageDialog(null, "II");
					break;
				case 3:
					JOptionPane.showMessageDialog(null, "III");
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "IV");
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "V");
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "VI");
					break;
				case 7:
					JOptionPane.showMessageDialog(null, "VII");
					break;
				case 8:
					JOptionPane.showMessageDialog(null, "VIII");
					break;
				case 9:
					JOptionPane.showMessageDialog(null, "IX");
					break;
				case 10:
					JOptionPane.showMessageDialog(null, "X");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Error");
			
			}
		}
		
		System.exit(0);

	}

}
