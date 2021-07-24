//given length of 3 sides,check if triangle can be constructed
package basic;
import java.util.Scanner;

public class Prg14 {
	public static int checkValidity(int a,int b,int c)
	{
		if(a+b<=c||a+c<=b||b+c<=a)
		{
			return 0;}
			else {
				return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scr.nextInt();
		int b=scr.nextInt();
		int c=scr.nextInt();
		if((checkValidity(a,b,c)==1))
		{
			System.out.println("valid");
		}else {
			System.out.println("notvalid");
		}
	}
}
