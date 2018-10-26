import javax.swing.JOptionPane;
public class StateAbbreviations {

	public static void main(String[] args) {
		
		String input;
		
		input=JOptionPane.showInputDialog("Enter a State (NC,SC,GA,FL,AL):");
		
		input=input.toUpperCase();
		
		if(input.equals("NC")){
			JOptionPane.showMessageDialog(null, "North Carolina");
		}
		if(input.equals("SC")){
			JOptionPane.showMessageDialog(null, "South Carolina");
		}
		if(input.equals("GA")){
			JOptionPane.showMessageDialog(null, "Georgia");
		}
		if(input.equals("FL")){
			JOptionPane.showMessageDialog(null, "Florida");
		}
		if(input.equals("AL")){
			JOptionPane.showMessageDialog(null, "Alabama");
		}else{
			JOptionPane.showMessageDialog(null, "Error");
		}
		System.exit(0);
		
	}

}
