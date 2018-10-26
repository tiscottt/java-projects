import javax.swing.JOptionPane;
public class NamesDialog {

	public static void main(String[] args) {
		
		String firstname, middlename, lastname;
		
		firstname=JOptionPane.showInputDialog("What is your first name?");
		middlename=JOptionPane.showInputDialog("What is your middle name?");
		lastname=JOptionPane.showInputDialog("What is your last name?");
		JOptionPane.showMessageDialog(null,"Hello "+ firstname+" "+middlename+" "+lastname);
		System.exit(0);

	}

}
