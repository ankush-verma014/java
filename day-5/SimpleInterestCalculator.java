/* Write a program to enter Principal, Rate and Time. 
Calculate and display Simple Interest and Amount. */

public class SimpleInterestCalculator
{
    public static void main(String[] args)
	{
        
        double principal = 1500; 
        double rate = 5;
        int time = 2;

        double simpleInterest = (principal * rate * time) / 100;
        double amount = principal + simpleInterest;

        System.out.println("Principal: Rs " + principal);
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Time: " + time + " years");
        System.out.println("Simple Interest is: Rs" + simpleInterest);
        System.out.println("Amount is : Rs " + amount);
    }
}

