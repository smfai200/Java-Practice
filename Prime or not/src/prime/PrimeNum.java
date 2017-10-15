package prime;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	int num,i,prime;
	System.out.println("Enter any number:");
	num = input.nextInt();
	
	for(i=2;i<=num;i++)
	{
		if(num % i == 0)
		{
			break;
		}
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
