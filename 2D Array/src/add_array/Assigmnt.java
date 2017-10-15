package add_array;

import java.util.Scanner;

public class Assigmnt {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i,j,k;
		double avg[] = new double [10];
		int a[][] = new int [5][3];
		int ans[] = new int [10];
		System.out.println("Enter value into 2D ARRAY");
		for(i=0;i<5;i++)
    
		{
			for(j=0;j<3;j++)
			{
		System.out.println("a["+i+"]["+j+"]=");
		a[i][j] = in.nextInt();
	
		
}
	
}
		
	
		for(i=0;i<5;i++)
		{
			for(j=0;j<3;j++)
			{
				ans[i] = ans[i] + a[i][j];
				avg[i] = ans[i]/3;
			}
			System.out.println("\nSum in a["+i+"]=" +ans[i]);
			System.out.println("\nAvr in a["+i+"]=" +avg[i]);
			
			
		}
		
		
	
		
		

	}

}
