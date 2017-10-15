package fact;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int i,fact=1,n;
		System.out.println("Enter any positive number");
		n = input.nextInt();
			
			for(i=n;i>0;i--)
			{
				fact=fact*i;
				
			}
			System.out.println("Fact="+fact);
		

	}

}
