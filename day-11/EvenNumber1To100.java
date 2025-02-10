// package day-11;

//  WAP in java to print all even numbers from 1 - 100

// public class EvenNumber1To100 
// {
//     public static void main(String[] args) 
//     {
//         System.out.print("Even numbers from 1 to 100 are: ");
//         for (int i = 1; i <= 100; i++) 
//         {
//             if (i % 2 == 0) 
//             {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }


import java.util.Scanner;

public class EvenNumber1To100 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number in the 1 to 100 range:");
        int num = sc.nextInt();

        if (num < 1 || num > 100) 
        {
            System.out.println("Invalid number! Please enter a number between 1 and 100.");
        }
        else 
        {
            System.out.println("Even numbers from 1 to " + num + " are:");
            for (int i = 1; i <= num; i++) 
            {
                if (i % 2 == 0) 
                {
                    System.out.print(i + " ");
                }
            }
        }

        sc.close();
    }
}
