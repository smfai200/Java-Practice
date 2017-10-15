package fact;
import java.util.Scanner;
public class FactWhile {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int fact=1,i,num;
		System.out.println("Enter any positive number");
		
       num = in.nextInt();
       
       i=num;
       while(i>1)
       {
    	   fact = fact*i;
    	   i--;
       }
       
       
       System.out.println("Fact of number = "+fact);
	}
	
	
	

}
