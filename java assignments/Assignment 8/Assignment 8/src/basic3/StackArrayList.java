package basic3;
import java.util.ArrayList;
import java.util.List;

public class StackArrayList<T> {
	@Override
	public String toString()
	{
		return "stack [element="+elements+"]";
	}
	
private List<String> elements=new ArrayList<String>();
public String peek()
{
	if(elements.isEmpty()) {
		return null;
	}
	return elements.get(elements.size()-1);
}

public String pop() {
	if(elements.isEmpty()) {
		return null;
	}
	String top=elements.get(elements.size()-1);
	elements.remove(elements.size()-1);
	return top;
}

public void push(String element) {
	elements.add(element);	
}

public int size()
{
	return elements.size();
}

public boolean isEmpty() {
	return elements.isEmpty();
}

public static void main(String[] args) {
	
	StackArrayList stack=new StackArrayList();
	System.out.println("is stack empty:"+stack.isEmpty());
	stack.push("archu");
	stack.push("vivek");
	stack.push("raju");
	stack.push("rochit");
	System.out.println("is stack empty:"+stack.isEmpty());
	System.out.println(stack);
	System.out.println("stack size:"+stack.size());
	System.out.println("peek top element:"+stack.peek());
	System.out.println("after peek:"+stack);
	System.out.println("pop top element:"+stack.pop());
	System.out.println("after pop:"+stack);
	System.out.println("stack size now:"+stack.size());	
}
}