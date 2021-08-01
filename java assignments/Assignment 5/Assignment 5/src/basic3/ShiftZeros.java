/*write code to shift all zeros in an int array to the end 
 * a)using additional array 
 * b) without using additional array or Arraylist*/
 
package basic3;

public class ShiftZeros {
	
	//without using additional array or Arraylist
	public static void shiftZerosToEnd(int arr[],int n)
	{
		int count=0,temp;
		 for(int i=0;i<n;i++)
		 {
			 if(arr[i]!=0)
			 {
				 temp=arr[count];
				 arr[count]=arr[i];
				 arr[i]=temp;
				 count=count+1;
			 }
			
		 }
		 
	}
	public static void main(String[] args) {
		int arr[]={1,0,3,0,0,2};
		int n=arr.length;
		shiftZerosToEnd(arr,n);
		System.out.println("array after pushing zeros to the end");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
		
	}

}
