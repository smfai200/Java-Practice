package switch_cal;
import java.util.Scanner;

public class SwitchCal {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		int a,b,c,cal;
		System.out.println("Enter 1st value:");
		a = input.nextInt();
		
		System.out.println("Enter 2nd value:");
		b = input.nextInt();
		
		System.out.println("Enter ......\n1 for Add\n  2 for Subtraction\n  3 for Multiplication\n  4 for Divison\n" );
		cal = input.nextInt();
		
		switch(cal)
		{
		case 1:
			c = a+b;
			System.out.println("Add of number is="+c);
			break;
		case 2:
			c = a-b;
			System.out.println("Subtraction of number is="+c);
			break;
		case 3:
			c = a*b;
			System.out.println("Multplication of number is="+c);
			break;
		case 4:
			c = a/b;
			System.out.println("Divison of number is="+c);
			break;
			
			default:
			{
				System.out.println("Enter only 1 to 4 integers=");
			}
			
			
		}
		
		

	}

}
