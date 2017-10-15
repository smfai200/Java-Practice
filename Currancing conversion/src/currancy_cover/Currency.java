package currancy_cover;

import java.util.Scanner;
public class Currency {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double rrate,drate,dollar,rupees;
		
		System.out.println("Enter rate of ruppes");
		rrate = input.nextDouble();
		
		System.out.println("Enter rate of Dollar");
		drate = input.nextDouble();
		
		
		
		System.out.println("From Rupees to Dollar");
		dollar = rrate*drate;
		System.out.println("Dollar="+dollar);
		
		rupees = drate/rrate;
		System.out.println("From Dollar to rupees");
		System.out.println("rupees+"+rupees);
		
		

		
		
		
		
		
		

	}

}
