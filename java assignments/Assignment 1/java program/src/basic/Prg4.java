package basic;
import java.util.Scanner;

public class Prg4 {
	public static void main(String[] args) {	
		int a,b,c;
		System.out.println("enter the num");
		Scanner scr = new Scanner(System.in);
		a = scr.nextInt();
	    b = scr.nextInt();
		c = scr.nextInt();
	     smallestNum(a,b,c);
	}
	static int smallestNum(int a,int b,int c)
	{
		 if(a<b && a<c)
		 {
		  System.out.println("a is smallest");
		 }else
			 if(b<a && b<c)
			 {
				 System.out.println("b is smallest");
			 }else {
				 System.out.println("c is smallest");
			 }
	
	return 1;
	}

}
