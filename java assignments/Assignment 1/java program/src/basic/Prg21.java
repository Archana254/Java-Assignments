//check given year is leap year or not
package basic;
import java.util.Scanner;

public class Prg21 {
	static int leapYear(int year)
	{
		if((year%4==0)&&(year%100==0)||(year%400==0))
		{
			System.out.println(year+" "+"is leap year");
		}
			else
			{
				System.out.println(year+" "+"is not a leap year");
			
		}
           return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the year");
		int year=scr.nextInt();
		leapYear(year);
	}
	


}
