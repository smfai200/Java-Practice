package add_digits;

import java.util.Scanner;
public class AddDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
int n,sum=0,remainder;
System.out.println("Enter any Number ");
n = input.nextInt();
while(n!=0)
{
	remainder = n%10;
	sum = sum + remainder;
	n = n/10;
}
System.out.println("Sum ="+sum);

		
		
		
		
		
		
		
	}

}
