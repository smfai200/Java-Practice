package find_x_y_quadrands;
import java.util.Scanner;
public class FindQudrant {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int x,y;
		System.out.println("Enter Value of X=");
x = input.nextInt();


System.out.println("Enter Value of Y=");
y = input.nextInt();


if(x>=0 && y>0)
{
	System.out.println("This is 1st Quadrant");
}

if(x<0 && y>=0)
{
	System.out.println("This is 2nd  Quadrant");
}



if(x<0 && y<0)
{
	System.out.println("This is 3rd Quadrant");
}



if(x>=0 && y<0)
{
	System.out.println("This is 4th Quadrant");
}





	}

}
