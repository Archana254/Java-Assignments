//Find the second largest of an int array
package basic3;

public class LargestNum {
	static int secondMaxValue(int[] a,int n) {
		int temp;
		for(int i=0;i<n;i++)
	    {
			for(int j=i+1;j<n;j++)
			{
	    	      if(a[i]>a[j])
	    	    {
	    	    	  temp=a[i];
	    	    	  a[i]=a[j];
	    	    	  a[j]=temp;
	    	    }
	    	}
	    }
	    	return a[n-2];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {24,65,78,95,56};
		int n=a.length;
		System.out.println(secondMaxValue(a,n));

	}

}



