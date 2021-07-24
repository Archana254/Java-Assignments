package basic2;

public class Pattern4 {

	static int i,j,n=5,num;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patternPrint(n);
	}
	
static public int patternPrint(int n)
{
    num=6;
	for(i=1;i<=n;i++)
	{ 
		 for(j=1;j<=i;j++)
		 {
			 System.out.print(num-i+"");
			 ;
			 
		 }
		System.out.println();	 //spacing between rows
	}
	return 1;
}
}


