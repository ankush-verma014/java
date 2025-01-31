/*Write a program in java to input number of days. Find and display number of years, months and days.*/

public class  YearsMonthDays
{
	public static void main(String[] args) 
	{
		int days= 10000;

		int years = days/365;
		int reminingDays= days % 365;
		int month = reminingDays / 30;
		int day = reminingDays % 30;


      
	  System.out.println("The Total days is : " + days);
	  System.out.println("The Total years is : " + years);
	  System.out.println("The Total month is : " + month);
	  System.out.println("The Total day is : " + day);
	}
}
