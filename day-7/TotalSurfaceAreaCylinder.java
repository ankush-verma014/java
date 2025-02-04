/*Que-2) write a java program to calculate the total surface area of a cylinder? 
 Formula- 2 pi square r * 2 pi r h (take the pi as 3.14).*/

/*package com.nitday7_feb4;*/

import java.util.Scanner;

public class TotalSurfaceAreaCylinder 
{
   public static void main(String[] args) 
   {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter the value of Radius: ");
       double radius = sc.nextDouble();
       
       System.out.print("Enter the value of Height: ");
       double height = sc.nextDouble();
       
       double pi = 3.14;

       double totalSurfaceArea = 2 * pi * radius * (radius + height);
       
 
       System.out.println("The total surface area of the cylinder is: " + totalSurfaceArea);
       
      
       sc.close();
   }
}