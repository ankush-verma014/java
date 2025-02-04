//package com.nitday7_feb4;

import java.util.Scanner;

public class CelsiusToFahrenheit 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a value in Celsius: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = (celsius * 9 / 5) + 32;
        
        System.out.print("The Celsius " + celsius + " value is converted into Fahrenheit: " + fahrenheit);
        
        sc.close();
    }
}
