//find average of five numbers
package basic;
import java.util.Scanner;

public class Prg8 {
	static int n,count=1,num;
	static float aF,avgF,sumF=0;
	public static void main(String[] args) {
		System.out.println("enter the num");
		Scanner scr = new Scanner(System.in);
		int n= scr.nextInt();
		avgOfNum(n);
	}
	static float avgOfNum(int n)
		{
		    while(count<=n)
		{
			System.out.println("enter the"+count+"num");
			Scanner scr = new Scanner(System.in);
			aF=scr.nextInt();
			sumF+=aF;
			count++;
		}
		avgF=sumF/n;
		System.out.println("the average is:"+avgF);
		return avgF;
}

}

