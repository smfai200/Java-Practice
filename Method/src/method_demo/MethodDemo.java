package method_demo;

import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b,res;
		
	System.out.println("Enter Value of A=");
	a = in.nextInt();
	
	System.out.println("Enter Value of B=");
	b = in.nextInt();
	
		Cal(a,b);
		
		}
	
	public static void Cal(int a, int b)
	{
	System.out.println("Sum = "+(a+b));
	System.out.println("Subtraction = "+(a-b));
	System.out.println("Multplication = "+a*b);
	System.out.println("Division = "+(a/b));
		
	}

}
