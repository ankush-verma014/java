/*
Write a java program which print the given three digit number is palindrome or not 

Program is determined by the following rules:

if the given number is an three digit number, Example: if x = 232, print 1. if x = 345, print 0
if 1 then print a message that the number is pallindrome
if 0 then print a message that the number is not a pallindrome
if the given number is negative or zero, print -1
if -1 then print a message that the given number is -ve kindly provide the +ve number only
if the given number is not an three digit number, print -2
if -2 then print the message that this program can check the operation for the 3 number only.

sol : 

*/

import java.util.Scanner;

public class ThreeDigitPalindromeOrNot 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a three-digit number:");
        int num = sc.nextInt();
        
        if (num <= 0) 
        {
            System.out.println("-1");
            System.out.println("The given number is negative. Kindly provide a positive number only.");
        } 
        else if (num < 100 || num > 999) 
        {
            System.out.println("-2");
            System.out.println("This program can check the operation for three-digit numbers only.");
        } 
        else 
        {
            int original = num;
            int reversed = 0;
            
            while (num != 0) 
            {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            
            if (original == reversed) 
            {
                System.out.println("1");
                System.out.println("The number is a palindrome.");
            } 
            else 
            {
                System.out.println("0");
                System.out.println("The number is not a palindrome.");
            }
        }
    }
}
