package rever_2d;

import java.util.Scanner;

public class Rever2DArray {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int i,j;
	int arr[][] = new int [3][3];
	System.out.println("Enter Member in to 3x3 Array:");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			
			arr[i][j] = in.nextInt();
			
		}
	}
	
	System.out.println("Mirror Array is");
	for(i=0;i<3;i++)
	{
		for(j=3-1;j>=0;j--)
		{
			System.out.print(arr[i][j]+"\t");
			
		}
		System.out.println(" ");
	}
	
	

}
}
