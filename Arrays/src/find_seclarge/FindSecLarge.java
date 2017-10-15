package find_seclarge;

import java.util.Scanner;

public class FindSecLarge {

	public static void main(String[] args) {
		
		
				Scanner in = new Scanner(System.in);
				int arr[] = new int [5];
				int i,j,k,large,small;
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
				
				
				// now printing Second large number
				secLarge = arr[0];
				
				for(j=1;j<5;j++)
				{
					if(arr[j] > secLarge && large > arr[j])
					{
						
					secLarge = arr[j];
					}
				}
				System.out.println("Second large number = "+secLarge);
				
				
				
				small = arr[0];
				for(i=1;i<5;i++)
				        {
					if(small>arr[i])
					    {
						small = arr[i];
						}
					    }
				
				System.out.println("Small is = "+small);
				
				
				
				
				



				


				

			
	}

}
