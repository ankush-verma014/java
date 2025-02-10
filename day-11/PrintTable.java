// WAP in java to print table of the given number (Number must be taken from Scanner class)

import java.util.Scanner;

public class PrintTable 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print table :");
        int num = sc.nextInt();
		for(int j = 1 ;j<=10;j++)
		{
			 for(int i=1;i<=num;i++)
			{
				 System.out.print(j + " x " + i + " = " + (j * i)+"\t");
			}
			 System.out.println();
		}
		
    }
}
