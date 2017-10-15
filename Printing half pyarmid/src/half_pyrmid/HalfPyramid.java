package half_pyrmid;

import java.util.Scanner;

public class HalfPyramid {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i,j,n;
		System.out.println("Enter star u want to print");
		n = in.nextInt();
	
		for(i=0;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
	}

}
