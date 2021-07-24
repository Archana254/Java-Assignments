//check given character is alphabet or not
package basic;
import java.util.Scanner;

public class Prg19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the character");
		char ch=scr.next().charAt(0);
		alphaOrNot(ch);
	}
	static char alphaOrNot(char ch)
	{
		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
		{
			System.out.println(ch+" "+"is an alphabet");
		}
			else
			{
				System.out.println(ch+" "+"is not an alphabet");
		}
return 1;
}
}