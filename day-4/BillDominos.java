public class BillDominos
{
	public static void main(String[] args) 
	{
		int chickenrolls=4;
		int vegetablepuff=3;

		int chickenrollprice=60;
		int vegetablepuffprice=25;

		int totalchickenrollbill=chickenrolls*chickenrollprice;
		int totalvegetablepuffbill=vegetablepuff*vegetablepuffprice;

		int discount = 50;

		int totalbill= totalchickenrollbill + totalvegetablepuffbill;

		int finalbill=totalbill-discount;

		System.out.println("Chicken rolls is :" +chickenrolls);
		System.out.println("Vegetable puff is :" +vegetablepuff);

		System.out.println("chicken rool price is :"+chickenrollprice);
		System.out.println("vegetable puff price is :"+vegetablepuffprice);


		System.out.println("Total chicken rool bill is :" +totalchickenrollbill);
		System.out.println("Total Vegetable puff bill is :" +totalvegetablepuffbill);

		 System.out.println("Total bill is :" +totalbill);

		System.out.println("Discount is :" +discount);


		System.out.println("final bill after Rs 50 discount:" +finalbill);


	}
}
