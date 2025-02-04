/*Que-1) Write a java program to calculate the curved surface area of a cube?
 Formula-6*side Square.*/
/*
package com.nitday7_feb4;*/

import java.util.Scanner;

public class CurvedSurfaceAreaCube {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the value of side Square :");
		
		double side = sc.nextDouble();
		double cubeArea=6*side*side;
		
		System.out.println("The curved surface area of cube is :" + cubeArea);
		
		sc.close();

	}

}
