/* Q5) Write a Java program to calculate the factorial
of a number where number must be taken from command line argument.*/


public class  CommandFactorial
{
	public static void main(String[] args) 
	{
       int num = Integer.parseInt(args[0]);

	   long factorial=1;
	   for (int i=1;i<=num;i++ )
	   {
		   factorial=factorial * i;
	   }

		System.out.println("The factorial of  " +num+ " is "+factorial);
	}
}
