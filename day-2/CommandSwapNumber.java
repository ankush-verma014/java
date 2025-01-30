/* 
Q4) Write a program to swap to numbers without using 3rd variable using 
    command line argument.
 */

class  CommandSwapNumber
{
	public static void main(String[] args) 
	{

		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
			System.out.println("before swap ");

		System.out.println("value of a: "+a +"  value of b :" + b);

		a=a+b;
		b=a-b;
		a=a-b;
			System.out.println("after swap ");

			System.out.println("value of a: "+a +"  value of b :" + b);
	}
}
