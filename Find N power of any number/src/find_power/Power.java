package find_power;

import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int power,num,i;
		int res=1;
		System.out.println("Enter Any Number");        // taking number from user
		num = input.nextInt();
		
		
		System.out.println("Enter a power of number");  // asking user to enter power of number
		power = input.nextInt();
		
		for(i=1;i<=power;i++) 
		{
			res = res * num; 
		}
		System.out.printf("Result = "+res);
		
		
		
	}

}
