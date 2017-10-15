package alternate_in_array;

import java.util.Scanner;
public class Alternate {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int arr[]= new int [100];
int i,j;
System.out.println("Enter 10 integer");
		for(i=0;i<10;i++)
		{
			
			arr[i] = input.nextInt();
		}
		for(j=0;j<10;j+=2)
		{
			
			System.out.println("Alternate elements are:"+arr[j]);
		}
		
	}

}
