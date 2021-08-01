//write a code to find factorial of number using recursion
package basic3;
public class Factorial {
	
	private static int factorial(int n) throws Exception {

		if (n < 0) {
			throw new Exception("Invalid number" + n);
		} else if ((n == 0) || (n == 1)) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(factorial(3));
			System.out.println(factorial(1));
			System.out.println(factorial(0));
			//System.out.println(factorial(-1));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
        
	}


