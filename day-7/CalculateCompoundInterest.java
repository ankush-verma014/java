/*Que-3) write a Java program to calculate compound interest for 3 years? 
 Formula- amount=principle*((1+rate/100)*(1+rate/100)*(1+rate/100));*/

//  package com.nitday7_feb4;

 import java.util.Scanner;
 
 public class CalculateCompoundInterest 
 {
 
	 public static void main(String[] args) 
	 {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Enter a principle(Amount) value :");
		 double principle = sc.nextDouble();
		 
		 System.out.print("Enter rate(Percentage) value :");
		 double rate = sc.nextDouble();
		 
		 System.out.print("Enter year wise value :");
		 double year = sc.nextDouble();
		 
		// double amount = principle*Math.pow((1+rate/100), year);
  double amount = (principle*rate*year)/100;
 
		 
		 System.out.print("The interest is :"+amount);
		 
		 
		 sc.close();
		 
		 
 
	 }
 
 }
 
