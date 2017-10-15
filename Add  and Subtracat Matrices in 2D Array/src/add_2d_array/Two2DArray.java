package add_2d_array;

import java.util.Scanner;

public class Two2DArray {

	public static void main(String[] args) {
		
Scanner input = new Scanner (System.in);

int arr1[][] = new int [3][3];
int arr2[][] = new int [3][3];
int sum[][] = new int [3][3];
int sub[][] = new int [3][3];
int i,j;

System.out.println("Enter Member into 1st array:");
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		arr1[i][j] = input.nextInt();
	}
}


System.out.println("Enter Member into 2nd array:");
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		arr2[i][j] = input.nextInt();
	}
}




for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		sum[i][j] = arr1[i][j] + arr2[i][j];
	}
}
System.out.println("Addition of array=\n");

for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		System.out.printf(+sum[i][j] + " " );
	}
	System.out.println("\n");
}



for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		sub[i][j] = arr1[i][j] - arr2[i][j];
	}
}
System.out.println("Subtraction of array=\n");

for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		System.out.printf(+sub[i][j] + " " );
	}
	System.out.println("\n");
}












	}

}
