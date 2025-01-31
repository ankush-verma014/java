/* A shopkeeper buys a TV set for Rs. 32,500 and sells it at a profit of 27%. Apart from this a VAT of 12.7% and Service Charge is 3.87% is charged. Display total selling price, 
   profit along with vat and service charge.
 */

public class ShopkeeperBill
{
	public static void main(String[] args) 
	{
	   double buyPrice=32500;
	   double profitPercentage=0.27;
	   double vatPercentage=0.127;
	   double serviceChargePercentage=.0387;

	   double profit = buyPrice*profitPercentage;
	   double sellingPrice = buyPrice + profit;
	   
	   double vatPrice= sellingPrice*vatPercentage;
	   double serviceCharge = sellingPrice*serviceChargePercentage;

	   double totalSellingPrice= (sellingPrice + vatPrice + serviceCharge);


	   System.out.println("profit  is :" +profit);
	   System.out.println("profit Percentage is :" +profitPercentage);
       System.out.println("vat Percentage is :" +vatPercentage);
	   System.out.println("service Charge Percentage is :" +serviceChargePercentage);

       System.out.println("buy Price is :" +buyPrice);
	   System.out.println("selling Price is:" +sellingPrice);
       System.out.println("vat Price is :" +vatPrice);
	   System.out.println("service Charge is :" +serviceCharge);

	    System.out.println("Total selling Price is :" +totalSellingPrice);

		
	}
}
