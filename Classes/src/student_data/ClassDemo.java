package student_data;

import java.util.Scanner;

public class ClassDemo {

	public static void main(String[] args) {

Scanner in = new Scanner (System.in);
int i,n;
System.out.println("Enter Size of Array");
n = in.nextInt();
int a[] = new int[n];
int pos=0;
int ans[] = new int[5];
System.out.println("Enter " +n+ " Element into array");
for(i=0;i<3;i++)
{
	System.out.println("a["+i+"]=");
	a[i] = in.nextInt();
}
System.out.println("Enter arr position on which u want to delete number");
pos = in.nextInt();
for(i=pos+1; i<n-1;i++)
{
	a[i+1]=a[i];
	
}
n--;

System.out.println("After del array is");
for(i=0;i<n;i++)
{
	System.out.println("a["+i+"]="+a[i]);
	
}


	}

}
