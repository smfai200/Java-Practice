package leap_year;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int year;
		System.out.println("Enter year");
		year = input.nextInt();
		if(year % 4 == 0)
		{
			System.out.println("This is a Leap Year");
		}
		else 
		{
			System.out.println("This is not leap year");
		}

	}

}
