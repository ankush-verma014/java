/*
  Write a java program to find the profit and loss by following the formula
Profit and loss Formulas – 
Profit = SP – CP
Loss = CP – SP
Profit percentage = (Profit /Cost Price) x 100
Loss percentage = (Loss / Cost price) x 100
*/

public class  FindProfitLoss
{
	public static void main(String[] args) 
	{
		double sellingPrice = 1500;
		double costPrice = 800;

		double profit = sellingPrice - costPrice;
		double loss = costPrice - sellingPrice;

		double profitPercentage = (profit / costPrice) * 100;
        double lossPercentage = (loss/ costPrice) * 100;

		System.out.println("Profit is :" + profitPercentage);
		System.out.println("Loss is :" + lossPercentage);
		
	}
}
