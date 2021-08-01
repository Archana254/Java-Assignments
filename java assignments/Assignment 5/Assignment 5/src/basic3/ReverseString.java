//write a code to reverse string,also check if it is a palindrome
package basic3;
import java.util.*;
public class ReverseString {
	public static void main(String[] args)
	{// TODO Auto-generated method stub
	    String original,reverse="";//obejects of string class
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the string to check palindrome or not");
	    original=s.nextLine();
	    int length=original.length();
	    for(int i=length-1;i>=0;i--)
	    {
	    	reverse=reverse+original.charAt(i);
	    }
	    if(original.equals(reverse))
	    {
	    	System.out.println("palindrome");
	    	}
	    else
	    {
	    	System.out.println(" not palindrome");	
	    		
	    }
	}
}
