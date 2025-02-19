// Question-1
// --------------
// Create an Employee class (BLC Class)

// Properties :

// names		 Type
// --------	---------------		
//  firstName   	:String   
//  lastName      	:String  
//  employeeId 	:int  
//  salary  	:double  
//  NoOfProject 	:int 

// Access Modifier : private (for all varriables)  

// Implement parameterized constructors to initialize these properties.

// implement calculateSalary() method that will add extra ammount in salary based on NoOfProject.

// Return Type       : void
// Access modifier :public

// NoOfProject is more than 5 and less that 10 then add 5000
// NoOfProject is more than 10 and less that 20 then add 10000
// NoOfProject is more than 20 then add 15000

// Take another class Tester (ELC Class) which is having main method and instantiate the Employee object and execute the methods.


// Test Case 1: 
// ----------------
// Valid Input with Projects Between 6 and 10
// Input:

// firstName: John
// lastName: Doe
// employeeId: 101
// salary: 50000.00
// NoOfProject: 7

// Expected Output:

// After executing calculateSalary(), the salary should be updated to 55000.00.
// Print output showing the updated salary: 55000.00.

// Test Case 2:
// ---------------
//  Invalid Number of Projects (Negative Value)
// Sample Input:

// firstName: Michael
// lastName: Johnson
// employeeId: 105
// salary: 45000.00
// NoOfProject: -5

// Expected Output:

// Print an error message indicating invalid number of projects (e.g., "Number of projects cannot be negative").
// Salary remains 45000.00.

// Sol : 
// import java.util.*;

// public class EmployeeTesterELC
// {
//     public static void main(String[]args)
//     {
//       Scanner sc = new Scanner(System.in);
//       String firstName = sc.nextLine();
//       String lastName = sc.nextLine();
//       int employeeId = sc.nextInt();
//       double salary = sc.nextDouble();
//       int NoOfProject = sc.nextInt();

//       Employee e = new Employee(firstName,lastName,employeeId,salary,NoOfProject);


//       if(NoOfProject<=0)
//       {
//         System.out.println("Number of projects cannot be negative");
//       }
//       else if (salary<=0)
//       {
//         System.out.println("Salary cannot be negative");
//       }
//       else
//       {
//         e.calculateSalary();
//         e.getEmployee();
//       }

    
//     //    e.calculateSalary();
      
//     }
// }

// class Employee
// {
//     private String firstName;
//     private String lastName;
//     private int employeeId;
//     private double salary; 
//     private int NoOfProject;


//     public Employee(String firstName,String lastName,int employeeId,double salary,int NoOfProject)
//     {
//         this.firstName = firstName;
//         this.lastName = lastName;
//         this.employeeId = employeeId;
//         this.salary = salary;
//         this.NoOfProject = NoOfProject;
//     }

//     public void calculateSalary()
//     {
//         if(NoOfProject>=5 && NoOfProject<10)
//         {
//             salary+=5000;
            
//         }
//         else if (NoOfProject>=10 && NoOfProject<20)
//         {
//             salary+=10000;
//         }
//         else
//         {
            
//             salary+=15000;
//         }
     
//     }
//         public void getEmployee()
//         {
//             System.out.println("Employee Details:");
//             System.out.println("Name:"+ firstName+" "+lastName);
//             System.out.println("Employee ID:"+ employeeId);
//             System.out.println("Updated Salary:"+salary);
            

//         }

    


// }

// ===================================================================================================================================================================================================================

// ------------------
// Question - 2
// ------------------

// Design a Cricket Score Board by using foolowing requirements 

// Take a Class Batter (Business Logic  Class)

// Instance variables:

// Names		Return Type
// ---------	----------------
// name		: String
// runs		: int
// matches		: int
// batting_avg	: float.

// Access Modifier :public (for all varriables)

//  Create a no argument constructor that assigns default values to instance variables.
//  Create parameterized constructor that accepts name, runs, matches.

// Methods :

// Method name		: computeBattingAverage
// Access Modifier 	: public
// Return type		: void

// This method should print the batting average of the batter by dividing run with matches.

// Input: "Sachin", 18000, 463

// Output:
// Name: Sachin
// Batting_Avg: 38.87689

// Note: 

// a. If runs or matches values are negative print 'Error'.
// b. If runs are greater than 0 when matches are 0 print 'Error'.

// Method name: getStatistics
// Return type: void
// This method should print the details of the batter.

// Input: "Sachin", 18000, 463

// Output:
// Name: Sachin
// Runs: 18000
// Matches: 463
// Note: 
// a. If runs or matches values are negative print 'Error'.
// b. If runs are greater than 0 when matches are 0 print 'Error'.

// Given a class Testing (ELC Class) that contains main method. Use this class to test your code.

// Test Case -1 :
// -----------------

// Invalid Case: Empty name

