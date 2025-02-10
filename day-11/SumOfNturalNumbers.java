// package day-11;

//WAP in java to print the sum of first hundred natural number

 import java.util.Scanner;

public class SumOfNturalNumbers 
{
    public static void main(String[] args) 
    {
        Scanner  sc= new Scanner(System.in);
        System.out.print("Enter a number in the 1 to 100 range:");
        int num = sc.nextInt();
        int sum=0;

        if (num < 1 || num > 100) 
        {
            System.out.println("Invalid number! Please enter a number between 1 and 100.");
        }
        else 
        {
          System.out.print("Sum of natural numbers from 1 to " + num + " are:");
            for (int i = 1; i <= num; i++) 
            {
                sum+=i;
            }
            System.out.println("Sum is :"+sum);
        }
    }
}
 
