package swpng_2;

import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int a,b;
		System.out.println("Enter value a=");
		a = input.nextInt();
		
		System.out.println("Enter value b=");
		b = input.nextInt();
		
		System.out.println("Value beforer swapping ");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("Value After swapping ");
		System.out.println("A= "+a);
		System.out.println("B= "+b);
		
		



	}

}
