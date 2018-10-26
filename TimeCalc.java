import java.util.Scanner;
public class TimeCalc {
	
	public static void main(String[]args){
		

		double mins, hours, days, input;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the number of seconds");
		input = keyboard.nextInt();
		
		if(input>86400){
			days=input/86400;
			System.out.println("Number of days: "+days);
		}
		if(input>3600){
			hours = input/3600;
			System.out.println("Number of hours: "+ hours);
		}
		if(input>60){
			mins = input/60;
			System.out.println("Number of minutes: "+ mins);
		}

		
		System.exit(0);
		
	}

}
