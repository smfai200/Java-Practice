package daimond;

import java.util.Scanner;
public class Daimond {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n;
		int i,j,k;
		
		

System.out.print("Enter number of rows u want to printf ");
n = input.nextInt();
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		// Printing the reverse side of daimond
		
		for(i=n;i>0;i--)
		{
			for(j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.printf("\n");
		}
		
		
		
		

	}

}
