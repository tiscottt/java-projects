import java.util.Scanner;
public class AvailableCredit {

	public static void main(String[] args) {
		int maxCredit, creditUsed, creditAvail;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your Maximum Credit: ");
		maxCredit = keyboard.nextInt();
		System.out.println("How much credit have you used: ");
		creditUsed= keyboard.nextInt();
		creditAvail=maxCredit-creditUsed;
		System.out.println("The remaining Credit Available is: "+creditAvail);
		
	}

}
