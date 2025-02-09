import java.util.Scanner;

public class CheckDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

		long digit=0l;

		while(num!=0)
			{
				num = num/10;
				digit++;

			}

            System.out.println("The number of digit is : "+digit);
	}

}
