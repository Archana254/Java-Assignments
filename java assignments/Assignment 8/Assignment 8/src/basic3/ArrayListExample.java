/*create custom arraylist.logic to be useed for dynamic array size.when the array size exceeds,
create a new array internally and copy all elements from old array to new array */
package basic3;

public class ArrayListExample {
	
	private int arr[];
	private int count;
	private int size;
	
	public ArrayListExample(){
		arr=new int[1];
		count=0;
		size=1;
	}
	
	public void add(int data)
	{
		if(count==size)
		{
			growSize();
		}
		arr[count]=data;
		count++;
	}
		
	public void growSize()
	{
		int temp[]=null;
		if(count==size)
		{
			temp=new int[size*2];
			{
				for(int i=0;i<size;i++)
			    temp[i]=arr[i];
			}
		}
	
	arr=temp;
	size=size*2;
}
				
	public void shrinkSize()
	{
		int temp[]=null;
		if(count>0)
		{
			temp=new int[count];
			for(int i=0;i<count;i++)
				temp[i]=arr[i];
		}
		size=count;
		arr=temp;
	}
	
	
	public void addAt(int index,int data)
	{
		if(count==size) {
			growSize();
		}
        for(int i=count-1;i>=index;i--)
        {
        	arr[i+1]=arr[i];
        }
        arr[index]=data;
        count++;
	}
	
	public void remove()
	{
		if(count>0) {
			arr[count-1]=0;
			count--;
		}
	}
	
	public void removeAt(int index)
	{
		if(count>0) {
			for(int i=index;i<count-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[count-1]=0;
			count--;
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample da=new ArrayListExample();
		da.add(1);
		da.add(2);
		da.add(3);
		da.add(4);
		da.add(5);
		System.out.println("elements of array:");
		for(int i=0;i<da.size;i++) {
			System.out.print(da.arr[i]+" ");
		}
		System.out.println();
		System.out.println("size of array:"+da.size);
		System.out.println("no of elements in array:"+da.count);
		da.shrinkSize();
		
		System.out.println("elements of array"+" "+"after shrinkSize of array:");
		for(int i=0;i<da.size;i++)
		{
			System.out.print(da.arr[i]+" ");
		}
		System.out.println();
		System.out.println("size of array:"+da.size);
		System.out.println("no of elements in array:"+da.count);
		
		da.addAt(1,22);
		
		System.out.println("elements of array after"+" "+"add an element at index");
		for(int i=0;i<da.size;i++)
		{
			System.out.print(da.arr[i]+" ");
		}
		System.out.println();
		System.out.println("size of array:"+da.size);
		System.out.println("no of elements in array:"+da.count);
		
		da.remove();
		
		System.out.println("elements of array after"+" "+"delete last element");
		for(int i=0;i<da.size;i++)
		{
			System.out.print(da.arr[i]+" ");
		}
		System.out.println();
		System.out.println("size of array:"+da.size);
		System.out.println("no of elements in array:"+da.count);
		
		da.removeAt(1);
		
		System.out.println("elements of array after"+" "+"delete element at index 1");
		for(int i=0;i<da.size;i++)
		{
			System.out.print(da.arr[i]+" ");
		}
		System.out.println();
		System.out.println("size of array:"+da.size);
		System.out.println("no of elements in array:"+da.count);
	
		}

	}


