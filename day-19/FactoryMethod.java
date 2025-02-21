// Question : 1
// ---------------
// Create a Student class with the following attributes:

// name (String): The name of the student.
// age (int): The age of the student.
// grade (String): The grade of the student.

// In addition to these attributes, implement the following:

// Static Method: Create a static method called createStudent() in the Student class. This method should:

// Prompt the user to enter values for name, age, and grade.
// Initialize a new Student object with the provided values.
// Return the created Student object.

// Implement a toString() to the Student class, which prints the student's details in the format: "Name: <name>, Age: <age>, Grade: <grade>".

// Create a ELC class TestStudent
// Main Method: In the main method, write code to:

// Ask the user for the number of Student objects they want to create.
// Use a loop to call the createStudent() method the specified number of times, 
// After creating all Student objects, use a loop to display the details of each student using the toString method.

// Sol : 

// package com.ankush.labday19_Staticmethod;

// import java.util.Scanner;

// public class TestStudent 
// {
   

// 	public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("How many students do you want to create?");
//         int numberOfStudents = sc.nextInt();
//         sc.nextLine();

     

//         for (int i = 0; i < numberOfStudents; i++) 
//         {
//             Student student = Student.createStudent();
//             System.out.println(student);
//         }

//         sc.close();
//     }
// }

// class Student 
// {
//     String name;
//     int age;
//     String grade;

//     public Student(String name, int age, String grade) 
//     {
//         this.name = name;
//         this.age = age;
//         this.grade = grade;
//     }

//     public static Student createStudent() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the name of the student:");
//         String name = sc.nextLine();

//         System.out.println("Enter the age of the student:");
//         int age = sc.nextInt();

//         sc.nextLine(); 
//         System.out.println("Enter the grade of the student:");
//         String grade = sc.nextLine();

//         return new Student(name, age, grade);
//     }

//     @Override
//     public String toString() {
//         return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
//     }
// }


// ============================================================================================================================================================================================


// Question : 2
// ---------------
// Create an Employee class with the following attributes:

// id (int): The unique identifier for each employee.
// name (String): The name of the employee.
// salary (double): The base salary of the employee.
// department (String): The department to which the employee belongs.
// In addition to these attributes, implement the following:

// Static Method for Employee Creation: Add a static method named createEmployee() in the Employee class. This method should:

// Prompt the user to enter values for id, name, salary, and department.
// Initialize a new Employee object with the provided values.
// Return the created Employee object.
// Business Logic Method: Add a method calculateAnnualSalary() that:

// Calculates and returns the annual salary of the employee based on their salary (monthly salary).
// Adds a bonus based on the department:
// Sales: 10% bonus of annual salary.
// Engineering: 15% bonus of annual salary.
// HR: 8% bonus of annual salary.
// Other: 5% bonus of annual salary.
// Implement toString method  to return the employee's details in this format: "ID: <id>, Name: <name>, Department: <department>, Monthly Salary: <salary>, Annual Salary (with Bonus): <calculated_annual_salary>".

// Create a ELC class TestEmployee:
// Main Method:

// Ask the user how many Employee objects they want to create.
// Use a loop to call createEmployee() to create the specified number of employees, 
// After all employees are created, use another loop to display each employee's details, including the calculated annual salary with bonus.

// Sol: 


// package com.ankush.labday19_Staticmethod;

// import java.util.Scanner;

// public class TestEmployee 
// {

// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("How many employees do you want to create");
// 		int numberOfEmployee = sc.nextInt();
// 		 sc.nextLine();
	
// 		 for (int i = 0; i < numberOfEmployee; i++) 
// 	        {
// 	            Employee e = Employee.createEmployee();
// 	            System.out.println(e);
// 	        }

// 	}

// }

// class Employee
// {
// 	int id;
// 	String name;
// 	double salary;
// 	String department;
	
// 	public Employee(int id,String name,double salary,String department)
// 	{
// 		this.id = id;
// 		this.name = name;
// 		this.salary = salary;
// 		this.department = department;
// 	}
	
// 	public static Employee createEmployee()
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("Enter a employee Id :");
// 		int id = sc.nextInt();
		
// 		System.out.println("Enter a employee Name :");
// 		String name = sc.nextLine();
// 		name = sc.nextLine();
		
// 		System.out.println("Enter a employee salary :");
// 		double salary = sc.nextDouble();
		
