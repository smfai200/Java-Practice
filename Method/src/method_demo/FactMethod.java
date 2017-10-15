package method_demo;

import java.util.Scanner;

public class FactMethod {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int num;
		System.out.println("Enter any number:");
		num = in.nextInt();
		
		
		Fact(num);
	}
	
	public static void Fact(int num)
	{
		int i;
		
		int fact=1;
		for(i=num;i>0;i--)
		{
			fact = fact*i;
		}
		System.out.println("Fact ="+fact);
	}

}
