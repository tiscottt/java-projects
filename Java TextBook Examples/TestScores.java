import javax.swing.JOptionPane;
public class TestScores {

	public static void main(String[] args) {
		
		String input;
		int test1, test2, test3, avg;
		
		input=JOptionPane.showInputDialog("Please enter test score 1:");
		test1=Integer.parseInt(input);
		input=JOptionPane.showInputDialog("Please enter test score 2:");
		test2=Integer.parseInt(input);
		input=JOptionPane.showInputDialog("Please enter test score 3:");
		test3=Integer.parseInt(input);
		avg=(test1+test2+test3)/3;
		
		if(avg<60){
			JOptionPane.showMessageDialog(null, "F "+"Your average is: "+avg);
		}else if(avg>=60&&avg<=69){
			JOptionPane.showMessageDialog(null, "D "+"Your average is: "+avg);
		}else if(avg>=70&&avg<=79){
			JOptionPane.showMessageDialog(null, "C "+"Your average is: "+avg);
		}else if(avg>=80&&avg<=89){
			JOptionPane.showMessageDialog(null, "B "+"Your average is: "+avg);
		}else if(avg>=90&&avg<=100){
			JOptionPane.showMessageDialog(null, "A "+"Your average is: "+avg);
		}else{
			JOptionPane.showMessageDialog(null, "Invalid Entry");
		}

		System.exit(0);
	}

}
