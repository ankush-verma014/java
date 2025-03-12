// Que 1 : Simple Inheritance Program :
// -------------------------------------
// Develop one program on Multi-level Inheritance with following requirements :

// Animal => Mammal => Dog [Multi-level Inheritance]

// Create a BLC class called Animal.

// Attributes/Properties: No properties

// Constructor:
// No Constructor 

// Methods:

// public void eat() : Method to print that "Animal is eating"

// Create Another BLC class Mammal which is the sub class of Animal.

// Attributes/Properties: No properties

// Constructor:
// No Constructor 

// Methods:

// public void walk() : Method to print that "Mammal is walking"


// Create Another class Dog which is the sub class of Mammal.

// Attributes/Properties: No properties

// Constructor:
// No Constructor 

// Methods:

// public void bark() : Method to print that "Dog is barking"


// Create an ELC class MultilevelInheritance which contains main method, Create the Object for more specialized class and call the behavior.

// =========================================================================
// Q2) Student Fee Management System

//  A university needs an efficient way to manage and process fees for its students. There are different types of students with varying fee structures. 
   
//  The university wants a system to handle the following scenarios:

// 1) Regular Students: Students who only need to pay the exam fee. This is the super class scenario.

// 2) Day Scholars: Students who attend classes daily but do not stay in hostels. They have an additional transport fee with exam fee. This fee needs to be managed and calculated separately.

// 3) Hostellers: Students who stay in university hostels and have additional hostel fees. Their total fee is the sum of the exam fee and hostel fee.


// Create BLC class as Student  
// ---------------------------
// It contains the following implementation.

// Instance Variables: studentId : int , name :String , examFee:double

// Methods: public displayDetails(): String ,
//          public payFee() :double

// Define parameterized constructor and a toString method.

// Create two BLC sub classes of Student called DayScholar and Hosteller. 
// Add the following implementations to each class.

// DayScholar:
// -----------

// Instance Variables : transportFee:double ,

// Methods: Define parameterized constructor 


// Hosteller:
// ----------
// Instance Variables: hostelFee :double

// Methods: Define parameterized constructor 

// Add the following methods in BOTH classes.

// Method: displayDetails(): This method should return a string containing the details of the student

// in the following format:

// Student [name=John Smith,studentId=123,examFee=100.0] OR

// DayScholar[transportFee=500, name=John Smith,studentId=123,examFee=100.0] and so on.

// Method: payFee(amount): This method takes amount as parameter that represents the fee

// provided. You must calculate and then return the remaining amount paid in excess. If excess is

// paid, the returned amount will be negative. The total fees that each student must pay must

// include all the fees applicable to that Student(examFees, transportFees, hostelFees as applicable).

// Subtract the given amount from total fee for each student and return the remaining amount.


// An ELC class Tester is given to you with a main method. Use this class to test your solution's

// classes and methods.


// Condition :
// -----------
// if any numeric value is zero or negative then print "Error Invalid Input".


// TEST CASE 1 :
// -------------
// sample input  : When your reading values for Student class OR DayScholar Class OR Hosteller Class then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
// sample output : Error Invalid Input


// TEST CASE 2 :
// -------------
// sample input  : 
//                  1. For Student Class:
//                  studentId: 1
//                  name: "John Smith"
//                  examFee: 25000.0
//                  Payment Amount: 25000.0

//                  2. For DayScholar Class:
//                  studentId: 2
//                  name: "Brian Lara"
//                  examFee: 25000.0
//                  transportFee: 5000.0
//                  Payment Amount: 30000.0

//                  3. For Hosteller Class:
//                  studentId: 3
//                  name: "Virat Kohli"
//                  examFee: 25000.0
//                  hostelFee: 8000.0
//                  Payment Amount: 33000.0

// sample output : 

//                  Student[name=John Smith,studentId=1,examFee=25000.0]
//                  All Fees are clear
                 
//                  DayScholar[TransportFee=5000.0,name=Brian Lara,studentId=2,examFee=25000.0]
//                  Remaining amount to pay is: 12000.0
                 
//                  Hosteller[HostelFee=8000.0,name=Virat Kohli,studentId=3,examFee=25000.0]
//                  All Fees are clear