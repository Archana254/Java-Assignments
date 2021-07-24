//check given number is even or odd
package basic;
import java.util.Scanner;

public class Prg1 {
	static int evenOrOdd(int num)
	 {
		if(num%2==0)
		 {
		   System.out.println(num+" "+"even number");
		 }
		else 
		{
		   System.out.println(num+" "+"odd number");
	    }
		return 1;
	 }

public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the num");
		int num = scr.nextInt();
		evenOrOdd(num);
	}
	}
	