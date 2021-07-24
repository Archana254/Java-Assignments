//Check given number is Armstrong number (153=1^3+5^3+3^3=153)
package basic;
import java.util.Scanner;

public class Prg5 {
	static int c=0,temp,a,num;
	public static void main(String[] args) {	
	    System.out.println("enter the num\n");
		Scanner scr = new Scanner(System.in);
		int num = scr.nextInt();
		armstrongOrNot(num);
	}
		static int armstrongOrNot(int num)
		{
		temp=num;
		while(num!=0)
		{
			a=num%10;
			c=c+(a*a*a);
			num=num/10;
		}
		if(temp==c)
		{
			System.out.println(c+"  "+"armstrong number");}
		
			else {
				
				System.out.println(c+" "+"not armstromg number");
		}
		return 1;
	}		
}

