//given two number,find LCM and HCF/GCD of two numbers
package basic;

import java.util.Scanner;

public class Prg17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scr.nextInt();
		int b=scr.nextInt();
		lcmHcf(a,b);
	}
	static int lcmHcf(int a,int b)
	{
		int temp, x=a;
		int y=b;
		while(b!=0) {
			temp=b;
			b=a%b;
			a=temp;
		}
		int gcd=a;
		int lcm=(x*y)/gcd;
		System.out.println(gcd+" "+"is gcd");
		System.out.println(lcm+" "+"is lcm");		
return 1;
}
}