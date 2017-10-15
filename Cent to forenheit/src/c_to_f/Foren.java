package c_to_f;

import java.util.Scanner;
public class Foren {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		double cent,foren;
		
		System.out.println("Enter Centigrade");
		cent = input.nextDouble();	
		
		

		foren= cent * 1.8 + 32;
		System.out.println("Fohreheit="+foren);
	}

}
