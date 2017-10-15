package swtich;
import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int a,b,c;
		char oper;
		System.out.println("Enter 1st value:");
		a = input.nextInt();
		
		System.out.println("Enter 2nd value:");
		b = input.nextInt();
		
		System.out.println("Enter Your Choice");
		oper = input.next().charAt(0);
		
		switch(oper)
		{
		case '+':
				c = a+b;
		System.out.println("Sum = "+c);
		break;
		
		case '-':
				c = a-b;
		System.out.println("Subtraction = "+c);
		break;
		
		case '*':
				c = a+b;
		System.out.println("Multplication = "+c);
		break;
		
		case  '/':
				c = a/b;
		System.out.println("Division = "+c);
		break;
		default:
			System.out.println("Please Enter the right operator");
		
		
		
		
		}

	}

}
