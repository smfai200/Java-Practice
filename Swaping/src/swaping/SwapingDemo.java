package swaping;
import java.util.Scanner; 
public class SwapingDemo {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in); // input is object for Scanner u can use anything here 
		int a,b;
		
		System.out.println("Enter value of a=");
		a = input.nextInt();
		
		
		System.out.println("Enter value of b=");
		b = input.nextInt();
		
		a= a*b;
		b = a/b;
		a = a/b;
		System.out.println("Value after swaping a = "+a);
		
		System.out.println("Value after swaping b = "+b);
		
		
	}

}
