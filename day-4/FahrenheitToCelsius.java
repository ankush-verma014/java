/* 
Write a program in java to Fahrenheit to Celsius Program
Formula is :-  celsius=((fahrenheit-32)*5)/9;
 */

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit = 10; 
        double celsius = ((fahrenheit - 32) * 5) / 9;

        System.out.println("Fahrenheit to Celsius: " + celsius);
    }
}
