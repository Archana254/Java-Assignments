package basic2;

public class Pattern3 {
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
		 for(j=2*(n-i);j>=0;j--)
		 {
			 System.out.print(""); //print space between two numbers
			 
		 }
		 //inner loop for columns
		 for(j=1;j<=n-i;j++)
		 {
		System.out.print(" ");	 //spacing between rows
	     }
		 for(int k=1;k<=i;k++)
		 {
			 System.out.print(i+"");
		 }
		 System.out.println();
	}
}
}





