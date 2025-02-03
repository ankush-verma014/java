/*
  Write a java program to find the profit and loss by following the formula
Profit and loss Formulas � 
Profit = SP � CP
Loss = CP � SP
Profit percentage = (Profit /Cost Price) x 100
Loss percentage = (Loss / Cost price) x 100
*/

public class FindProfitLoss {
    public static void main(String[] args) {
        double sellingPrice = 7000;
        double costPrice = 8900;

        double profit = sellingPrice - costPrice;
        double loss = costPrice - sellingPrice;

        if (profit > 0) {
            double profitPercentage = (profit / costPrice) * 100;
            System.out.println("Profit is: " + profit);
            System.out.println("Profit percentage is: " + profitPercentage + "%");
        } else if (loss > 0) {
            double lossPercentage = (loss / costPrice) * 100;
            System.out.println("Loss is: " + loss);
            System.out.println("Loss percentage is: " + lossPercentage + "%");
        } else {
            System.out.println("There is no profit or loss.");
        }
    }
}
