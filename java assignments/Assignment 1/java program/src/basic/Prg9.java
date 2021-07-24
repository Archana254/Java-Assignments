//Given a character, check if it is a vowel or a consonant.
package basic;
import java.util.Scanner;

public class Prg9 {
	static char ch;
	public static void main(String[] args) {
		System.out.println("enter the character\n");
		Scanner scr = new Scanner(System.in);
		char ch = scr.next().charAt(0);
		vowelOrNot(ch);	
	}
	static char vowelOrNot(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
		System.out.println(ch+" "+"is vowel");
		}
		else
		{
			System.out.println(ch+" "+"is consonant");
		}
	return 1;

}
}
