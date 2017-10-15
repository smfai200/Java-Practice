package prime_printing;
import java.util.Scanner;
public class PrintPrint {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		 int  primecounter, j;
		    
		   
		    for(primecounter=2;primecounter<=100;primecounter++){
		    	
		        for(j=2;primecounter%j!=0;j++);
		        
		        if(j==primecounter){
		            System.out.print("\t"+primecounter);
		           
		        }
		    }

		


		
		
		

	}

}
