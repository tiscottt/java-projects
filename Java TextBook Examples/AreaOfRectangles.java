import java.util.Scanner;
public class AreaOfRectangles {

	public static void main(String[] args) {
		
		int w1,l1,w2,l2,a1,a2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the first Rectangle width:");
		w1=keyboard.nextInt();
		System.out.println("Please enter the first Rectangle length:");
		l1=keyboard.nextInt();
		System.out.println("Please enter the second Rectangle width:");
		w2=keyboard.nextInt();
		System.out.println("Please enter the second Rectangle length:");
		l2=keyboard.nextInt();
		a1=w1*l1;
		a2=w2*l2;
		if(a1==a2){
			System.out.println("The rectangles are the same area.");
		}else if(a1>a2){
			System.out.println("Recatangle 1 has a larger area.");
		}else{
			System.out.println("Recatangle 2 has a larger area.");
		}
		
		keyboard.close();
		System.exit(0);

	}

}
