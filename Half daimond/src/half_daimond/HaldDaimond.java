package half_daimond;

public class HaldDaimond {

	public static void main(String[] args) {
		
		// first we have to take three integers soo
		int i,j,k;
		for(i = 0 ; i<5 ; i++)
		{
			for(j = 1 ; i<5-i; j ++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		
		
		
	}

}
