//find greatest of 3 number
package basic;
import java.util.Scanner;

public class Prg3 {
	static int a,b,c;
	public static void main(String[] args) {	
		System.out.println("enter the num");
		Scanner scr = new Scanner(System.in);
		int num=scr.nextInt();
		 a = scr.nextInt();
	     b = scr.nextInt();
		 c = scr.nextInt();
		greatestNum(a,b,c);
	}
	static int greatestNum(int a,int b,int c)
	{
		if(a>b && a>c)
		 {
		  System.out.println("a is greater");
		 }else
			 if(b>a && b>c)
			 {
				 System.out.println("b is greater");
			 }else
			 {
				 System.out.println("c is greater");
			 }
	return 1;
	}

}
