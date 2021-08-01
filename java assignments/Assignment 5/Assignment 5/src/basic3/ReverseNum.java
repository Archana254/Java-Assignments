//write code to reverse a number
package basic3;
public class ReverseNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int rem,reverse=0;
		while(n!=0)
		{
			rem=n%10;
			reverse=rem+(reverse*10);
			n=n/10;
		}
		System.out.println("reverse number="+reverse);
	}

}
