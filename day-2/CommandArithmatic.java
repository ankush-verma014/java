public class CommandArithmatic
{
	public static void main (String [] args)
	{
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);


		int result = a+b;
		System.out.println("Addition  of the number is :"+result);

		result= a-b;
		System.out.println("substraction of the number is :"+result);

		result= a*b;
		System.out.println("multiplication  of the number is :"+result);

		result= a/b;
		System.out.println("Division  of the number is :"+result);

	}
}