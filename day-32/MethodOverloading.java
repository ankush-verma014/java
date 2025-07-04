// Assignment :
// ----------------------
// Develop a scenario based program by using Method Overloading for processing the payment
// using different available options like Cash Payment, Credit Card and Debit Card Payment.

// Create one BLC class called Payment.

// Write 3 overloaded methods makePayment()

// 1) Method Name        : makePayment()
// Argument        : 1 argument of type double amount
// Return Type        : void
// Access modifier    : public
// In this method validate the parameter variable by using one Helper method (private
// method) validateAmount() to take only positive amount [Description is given below]

// 2) Method Name        : makePayment()
// Argument        : 3 arguments [String cardHolderName, String creditCardNumber,double amount]
// Return Type        : void
// Access modifier    : public
// In this method validate the parameter variable amount and creditCardNumber through
// Helper methods, amount must be positive integer and creditCardNumber must be of
// 16 digits exactly.

// 3) Method Name        : makePayment()
// Argument        : 2 arguments [String debitCardNumber, double amount]
// Return Type        : void
// Access modifier    : public
// In this method validate the parameter variable amount and debitCardNumber though
// Helper methods, amount must be positive integer and debitCardNumber must be of
// 16 digits exactly.

// HELPER METHODS (Must be private so accessible from inside Payment class only)
// [For more about helper method, read the notes, Access modifier topic, public access modifier]

// 1) Method Name    : validateAmount()
// Argument        : 1 argument double amount
// Return Type    : boolean
// Access modifier    : private
// In this method validate the amount, if amount is 0 or less than 0, print an error
// message and return false otherwise return true.

// 2) Method Name    : validateCardNumber()
// Argument        : 1 argument String cardNumber.
// Return Type    : boolean
// Access modifier    : private
// In this method validate the card number for its length, if length is exactly 16 digits
// then return true otherwise return false.

// 3) Method Name    : maskCardNumber()
// Argument        : 1 argument String cardNumber.
// Return Type    : String
// Access modifier    : private
// By using this method we should display only last 4 digit of card (Credit OR Debit both)
// only.[See the Test cases for more details in the below of this question]

// Create an ELC class called PaymentProcess.

// Inside main method display the following details as a Menu.
// System.out.println("Payment Menu");
// System.out.println("Please select any one Payment Method from the Menu :");
// System.out.println("\t\t 1) Payment by using Cash ");
// System.out.println("\t\t 2) Payment by using Credit Card ");
// System.out.println("\t\t 3) Payment by using Debit Card ");

// Write Switch case with Scanner class to make the payment through different Options :

// Test Cases for Output :
// ------------------------
// Test Case 1 :
// -------------
// Payment Menu
// Please select any one Payment Method from the Menu :
//         1) Payment by using Cash
//         2) Payment by using Credit Card
//         3) Payment by using Debit Card
// Please enter your Payment choice [1/2/3]
// 1
// Enter the amount you want to pay through cash :
// 12000
// Processing payment via Cash...
// Amount Paid RS :12000.0
// Payment Successful!

// Test Case 2 :
// -------------
// Payment Menu
//    Please select any one Payment Method from the Menu :
//         1) Payment by using Cash
//         2) Payment by using Credit Card
//         3) Payment by using Debit Card
//    Please enter your Payment choice [1/2/3]
//    2
//    Enter your name :
//    RaviShankar
//    Enter your 16 digit Credit Card Number :
//    1234987645672345
//    Enter your Payment Amount :
//    12000
//    Processing payment via Credit Card...
//    Card Holder: RaviShankar
//    Card Number: *-*-**-2345
//    Amount Paid RS :12000.0
//    Payment Successful!
   
//    Test Case 3 :
// -------------
// Payment Menu
//    Please select any one Payment Method from the Menu :
//          1) Payment by using Cash
//         2) Payment by using Credit Card
//         3) Payment by using Debit Card
//    Please enter your Payment choice [1/2/3]
//    3
//    Enter your 16 digit Debit Card Number :
//    1234123412341234
//    Enter your Payment Amount :
//    12000
//    Processing payment via Debit Card...
//    Card Number: *-*-**-1234
//    Amount Paid RS :12000.0
//    Payment Successful!


// Test Cases for Input Validation :
// ---------------------------------
// Test Cases 1:
// -------------
// Payment Menu
//    Please select any one Payment Method from the Menu :
//         1) Payment by using Cash
//         2) Payment by using Credit Card
//         3) Payment by using Debit Card
//    Please enter your Payment choice [1/2/3]
//    1
//    Enter the amount you want to pay through cash :
//    -1000
//    Error: Amount must be greater than zero.
   
