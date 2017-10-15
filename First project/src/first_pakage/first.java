package first_pakage;

import java.util.Scanner;
public class Cal{

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
		int n1,n2,res;
		System.out.println("Enter 1st number:");
		n1 = input.nextInt();

		System.out.println("Enter 1st number:");
		n2 = input.nextInt();
		
		res = n1 + n2;
		System.out.println("Sum = "+res);
		
		res = n1 - n2;
		System.out.println("Subtraction = "+res);
		
		res = n1 * n2;
		System.out.println("Multplication = "+res);
		
		res = n1 / n2;
		System.out.println("Division = "+res);
		
		res = n1 % n2;
		System.out.println("Remainder = "+res);
		
		

	}

}
