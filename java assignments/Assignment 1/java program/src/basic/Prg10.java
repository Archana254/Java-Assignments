//Print multiplication table upto N
package basic;
import java.io.*;
import java.util.Scanner;

public class Prg10 {
	static int num,i,n;
	public static void main(String[] args) {
		
		System.out.println("enter the num");
		Scanner scr = new Scanner(System.in);
		int num= scr.nextInt();
		multiTable(num);
		
	}
	static int multiTable(int num) {
		
		for(int i=1;i<=10;i++)
		{
		System.out.println(num+"*"+i+"="+num*i);
		}
		return 1;
	
	}

}
