/*print fibonacci series starting with 0 and 1. eg:0,1,1,2,3,5...
a)upto N terms
b)upto term less than N
c)nth term of fibonacci series*/

package basic;
import java.util.Scanner;

public class Prg20 {
	static int t1=0,t2=1,temp;
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner scr=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scr.nextInt();
		fibno(num);
 }
 static int fibno(int num)
 {
		
		for(int i=0;i<=num;i++)
		{
			System.out.print(t1+" ");
			temp=t1+t2;
			t1=t2;
			t2=temp;
		}
		return 1;	
	}
		
 }

