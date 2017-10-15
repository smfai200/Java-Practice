package coching_assigmtn2;

import java.util.Scanner;

public class Dmc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String name;
		int rollNo;
		float per;
		int s1,s2,s3,s4,obt=0,total=400;
		System.out.println("Enter Your name:");
		name = input.next();
		
		System.out.println("Enter your Roll No=");
	     rollNo = input.nextInt();
		
		System.out.println("Enter your Subject 1 Marks");
		s1 = input.nextInt();
		
		System.out.println("Enter your Subject 2 Marks");
		s2 = input.nextInt();
		
		
		System.out.println("Enter your Subject 3 Marks");
		s3 = input.nextInt();
		
		System.out.println("Enter your Subject 4 Marks");
		s4 = input.nextInt();
		
		obt = s1+s2+s3+s4;
		
		System.out.println("Your obtained marks in s1="+s1);
		System.out.println("Your obtained marks in s2="+s2);
		System.out.println("Your obtained marks in s3="+s3);
		System.out.println("Your obtained marks in s4="+s4);
		System.out.println("Your Obtained ="+obt);
		
		per = obt/total*100;
		
	
		
		System.out.println("Your Per ="+per);
		
		
		
		
		
		
		

	}

}
