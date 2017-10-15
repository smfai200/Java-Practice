package add_n;

import java.util.Scanner;
public class AddNNumbers {

	public static void main(String[] args) {
	
Scanner input = new Scanner (System.in);
int arr[] = new int [10];

int sum=0;
int i;

System.out.println("Enter Members into 1st array");
for(i=0;i<5;i++)
{
	arr[i] = input.nextInt();
	sum = sum + arr[i];
	
}
System.out.println("Sum = "+sum);






	}

}
