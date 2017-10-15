package prime_while_loop;

import java.util.Scanner;

public class PrimeDemo {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		int num,i,prime;
		System.out.println("Enter any number:");
		num = input.nextInt();
		i=2;
		while(i<=num)
	
		{
			if(num % i == 0)
			{
				break;
			}
			i++;
		}
		
		if(num == i)
		{
			System.out.println("Number is prime");
			
		}
		else{
			System.out.println("Number is not prime");
		}
		

	}

}
