package even_odd;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n;
		System.out.println("Enter any number");
		n = input.nextInt();
		if(n%2==0)
		{
			System.out.println("Number is Even");
		}
		else 
		{
			System.out.println("Number is Odd");
			
		}
				
		
		
	}

}
