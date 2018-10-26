import java.util.Scanner;
public class TestRepeat {

	public static void main(String[] args) {
		
		int test1, test2, test3; 
		double avg;
		char repeat;
		String input;
		
		System.out.println("This program calculates the average of three test scores.");
		
		Scanner keyboard = new Scanner(System.in);
		
		do{
			
			System.out.println("Enter the test 1 score:");
			test1=keyboard.nextInt();
			System.out.println("Enter the test 2 score:");
			test2=keyboard.nextInt();
			System.out.println("Enter the test 3 score:");
			test3=keyboard.nextInt();
			keyboard.nextLine();
			avg = (test1+test2+test3)/3;
			System.out.println("The average for the three tests is: "+avg);
			
			System.out.println("Would you like to average 3 more tests?");
			input=keyboard.nextLine();
			repeat=input.charAt(0);
			
			
		}while(repeat=='Y'||repeat=='y');
		
		System.out.println("Thank you for using the program");

	}

}
