//find area of square and rectangle
package basic;
import java.util.Scanner;

public class Prg11 {
 static int area,l,b,a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the length\n");
		Scanner scr = new Scanner(System.in);
		int a = scr.nextInt();
		areaSqu(a);
		int l = scr.nextInt();
		int b = scr.nextInt();
		areaRect(l,b);
	}
	static int areaSqu(int a)
	{
		area=a*a;
		System.out.println(area);
		return area;
	}
	static int areaRect(int l,int b)
	{
		area=l*b;
		System.out.println(area);
		return area;
	}

}
