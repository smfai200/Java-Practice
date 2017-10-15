package ask_student;
import java.util.Scanner;
public class StudentRollNo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int arr[] = new int [100];
		int rollNo,i;
		System.out.println("Enter Your Roll number");
		for(i=0;i<10;i++)
		{
			arr[i] = input.nextInt();
			if(arr[i]%2!=0)
			{
				System.out.println("Please Enter Even Numbers only");
			}
		}
		
		System.out.println("Printing Your Roll Number in Ascending Order");
		for(i=0;i<10;i++)
		{
			System.out.println("Your Roll number in Asceding order="+arr[i]);
		}
		
		
		System.out.println("\nPrinting Your Roll Number in Dscending Order");
		for(i=9;i>=0;i--)
		{
			System.out.println("Your Roll number in Dsceding order="+arr[i]);
		}
		
		
		
		
		
		
		
		

	}

}
