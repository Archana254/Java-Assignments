//check given number is prime or not
package basic;
import java.util.Scanner;

public class Prg2 {
	static int flag=0;
	public static void main(String[] args) {	
	
	System.out.println("enter the num");
	Scanner scr = new Scanner(System.in);
    int num = scr.nextInt();
    primeOrNot(num);
	}
	
    static int primeOrNot(int num)
    {
	  if(num==0||num==1)
	  {
		  System.out.println(num+"is not a prime number");
	  } else {
		  for(int i=2;i<=num;i++) 
		  {
			  if(num%2==0)
			  {
				  System.out.println(num+"is not a prime number");
				  int flag=1;
				  break;
			  }
    }
		  if(flag==0)
		  { 
			  System.out.println(num+"is prime number");
		  }
		    }
	  return 1;
    }
	  }
   
