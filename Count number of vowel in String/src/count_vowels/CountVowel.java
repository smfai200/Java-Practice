package count_vowels;
import java.util.Scanner;
public class CountVowel {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	char vowel;
	String a;
	char vow=0;
	int counter= 0;
	System.out.println("Enter a string");
	a = input.nextLine();
	if(vow== 'a' || vow == 'A')
	{
		counter++;
	}
	System.out.printf("%c is is %d time ",vow,counter);

	
	
	}

}
