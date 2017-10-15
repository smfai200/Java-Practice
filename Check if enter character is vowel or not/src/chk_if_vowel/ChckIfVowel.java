package chk_if_vowel;

import java.util.Scanner;
public class ChckIfVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);

char vowel;
System.out.println("Enter any character");
vowel = input.next().charAt(0);
switch(vowel)
{
case 'a':
case 'A':
case 'e':
case 'E':
case 'i':
case 'I':
case 'o':
case 'O':
case 'u':
case 'U':
	
	System.out.printf("%c is Vowel",vowel);
	break;
	default:
	System.out.printf("%c is not Vowel",vowel);
	
	
}
	
	


	}

}
