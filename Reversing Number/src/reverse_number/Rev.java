package reverse_number;
import java.util.Scanner;
public class Rev {
	public static void main(String arg[])
	{
		Scanner input = new Scanner (System.in);
		int n;
		int a;
		int b;
		int c;
		int d;



		System.out.println("Enter number :");
		n = input.nextInt();

		a=n%10;
		n=n/10;

		b=n%10;
		n=n/10;

		c=n%10;
		n=n/10;

		d=n%10;
		n=n/10;



System.out.println("After reversing number="+a +b +c +d);

		
		
	}

}
