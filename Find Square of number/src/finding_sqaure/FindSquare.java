package finding_sqaure;
import java.util.Scanner;
public class FindSquare {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sq,n,cub;
		
		System.out.println("Enter Number to find Sqaure");
		n = input.nextInt();
		sq = n*n;
		System.out.println("\n\nSquare of number="+sq);
		
		
		cub = n*n*n;
		System.out.println("\n\nCube of number="+cub);
		
	}

}
