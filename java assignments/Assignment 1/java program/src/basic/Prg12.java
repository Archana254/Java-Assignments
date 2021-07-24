//Find sum of first N integers,given N using:a)cumulative sum(loop) b)formula
package basic;

public class Prg12 {
	static int i,sum=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NUMBER=10;
		System.out.println("the sum of first"+NUMBER+"using loop="+sumOfFirstNumUsingLoop(NUMBER));
		
        System.out.println("the sum of first"+NUMBER+"using formula="+sumOfFirstNumUsingFormula(NUMBER));
	}

	static int sumOfFirstNumUsingLoop(int num)
	{
		for(i=0;i<=num;i++)
		{
		sum+=i;
	}
		return sum;
	}
	static int sumOfFirstNumUsingFormula(int num)
	{
		return num*(num+1)/2;
	}
	
}


