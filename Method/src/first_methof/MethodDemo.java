package first_methof;

public class MethodDemo {
	
	
	public static void fact(int num) // Method for factorial of number
	{
		int fact = 1,i;
		for(i=num;i>0;i--)
		{
			fact = fact*i;
		}
		System.out.println("Fact = "+fact);
		
		}
	
	
	public static void reverse(int num){ // Method for reverse of number
		int a,b,c,d;
		a = num%10;
		num= num/10;
		
		b = num%10;
		num= num/10;
		
		
		c = num%10;
		num= num/10;
		
		
		d = num%10;
		num= num/10;
		
		System.out.println("Reverse of =" +a+b+c+d);
		}
	
	// Method for Table 
	public static void table(int num)
	{
		int i,res;
		for(i=1;i<=10;i++)
		{
			res = num*i;
			System.out.println(num+"*"+i+"="+res);
	}
	}
	
	//

	public static void main(String[] args) {
		MethodDemo obj = new MethodDemo();
		
obj.fact(5);
obj.reverse(4321);
obj.table(7);

	}

}
