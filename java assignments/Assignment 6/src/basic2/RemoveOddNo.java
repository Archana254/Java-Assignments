//write a code to remove all odd number from  an integer arraylist
package basic2;
import java.util.*;

public class RemoveOddNo {
	public static void main(String[] args) {
		/*int[] str= {1,2,3,4,5,6,7,8};
		for(int i=0;i<str.length;i++)
		{
			if(str[i]%2==0)
			{
				System.out.print(str[i]+" ");
			}
		}*/
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		System.out.println("before removing odd numbers"+list);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2!=0)
			{
				list.remove(i);
			}				
		}
		System.out.println("after removing odd numbers"+list);
}
}