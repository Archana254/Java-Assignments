//print A to Z(Uppercase)if input is 'U' and then a to z if input is 'L'(Lowercase)
package basic;
import java.util.Scanner;

public class Prg18 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  //int ch;
		Prg18 a=new Prg18();
		
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the character");
		char c=scr.next().charAt(0);
		switch(c) {
		   case 'U':if(c=='U')
		  {
			upperCase(c);
			break;
		  }
		   case 'L':if(c=='L')
			  {
				lowerCase(c);
				break;
			  }
		}
	}
		   //public  static char ch;
			static char upperCase(char c)
			{
				for(c=65;c<=90;++c)
				
					System.out.print(" "+c);
					
				System.out.print("\n");
			return 1;
			}
			static char lowerCase(char c)
			{
				for(c=97;c<=122;++c)
				
					System.out.print(" "+c);

				System.out.print("\n");
				return 1;
			}
		
		}

		
	



