package basic2;

public class Pattern6 {

	static int i,j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		patternPrint(n);
	}
	
static public void patternPrint(int n)
{
	for(i=1;i<=n;i++)
	{ 
		 //inner loop for space
		 for(j=n-i;j>=1;j--)
		 {
			 System.out.print(" "); //print space between two numbers
			 
		 }
		 //inner loop for columns
		 for(j=1;j<=i;j++)
		 {
		System.out.print(i+" ");	 //spacing between rows
	     }
		 System.out.println();
	}
}
}






