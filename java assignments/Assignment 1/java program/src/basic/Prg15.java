//print weekday for given number between 0 to 6 eg:if input is 0,print Sunday,if input is 1 print Monday
package basic;
import java.util.Scanner;

public class Prg15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		System.out.println("enter the number");
		int a=scr.nextInt();
		weekDays(a);
	}
	static int weekDays(int a) {
		switch(a)
		{
		case 0:if(a==0) {
			    System.out.println("print sunday");
		          break;
		}
		case 1:if(a==1) {
		    System.out.println("print monday");
	          break;
	}
		case 2:if(a==2) {
		    System.out.println("print tuesday");
	          break;
	}
		case 3:if(a==3) {
		    System.out.println("print wednesday");
	          break;
	}
		case 4:if(a==4) {
		    System.out.println("print thursday");
	          break;
	}
		case 5:if(a==5) {
		    System.out.println("print friday");
	          break;
	}
		case 6:if(a==6) {
		    System.out.println("print saturday");
	          break;
	}
		default:if(a>6)
			     System.out.println("nothing to print");
                 break;
		}	
return 1;
	}
}
