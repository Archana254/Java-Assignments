//Bubble sort Program
package basic3;

public class BuubleSort {
	static void bubbleSort(int[] a)
	{
		int n=a.length;
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(a[j-1]>a[j])
				{
					//swap elements
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a[]= {4,5,2,7,1,8,56,9};
         System.out.println("array before bubblesort");
         for(int i=0;i<a.length;i++)
         {
        	 System.out.print(a[i]+" ");
         }
         System.out.println();
         
         bubbleSort(a);
         
         System.out.println("after bubble sort");
         for(int i=0;i<a.length;i++)
         {
        	 System.out.print(a[i]+" ");
         }
         
         }
	}


