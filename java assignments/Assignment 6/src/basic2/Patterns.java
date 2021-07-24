package basic2;

public class Patterns {
	static int i,j,n=5,num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patternPrint(n);
	}
	
static public int patternPrint(int n)
{
	for(i=1;i<=n;i++)
	{
		 num=1;
		 for(j=1;j<=i;j++)
		 {
			 System.out.print(num+" ");
			 num++;
		 }
		System.out.println();	 
	}
	return 1;
}
}


