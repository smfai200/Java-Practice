package assigment_coach;

public class Method {

	public static void minMax(int a, int b) // for min max
	{
		if(a>b)
		{
			System.out.println(a+" is greater");
		}
		else{
			System.out.println(b+" is greater");
		}
		
	}
	public static void main(String[] args) {
		
		Method obj = new Method();
		obj.minMax(2, 3);
		
	}

}
