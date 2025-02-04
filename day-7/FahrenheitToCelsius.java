//package com.nitday7_feb4;

import java.util.Scanner;

public class FahrenheitToCelsius 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        System.out.print("The Fahrenheit " + fahrenheit + " value is converted into Celsius: " + celsius);
        
        sc.close();
    }
}
