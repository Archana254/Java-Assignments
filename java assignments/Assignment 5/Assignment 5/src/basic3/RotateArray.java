//write a code to rotate an array
package basic3;

public class RotateArray {

	static void leftRotate(int a[],int d,int n)
	{
		int i;
		for(i=0;i<d;i++)
		{
			leftRotateByOne(a,n);
		}
	}
	static void leftRotateByOne(int a[],int n)
	{
		int temp,i;
		
		for(i=0;i<n-1;i++)
		{
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
	
	}
	static void display(int a[],int n)
	{
	for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RotateArray r=new RotateArray();
		int a[]= {3,2,4,1,5,6,7};
		r.leftRotate(a,2,7);
		r.display(a,7);
		r.leftRotateByOne(a,7);
		

	}

}
