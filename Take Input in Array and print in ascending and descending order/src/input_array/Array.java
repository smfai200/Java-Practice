package input_array;
import java.util.Scanner;
public class Array {
	public static void main(String[] args)
	{
	Scanner input = new Scanner (System.in);
	int arr[] = new int [100];
	int i,j;
	System.out.println("Enter Element into Array");
    for(i=0; i<10;i++)
    {
    	arr[i] = input.nextInt();
    }
	
	System.out.println("\n\nPrinting Numbers in Ascending Order");
	for(i=0;i<10;i++)
	{
		System.out.println(+arr[i]);
	}
	
	
	System.out.println("\n\nPrinting Numbers in Dscending Order");
	for(j=9;j>=0;j--)
	{
		System.out.println(+arr[j]);
	}
	
	
	
	
}
}
