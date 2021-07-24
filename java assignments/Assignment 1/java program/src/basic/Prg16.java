//write a code to find second largest of 5 numbers,Assume numbers are unique
package basic;
import java.util.Scanner;

public class Prg16 {
	public static int secondLargest(int[] a,int total)
	{
		int temp;
		for(int i=0;i<total;i++)
		{
			for(int j=1+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[total-2];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,34,56,78,43};
		System.out.println("second largest number"+" "+secondLargest(a,5));
	}

}