// 		System.out.println("Enter a Department :");
// 		String department = sc.next();
		
// 		return new Employee(id,name, salary,department); 
// 	}
	
// 	public double calculateAnnualSalary()
// 	{
// 		double annualSalary = salary * 12;
// 		double bonus = 0;
		
// 		switch (department) 
// 		{
// 		   case "sales":
// 			   bonus = annualSalary * 10/100;
// 			   break;
			   
// 		   case "engineer":
// 			   bonus = annualSalary * 15/100;
// 			   break;
			   
// 		   case "hr":
// 			   bonus = annualSalary * 8/100;
// 			   break;
			   
// 			   default:
// 				   bonus = annualSalary * 5/100;
// 				   break;
// 		}
// 		return annualSalary + bonus;
			   
// 	    }

// 	@Override
// 	public String toString() 
// 	{
// 		return "Employee Id=" + id + ", Name=" + name + ", Salary=" + salary + ", Department=" + department + "Annual Salary (With Bonous)"+ calculateAnnualSalary();
// 	}

	
	
	
// }

// =================================================================================================================================================

// Question : 3
// ---------------
// Create a Product class with the following attributes:

// productId (int): The unique identifier for each product.
// productName (String): The name of the product.
// price (double): The price of a single unit of the product.
// quantity (int): The quantity of the product.
// In addition to these attributes, implement the following:

// Static Factory Method: Implement a static factory method named createProduct(int productId, String productName, double price, int quantity) in the Product class. This method should:

// Take productId, productName, price, and quantity as parameters.
// Initialize and return a new Product object using these parameters.
// Business Logic Method: Add a method named calculateTotalAmount() that:

// Calculates the total amount for the product (price * quantity).
// Applies a discount based on the total amount:
// Total > 1000: 10% discount.
// Total > 500: 5% discount.
// Total <= 500: No discount.
// Returns the total amount after applying the discount.
// Implement toString method that returns  the product’s details in this format: "Product ID: <productId>, Name: <productName>, Price: <price>, Quantity: <quantity>, Total Amount (after discount): <total_amount>".


// Create a ELC class TestProduct:
// Main Method:

// Ask the user how many Product objects they want to create.
// Use a loop to call createProduct() with parameters provided by the user to create each product.

// After all products are created, use another loop to display each product’s details, including the total amount after discount.

// Sol :

// package com.ankush.labday19_factory_method;

// import java.util.Scanner;

// public class TestProduct
// {
// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
// 		System.out.println("how many Product objects they want to create.");
// 		int noOfOProduct = sc.nextInt();
		
// 		for(int i=1; i<=noOfOProduct; i++)
// 		{
			
// 			System.out.println("Enter produactId : ");
// 			int productId=sc.nextInt();
			
// 			System.out.println("Enter Name of Product : ");
// 			String productName = sc.nextLine();
// 			productName = sc.nextLine();
			
// 			System.out.println("Enter price Of Product : ");
// 			double price = sc.nextDouble();
			
// 			System.out.println("Enter a Qunatity of Product : ");
// 			int quantity = sc.nextInt();
			
// 			Product p = Product.createProduct(productId, productName, price, quantity);
// 			System.out.println(p);
			
// 		}
// 	}
// }

// class Product 
// {
// 	private int productId;
// 	private String productName;
// 	private double price;
// 	private int quantity;
	
// 	public Product (int productId,String productName,double price,int quantity)
// 	{
// 		this.productId = productId;
// 		this.productName = productName;
// 		this.price = price;
// 		this.quantity = quantity;
// 	}
	
// 	public static Product createProduct(int productId,String productName,double price,int quantity)
// 	{
// 	    return new Product(productId, productName, price, quantity);
		
// 	}
	
// 	public double calculateTotalAmount()
// 	{
// 		double totalAmount = price * quantity;
		
// 		if(totalAmount>1000)
// 		{
// 		  totalAmount= totalAmount * 0.90;
// 		}
// 		else if (totalAmount>500)
// 		{
// 			 totalAmount= totalAmount * 0.95;
// 		}
// 		return totalAmount;
// 	}

// 	@Override
// 	public String toString() {
// 		return "Product [productId= " + productId + ", productName= " + productName + ", price= " + price + ", quantity= "
// 				+ quantity + " Total Amount (After Discount) "+calculateTotalAmount()+"]";
// 	}
// }

// ===============================================================================================================================