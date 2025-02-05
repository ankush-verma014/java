/*Write a java which program the sum of digits of the given two digit number.
program determined by the following rules:

if the given value is in between 10 and 99, return sum of it's digits. Example: if x = 34, print 7
if the given value is negative, print -3
if the given value is greater than 99, print -2
if the given value is in between 0 and 9, print -1*/

//package com.nit_day_08_feb5;

import java.util.Scanner;

public class SumOfDigit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int result = getSumOfDigits(num);
        System.out.println("Result: " + result);
    }
    
    public static int getSumOfDigits(int num) 
    {
        if (num < 0) 
        {
            return -3;
        } 
        else if (num > 99) 
        {
            return -2;
        } 
        else if (num >= 10 && num <= 99) 
        {
            int digit1 = num / 10;
            int digit2 = num % 10;
            return digit1 + digit2;
        } 
        else 
        {
            return -1;
        }
    }
}

