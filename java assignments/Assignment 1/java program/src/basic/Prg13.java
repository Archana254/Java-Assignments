//check if number is divisible by a)2 b)3 c)5 d)9
package basic;
import java.util.Scanner;
public class Prg13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number");
		num=scr.nextInt();
		divisible(num);
	}
	static int divisible(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+"number is divisible by two");
		}else
			if(num%3==0) {
				if(num%9==0) {
					System.out.println(num+"number is divisible by nine");
				}
				System.out.println(num+"number is divisible by three");
			}else
				if(num%5==0) {
					System.out.println(num+"number is divisible by five");
				}
			return 1;		
	}

}
