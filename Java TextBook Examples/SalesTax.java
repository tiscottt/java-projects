import java.util.Scanner;

public class SalesTax {

	public static void main(String[] args) {
		
		double retail, rate, tax, total;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is Retail price: ");
		retail = keyboard.nextDouble();
		System.out.println("Tax rate: ");
		rate= keyboard.nextDouble();
		tax=retail*rate;
		total=retail+tax;
		System.out.println("The tax is: "+tax+ " The total is:"+ total);
						

	}

}
