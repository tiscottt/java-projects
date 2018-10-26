import javax.swing.JOptionPane;
public class MassWeight {

	public static void main(String[] args) {
		
		String input;
		double weight, mass;
		final double cons = 9.8;
		
		input=JOptionPane.showInputDialog("Enter the object's mass:");
		mass=Double.parseDouble(input);
		weight=mass*cons;
		
		if(weight<10){
			JOptionPane.showMessageDialog(null, "Object is too light.");
		}else if(weight>1000){
			JOptionPane.showMessageDialog(null, "Object is too heavy.");
		}else{
			JOptionPane.showMessageDialog(null, "The objects weight is: "+ weight+" Newtons");
		}
		
		System.exit(0);
	}

}
