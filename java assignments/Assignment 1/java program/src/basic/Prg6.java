//print factors of all given number
package basic;
import java.util.Scanner;

public class Prg6 {
	static int num,fact=1;
	static int factorial(int num)
	{
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;	
	}
	/*static int fact(int num) //another method
	{
		if(num!=0) {
		return  num*fact(num-1);
		}else {
			return 1;
	}*/
	
	public static void main(String[] args) {	
			System.out.println("enter the num");
			Scanner scr = new Scanner(System.in);
			int n = scr.nextInt();
			System.out.println(Prg6.factorial(n));
			//System.out.println(Prg6.fact(n));
			
			
	}
}
