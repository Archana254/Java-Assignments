/*print all number from 1-100,but replace all multiplies of 3 with 'Fizz',
all multiplies of 5 with 'Buzz',all multiplies of 15 with 'FizzBuzz'*/
package basic3;
import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				for(int i=1;i<=100;i++)
		{
					if((i%3==0)&&(i%15==0))
					{
						System.out.println("FizzBuzz");
					}else
						if(i%3==0)
						{
							System.out.println("Buzz");
						}else
							if(i%5==0)
							{
								System.out.println("Buzz");
							} else
							{
													
			System.out.println(i);
		}
		}
	}

}
