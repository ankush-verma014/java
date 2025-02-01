/*A whole-seller gives incentives in the form of discounts on the net bill. Write a program to input the net bill and calculate the discount as follows:

     Net Bill in Rupees			    Discount %
	<5000					5
	>=5000 and <10000			10
	>=10000					15

Display Discount %, Discount Amount and Amount Payable*/

public class DiscountCalculator {
    public static void main(String[] args) {

        double netBill = 7500;

        double discountPercentage;

        if (netBill < 5000)
		{
            discountPercentage = 5;
        } else if (netBill >= 5000 && netBill < 10000) 
		{
            discountPercentage = 10;
        } else 
		{
            discountPercentage = 15;
        }

       
        double discountAmount = (discountPercentage / 100) * netBill;
        double amountPayable = netBill - discountAmount;

        System.out.println("Net Bill Amount: Rs " + netBill);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: Rs " + discountAmount);
        System.out.println("Amount Payable: Rs " + amountPayable);
    }
}
