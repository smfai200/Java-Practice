package abolute_number;
import java.util.Scanner;
public class AbsoluteNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int num;
		System.out.println("Enter any number:");
		num = input.nextInt();
		
		if(num<0)
		{
			num = -1*num;
		
			System.out.printf("Absoulte number= %d",num);
		}
		else{
			System.out.println("Aboslute number = "+num);
		}
		
		
		
	}

}
