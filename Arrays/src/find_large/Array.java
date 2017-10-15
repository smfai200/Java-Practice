package find_large;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int [50];
		int i,large,small;
		int secLarge,secSmall;
		for(i=0;i<5;i++)
		{
			System.out.print("arr["+i+"]=");
			arr[i] = in.nextInt();
		}
		
		large = arr[0];
		

		for(i=1;i<5;i++)
		        {
			if(large<arr[i])
			    {
				large = arr[i];
				}
		        }
			
		
		
		System.out.println("large is = "+large);
		
		
		small = arr[0];
		for(i=1;i<5;i++)
		        {
			if(small>arr[i])
			    {
				small = arr[i];
				}
			    }
		
		System.out.println("Small is = "+small);
		
		// now printing Second large number
		secLarge = arr[0];
		
		for(i=1;i<5;i++)
		{
			if(secLarge > arr[i] &&  large>secLarge)
				secLarge = arr[i];
		}
		System.out.println("Second large number = "+secLarge);
		
		



		


		

	}

}