//    Test Cases 2:
// -------------
// Payment Menu
//    Please select any one Payment Method from the Menu :
//         1) Payment by using Cash
//         2) Payment by using Credit Card
//         3) Payment by using Debit Card
//    Please enter your Payment choice [1/2/3]
//    2
//    Enter your name :
//    Ravishankar
//    Enter your 16 digit Credit Card Number :
//    1234
//    Enter your Payment Amount :
//    123
//    Error: Invalid card number. It must be 16 digits.

// Test Cases 3:
// -------------
// Payment Menu
//    Please select any one Payment Method from the Menu :
//         1) Payment by using Cash
//         2) Payment by using Credit Card
//         3) Payment by using Debit Card
//    Please enter your Payment choice [1/2/3]
//    3
//    Enter your 16 digit Debit Card Number :
//    1234
//    Enter your Payment Amount :
//    123
//    Error: Invalid card number. It must be 16 digits

// package com.ankush.method_overloading;

// public class Payment
// {
//    //making a payment through cash
// public void makePayment(double amount)
// {
//     if(validateAmount(amount))
//     {
//         System.out.println("Processing payment via Cash...");
//         System.out.println("Amount Paid RS :"+amount);
//         System.out.println("Payment Successful!");
//     }
// }

// //making a payment through credit card

// public void makePayment(String cardHolderName, String creditCardNumber,double amount)
// {
//     if(validateCardNumber(creditCardNumber) && validateAmount(amount))
//     {
//         System.out.println("Processing payment via Credit Card...");
//         System.out.println("Card Holder :"+cardHolderName);
//         System.out.println("Card Number :"+maskCardNumber(creditCardNumber));
//         System.out.println("Amount Paid RS :"+amount);
//         System.out.println("Payment Successful!");
//     }
// }

// //making a payment through debit card
// public void makePayment(String debitCardNumber, double amount)
// {
//     if(validateCardNumber(debitCardNumber) && validateAmount(amount))
//     {
//         System.out.println("Processing payment via Debit Card...");
//         System.out.println("Card Number :"+maskCardNumber(debitCardNumber));
//         System.out.println("Amount Paid RS :"+amount);
//         System.out.println("Payment Successful!");
//     }
// }

// //Helper method
// private boolean validateAmount(double amount)
// {
//     if(amount <= 0)
//     {
//         System.err.println("Error: Amount must be greater than zero.");
//         return false;
//     }
//     return true;
// }

// private boolean validateCardNumber(String cardNumber)
// {
//     if(cardNumber.length() !=16)
//     {
//         System.err.println("Error: Invalid card number. It must be 16 digits.");
//         return false;
//     }
//     return true;
// }

// private String maskCardNumber(String cardNumber)
// {
//     return "****_****_****_"+cardNumber.substring(12);
// }

// }
// ____________
// package com.ankush.method_overloading;

// import java.util.Scanner;

// public class PaymentProcess
// {
// public static void main(String[] args)
// {
// System.out.println("Payment Menu");
// System.out.println("Please select any one Payment Method from the Menu :");
// System.out.println("\t\t 1) Payment by using Cash ");
// System.out.println("\t\t 2) Payment by using Credit Card ");
// System.out.println("\t\t 3) Payment by using Debit Card ");

// Payment payment = new Payment();
// Scanner sc = new Scanner(System.in);

// System.out.println("Please enter your Payment choice [1/2/3]");
// int choice = sc.nextInt();

// switch(choice)
// {
// case 1:
// System.out.println("Enter the amount you want to pay through cash :");
// double amount = sc.nextDouble();
// payment.makePayment(amount);
// break;

// case 2:
// System.out.println("Enter your name :");
// String name = sc.nextLine();
// name = sc.nextLine();
// System.out.println("Enter your 16 digit Credit Card Number :");
// String creditCard = sc.nextLine();

// System.out.println("Enter your Payment Amount :");
// amount = sc.nextDouble();
// payment.makePayment(name, creditCard, amount);
// break;

// case 3 :
// System.out.println("Enter your 16 digit Debit Card Number :");
// String debitCard = sc.nextLine();
// debitCard = sc.nextLine();
// System.out.println("Enter your Payment Amount :");
// amount = sc.nextDouble();
// payment.makePayment(debitCard, amount);
// break;
// }

// sc.close();

// }
// }
// Assignment: "Wrapper class MCQ"
