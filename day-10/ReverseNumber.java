import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int reverse = 0;

        if (num < 0) {
            System.out.println("Reverse num is: -1");
            return;
        }

        while (num != 0) {
            int originalNum = num % 10;
            reverse = reverse * 10 + originalNum;
            num = num / 10;
        }
        System.out.println("Reverse num is: " + reverse);
    }
}
