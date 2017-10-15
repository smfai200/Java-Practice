package find_larg_small;
import java.util.Scanner;
public class FindLargestAndSmallest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int a,b,c;
		System.out.println("Enter value of a=");
		a = input.nextInt();
		
		System.out.println("Enter value of b=");
		b = input.nextInt();
		
		
		System.out.println("Enter value of c=");
		c = input.nextInt();
		
		if(a<b && a<c)
		{
			System.out.println("A is Smallest");
			
			
		}
		if(b<a && b<c)
		{
			System.out.println("B is Smallest");
		}
		
		if(c<a && c<b)
		{
			System.out.println("C is Smallest");
		}
		
		if(a>b && a>c)
		{
			System.out.println("And A is Greater");
		}
		if(b>a && b>c)
		{
			System.out.println("And B is Greater");
		}
	if(c>a && c>b)
	{
		System.out.println("And C is Greater");
	}
		
		
		
	}

}
