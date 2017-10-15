package f_to_c;

import java.util.Scanner;
public class Cent {
	public static void main(String args[])
	{
	Scanner input = new Scanner (System.in);
	
	double foren,cent;
	System.out.println("Enter Forenheit");
	foren = input.nextDouble();
	
	cent=(foren-32)*5/9;
	System.out.println("Centigrade="+cent);

	

	}
}
