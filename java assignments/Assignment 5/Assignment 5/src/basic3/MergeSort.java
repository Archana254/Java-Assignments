package basic3;

public class MergeSort {
	static void merge(int a[],int start,int mid,int end)
	{
		int left=mid-start+1;
		int right=end-mid;
		
		int LeftArray[]=new int[left];
		int RightArray[]=new int[right];
		
		for(int i=0;i<left;++i)
			LeftArray[i]=a[start+i];
		
		for(int j=0;j<right;++j)
			RightArray[j]=a[mid+1+j];
		
		int i=0,j=0;
		int k=start;
		
		while(i<left&&j<right)
		{
			if(LeftArray[i]<=RightArray[j])
			{
				a[k]=LeftArray[i];
				i++;
			}
		     else
		    {
			    a[k]=RightArray[j];
			    j++;
		    }
			    k++;
		    }
		while(i<left)
		{
			a[k]=LeftArray[i];
			i++;
			k++;
		}
		
		while(j<right)
		{
			a[k]=RightArray[j];
			j++;
			k++;
		}
	}
		
		void sort(int a[],int start,int end)
		{
			if(start<end)
			{
				int mid=(start+end)/2;
				sort(a,start,mid);
				sort(a,mid+1,end);
				merge(a,start,mid,end);
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,9,4,6,7,8};
		MergeSort ms=new MergeSort();
		ms.sort(a,0,a.length-1);
		System.out.println("\n sorted array");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		}

}
