import java.util.Scanner;
public class LeapYears {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("This is a leap year calculator, put in your year to test.");
		int year = scn.nextInt();
		
		if(year % 400 == 0) {
			System.out.println("This is a leap year.");
		}
		else if (year % 100 == 0) {
			System.out.println("This is not a leap year.");			
		}
		
		else if (year % 4 == 0) {
			System.out.println("This is a leap year.");
		}

		else {
			System.out.println("This is not a leap year.");
		}

	}

}
