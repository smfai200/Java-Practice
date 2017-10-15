package find_prodct;

import java.util.Scanner;
public class Product {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int a,b,i,res=0;
		System.out.println("Enter value of A= ");
		a = input.nextInt();
		
		
		System.out.println("Enter value of B= ");
	b = input.nextInt();

	for(i=0;i<b;i++)
	{
		res = res+a;
	}
	
	System.out.println("Product of  " +a+ " and " +b+ " = " +res);
	}

}