// Sample Input: "", 5000, 100`

// Expected Output:

// Error: Name cannot be empty.
// Error: Name cannot be empty.

// Test Case-2 :
// ----------------

// Invalid Case: Negative runs

// Sample Input: "Rahul", -15000, 300

// Expected Output:

// Error: Runs and matches must be non-negative.
// Error: Runs and matches must be non-negative.


// Sol : 
// import java.util.Scanner;

// public class BattingAverageTester {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String name = scanner.nextLine();
//         int runs = Integer.parseInt(scanner.nextLine());
//         int matches = Integer.parseInt(scanner.nextLine());

//          if (name.isEmpty()) {
//             System.out.println("Error: Name cannot be empty.");
//             return;
//         } else if (runs < 0 || matches < 0) {
//             System.out.println("Error: Runs and matches must be non-negative.");
//             return;
//         }
//         else if (runs > 0 && matches == 0) {
//             System.out.println("Error");
//             return;
//         }
//         else
//         {
//         Batter batter = new Batter(name, runs, matches);

//         batter.computeBattingAverage();
//         batter.getStatistics();

//         scanner.close();
//         }
//     }
// }
// class Batter {
//     public String name;
//     public int runs;
//     public int matches;
//     public float batting_avg;

//     // No-argument constructor
//     public Batter() {
//         this.name = "Unknown";
//         this.runs = 0;
//         this.matches = 0;
//         this.batting_avg = 0.0f;
//     }

//     // Parameterized constructor
//     public Batter(String name, int runs, int matches) {
//         this.name = name;
//         this.runs = runs;
//         this.matches = matches;
//     }

//     // Method to compute batting average
//     public void computeBattingAverage() {
    
//         batting_avg = (float) runs / matches;
//         System.out.println("Name:" + name);
//         System.out.println("Batting_Avg:" + batting_avg);
        
//     }

//     // Method to display batter statistics
//     public void getStatistics() {
  
//         System.out.println("Name:" + name);
//         System.out.println("Runs:" + runs);
//         System.out.println("Matches:" + matches);
//     }
// }

// ===================================================================================================================================================================================================================

// --------------
// Question-3
// --------------

// Create a class Employee (Business Logic Class)

//  Instance Variables:

// Names		 Type
// ---------	 ----------------
//  employeeNumber : int

//  employeeName 	: String

//  employeeSalary	: double

//  Access Modifier  :public (for all variables)

//  Create a parameterized constructor to initialilize all the fields.
 
//  Create another class Tester (ELC class)

//  which contains main method  which will receive all the instance variable value from BLC class.


//  In this ELC class print the following details

//  a) If salary is >=60000, Print Employee is a Developer

//  b) If salary is >=40000 and <60000 , Print Employee is a Designer

//  c) If Salary is <40000 , Print Employee is a Tester


// Input:

// 232, "Naresh Kumar", 43000


// Output:

// Employee is a Designer


// Instruction:

// Test Cases :
// ========

// Parameterized Constructor: Checks each input parameter (name, id, fee) for validity.

// --> If id is negative, it sets it to 0 and prints an error message like (id must be always positive integer)
// --> If fee is negative, it sets it to 0.0 and prints an error message like (Fee cannot be negative)
// --> If name is null, it sets it to an empty string and prints an error message.(name must initialize with any default name)


// Sol : 
// import java.util.Scanner;

// public class Tester 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scanner = new Scanner(System.in);

//         int employeeNumber = scanner.nextInt();
//         scanner.nextLine(); 
//         String employeeName = scanner.nextLine();
//         double employeeSalary = scanner.nextDouble();

//         Employee e = new Employee(employeeNumber, employeeName, employeeSalary);

//         if (employeeName.isEmpty()) 
//         {
//             System.out.println("Name must be initialized with any default name");
//             return;
//         } 
//        else if (employeeNumber <= 0) 
//         {
//             System.out.println("ID must always be a positive integer");
//             return;
//         } 
//         else if (employeeSalary <=0) 
//         {
//             System.out.println("Salary cannot be negative.");
//         } 
//         else
//         {
//         if (employeeSalary >= 60000) 
//         {
//             System.out.println("Employee is a Developer");
//         } 
//         else if (employeeSalary >= 40000 && employeeSalary<60000) 
//         {
//             System.out.println("Employee is a Designer");
//         } 
//         else 
//         {
//             System.out.println("Employee is a Tester");
//         }
//         }
//         scanner.close();
//     }
// }

// class Employee 
// {
//     int employeeNumber;
//     String employeeName;
//     double employeeSalary;

//     public Employee(int employeeNumber, String employeeName, double employeeSalary) 
//     {
//         this.employeeNumber = employeeNumber;
//         this.employeeName = employeeName;
//         this.employeeSalary = employeeSalary;
//     }
// }


// ===================================================================================================================================================================================================================