//write a code to find nth fibonacci number using recursion
package basic3;

public class Fibonacci {
	static int n1=0,n2=1,n3=0;
	static int fibNum(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1||n==2)
		{
			return 1;
		}
		return fibNum(n-2)+fibNum(n-1);
	}
		
			public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNum=10;
		  System.out.print("finonacci series of"+" "+maxNum+" "+"numbers:");
			for(int i=0;i<maxNum;i++) 
			{
				System.out.print(fibNum(i)+" ");
		        }
		}

}	
		