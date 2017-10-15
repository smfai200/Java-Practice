package grade_finding;
import java.util.Scanner;
public class GradeFinding {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		char gradeInput;
		int counterA=0,counterB=0,i;
		for(i=0;i<10;i++)
		{
			System.out.printf("Enter Grade of student %d=",i+1);
			gradeInput = input.next().charAt(0);
			if(gradeInput == 'A' || gradeInput == 'a')
			{
				counterA++;
			}
			
			if(gradeInput == 'B' || gradeInput == 'B' )
			{
				counterB++;
			}
			else
			{
				System.out.println("Enter A and B only");
			}
			
			
		}
		System.out.println("Number of A Grade ="+counterA);
		System.out.println("Number of B Grade ="+counterB);

		
		if(counterA>=7)
		{
			System.out.println("Your Class is Good ");
		}
		if(counterA>8)
		{
			System.out.println("Your Class is Briliant");
		}
		if(counterA<=2)
		{
			System.out.println("Your Class is Poor");
		}
		
		
	}

}
