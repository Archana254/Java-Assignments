//find the average,min,max of an int array
package basic3;

public class FindAvg {
	static double average(int[] a,int n) {
		int sum=0,i,average;
		for(i=0;i<n;i++)
	    {
	    	sum+=a[i];
	    }
	    	average=sum/n;
	    return average;
	}	
	static int maxValue(int[] a,int n) {
		int max=a[0];
		for(int i=0;i<n;i++)
	    {
	    	if(a[i]>max)
	    	{
	    		max=a[i];
	    	}
	    }
	    	return max;
	    }
	 	
	static int minValue(int[] a,int n) {
		int min=a[0];
		for(int i=0;i<n;i++)
	    {
			if(a[i]<min)
	    	{
	    		min=a[i];
	    	}
	    }
	    	return min;
	    }
	   
	 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] a= {5,10,1,56,34};
    int n=a.length;
   System.out.println("average of int array="+average(a,n)); 
   System.out.println("average of int array="+maxValue(a,n)); 
   System.out.println("average of int array="+minValue(a,n)); 
	}	
}
