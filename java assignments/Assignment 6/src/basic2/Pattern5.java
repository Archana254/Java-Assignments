package basic2;

public class Pattern5 {

	static int i,j,n=5,space=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		patternPrint(n);
	}
	
static public void patternPrint(int n)
{   
	/*space=n-1;
	for(j=1;j<=n;j++)
	{
		 for(i=1;i<=space;i++)
		 {
			 System.out.print(" ");
		 }
		 space--;
		 for(i=1;i<=2*j-1;i++)
		 {
			 System.out.print("*");
		 }
		System.out.println(" ");	 
	}
	space=1;
	for(j=1;j<=n-1;j++)
	{
		for(i=1;i<=space;i++)
		{
			System.out.print(" ");
		}
		space++;
		for(i=1;i<=2*(n-j)-1;i++)
		{
			System.out.print("*");
		}
		System.out.println(" ");
	}
		}*/
	for(i=0;i<n;i++)
	{
		for(j=n-i;j>1;j--)
			{
			System.out.print(" ");
			}
		for(j=0;j<=i;j++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
    }
	
	for(i=0;i<=n-1;i++)
    {
	    for(j=0;j<=i;j++)
	  {
		System.out.print(" ");
	  }
	for(int k=0;k<=n-1-j;k++)
	{
		System.out.print("*"+" ");
	}
	     System.out.println();
     }
    }
	}


