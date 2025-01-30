/*
3)Write a Java program that accepts a single integer as a command-line argument and checks whether it is a prime or not.
- if number is negative print "Error" message on console.
*/

public class  CommandPrimeOrNot
{
public static void main(String [ ] args)
	{
		int num = Integer.parseInt(args[0]);
		int isPrime = 1;
		
		if(num<0)
		{
			System.out.println("ERROR");
		} else
		{
			for(int i=2; i <= num; i++)
			{
				if(num%i==0)
				{
					isPrime++;
				
				}	
			}
			
			if(isPrime == 2)
			{
				System.out.println(num+" is a Prime Number");
			} else
			{
				System.out.println(num+" is not a Prime Number ");
			}
		}				
	}

}
