package pos_neg;
import java.util.Scanner;
public class PosNeg {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int n;
		System.out.println("Enter any number");
		n = input.nextInt();
		if(n>=0)
		{
			System.out.println("Number is positive");

		}
		else
		{
			System.out.println("Number is Negative");

		}

	}

}
