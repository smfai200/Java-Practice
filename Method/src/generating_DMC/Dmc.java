package generating_DMC;

public class Dmc {
	
	public static void dmc(int a,int b,int c,int d)
	{
		int obtMarks;
		double per;
		int total = 400;
		System.out.println("Paper 1 Marks = "+a);
		System.out.println("Paper 2 Marks = "+b);
		System.out.println("Paper 3 Marks = "+c);
		System.out.println("Paper 4 Marks = "+d);
		obtMarks = a+b+c+d;
		per = (obtMarks/total)*100;
	
		System.out.println("Obtained Marks = "+obtMarks);
		System.out.println("Obtained Percatange = "+per);
	
		
		
		
		
		
	}

	public static void main(String[] args) {
		
		Dmc obj = new Dmc();
		obj.dmc(90, 70, 80, 60);
	}

}
