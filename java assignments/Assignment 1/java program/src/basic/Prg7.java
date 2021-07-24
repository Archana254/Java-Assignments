/*Write code to print the following pattern:
1
12
123
1234
12345*/
package basic;

public class Prg7 {
	static int i,j,num=4,n;
		static int patternPrg(int num)
		{
		for(i=0;i<=num;i++)
		{
			n=1;
			for(j=0;j<=i;j++)
			{
				System.out.print(n+" ");
				n++;
			}
			System.out.println();
		}
		return 1;
		}

public static void main(String[] args) {
	
	patternPrg(num);
}
}