/* --
Rohan purchased an old cycle for Rs. 1200 and spend Rs. 250 on repairs, Rs. 350 in coloring and 
added new accessories worth Rs. 500. Rohan wants to make a profit of Rs. 1500 on selling the cycle. 
Find the selling price of the cycle. Write a java program to store all values and calculate and display the selling price. */

public class  Cycle
{
	public static void main(String[] args) 
	{
		double purchasedOldCyclePrice= 1200;
		double repairPrice = 250;
		double coloringPrice= 350;
		double newAccessoriesprice= 500;
		double profit  = 1500;

       
	   double totalPrice = (purchasedOldCyclePrice + repairPrice  + coloringPrice + newAccessoriesprice);
	   double sellingPrice = totalPrice + profit;

	   System.out .println("The selling price is " + sellingPrice);

	}
}
