/* 2)Write a Java program that accepts three numbers as command-line arguments and calculates their average.
- if any number is negative print "Error" message on console. */

public class  CommandThreeNumberAverage
{
	public static void main(String[] args) 
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);

		if(num1 > 0 && num2 > 0 && num3 > 0)
		{
			System.out.println("The avereage of three number is :");
		}

		if(num1 < 0 || num2 < 0 || num3 < 0){
			System.out.println("Error");
			
		}
		else
		{
			double average=(num1 + num2 + num3)/3;
			System.out.println(average);
		}
		
	}
}
