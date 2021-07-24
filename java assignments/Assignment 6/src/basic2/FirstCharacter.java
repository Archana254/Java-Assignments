//write code to print first characters  of all strings of string array.
//eg:	if string array is{"Hello","Archana"} output should be HA

package basic2;


public class FirstCharacter {
	static void printFirstCharacter(String[] str)
	{
	     for(int i=0;i<str.length;i++)
	     {
    	   if(i==0) 
    	   {
			System.out.print(str[0].charAt(i));
			System.out.print(str[1].charAt(i));
    	   }
		}
	}    
	public static void main(String[] args) {
		String[] str ={"Hello","Archana"};
		printFirstCharacter(str);
	}
	}