/*write a code to shift all zeros of an array to the end of the array
1.using another array
2.without using another array  ex:{1,0,2,0,0,3}should become {1,2,3,0,0,0}*/
package basic2;

public class ShiftZeros {
	static void pushZerosToEnd(int arr[],int n)
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
		pushZerosToEnd(arr,n);
		System.out.println("array after pushing zeros to the end");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
		
		
	}

}
