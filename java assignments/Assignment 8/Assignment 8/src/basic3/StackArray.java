//custom stack using array
package basic3;
import java.util.EmptyStackException;

public class StackArray {
	
	private int arr[];
	private int size;
	private int index=0;
	
public StackArray(int size)
{
	this.size=size;
	arr=new int[size];
}
	
	
public void push(int element)
{
	if(isFull()) {
		throw new StackOverflowError("stack overflow");	
	}
	arr[index]=element;
	index++;	
}

public int pop()
{
	if(isEmpty()) {
		throw new EmptyStackException();	
	}
	return arr[--index];	
}

public boolean isEmpty()
{
	if(index==0) {
		return true;
	}
	return false;
}

public boolean isFull()
{
	if(index==size) {
		return true;
	}
	return false;
}

public int size() {
	return index;
}

public static void main(String[] args)
{
	StackArray stack=new StackArray(5);
	
	stack.push(5);
	stack.push(4);
	stack.push(3);
	stack.push(2);
	stack.push(1);
	
	System.out.println("1.size of stack after push operation:"+" "+stack.size());
	System.out.println("2.pop elements from stack:");
	while(!stack.isEmpty())
	{
		System.out.printf("%d",stack.pop());
	}
	System.out.println("\n3.size 0f stack after pop operation:"+stack.size());
}
}
