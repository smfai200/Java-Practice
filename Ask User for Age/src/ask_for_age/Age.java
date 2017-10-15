package ask_for_age;

import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		
Scanner input = new Scanner (System.in);
int age;
System.out.println("Enter Your age");
age = input.nextInt();
if(age<18)
{
	System.out.println("Your Kid");
}
else if(age>=18)
{
	System.out.println("Your Teen");
}
else if(age<=30)
{
	System.out.println("Geting old man");
}

else if(age>=60)
{
	System.out.println("You are Too Old Man");
}




	}

}
