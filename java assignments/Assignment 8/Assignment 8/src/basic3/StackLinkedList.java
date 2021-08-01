package basic3;
import java.util.EmptyStackException;
import java.util.LinkedList;
public class StackLinkedList<T> {
	private LinkedList<T> stack;
	
public StackLinkedList()
	{
		stack=new LinkedList();
	}
	
public void push(T element)
	{
        stack.addFirst(element);
	}
	
public T pop()
{
	if(isEmpty())
	{
		throw new EmptyStackException();
	}
	return stack.removeFirst();
	}

public boolean isEmpty(){
	if(stack.size()==0) {
		return true;
	}
return false;
}

public int size()
{
return stack.size();

	}

	public static void main(String[] args) {
	   System.out.println("1.stack of integers");
	   stackOfIntegers();
	   
	   System.out.println("\n2.stack of string");
	   stackOfStrings();
	   
	}
		// TODO Auto-generated method stub
		
		private static void stackOfIntegers() {
		StackLinkedList<Integer> obj=new StackLinkedList();
		obj.push(5);
		obj.push(4);
		obj.push(3);
		obj.push(2);
		obj.push(1);
		System.out.println("1.1 size of stack after push operations="+obj.size());
		System.out.printf("1.2 pop elements from stack="+obj.pop());
		while(!obj.isEmpty()) {
			System.out.printf("->%d",obj.pop());	
		}
		System.out.println("\n1.3 size of stack after push operations="+obj.size());
		}
		
		private static void stackOfStrings() {
			StackLinkedList<String> obj=new StackLinkedList();
			obj.push("five");
			obj.push("four");
			obj.push("three");
			obj.push("two");
			obj.push("one");
			System.out.println("2.1 size of stack after push operations="+obj.size());
			System.out.printf("2.2 pop elements from stack="+obj.pop());
			while(!obj.isEmpty()) {
				System.out.printf("->%s",obj.pop());
			}
			System.out.println("\n2.3 size of stack after push operations="+obj.size());
			}
	}