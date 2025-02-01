/* Write a Java program to check if a given number is a palindrome. A number is a palindrome if it remains the same when its digits are reversed. */

public class PalindromeOrNot
{
	public static void main(String[] args) 
	{
		int num=121;
		int originalNum = num;
		int reverse = 0;

		while(num!=0)
		{
			reverse= reverse * 10 + num % 10;
			num=num / 10;
		}

        if(originalNum==reverse)
		{
			System.out.println("Number is palindrome :" +originalNum);

		}
		else
		{
			System.out.println("Number is not palindrome :" +originalNum);
		}



	}
}
