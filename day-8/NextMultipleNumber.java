/*Que-2)
Write a java program which print the next multiple of 100 for the given number.
Program is determined by the following rules:

if the given value is negative or zero, return -1
if the given value is positive, return the next multiple of the given number. Example: if x = 123, return 200.*/

//package com.nit_day_08_feb5;

import java.util.Scanner;

public class NextMultipleNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
       
        int result = nextMultipleNum(num);
       
        System.out.println("The next multiple given number  " + num + " is: " + result);
    }
   
    public static int nextMultipleNum(int num) 
    {
        if (num <= 0) 
        {
            return -1;
        } 
        else 
        {
            int nextMultiple = ((num / 100) + 1) * 100;
            return nextMultiple;
        }
    }
}
