import java.util.Scanner;
public class AvailableBalance {

	public static void main(String[] args) {
		double startBal, deposits, withdrawls, interest, balance;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What was your starting balance:");
		startBal = keyboard.nextDouble();
		System.out.println("What were your deposits: ");
		deposits = keyboard.nextDouble();
		System.out.println("What were your withdrawls:");
		withdrawls = keyboard.nextDouble();
		System.out.println("What is your interest rate:");
		interest = keyboard.nextDouble();
		balance = (startBal + (deposits-withdrawls))*(1+interest);
		System.out.println("Balance: "+ balance);
	}

}
