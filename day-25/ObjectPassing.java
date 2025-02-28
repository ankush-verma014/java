// Q1)

// The payroll system of an organization involves calculating the gross salary of each type of
// employee and the tax applicable to each.
// Create the following entity classes as described below.
// Class Employee
// Fields: id: int, name : String, basicSalary : double, HRAPer : double, DAPer : double
// Public Method: calculateGrossSalary() - returns a double
// Calculate the gross salary as : basicSalary +HRAPer +DAPer
// Class Manager
// Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double,
// projectAllowance: double
// Public Method: calculateGrossSalary() - returns a double
// Calculate the gross salary as : basicSalary +HRAPer +DAPer + projectAllowance
// Class Trainer
// Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double,
// batchCount: int, perkPerBatch: double
// Public Method: calculateGrossSalary() - returns a double
// Calculate the gross salary as : basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch)
// Class Sourcing
// Fields: id: int, name : String, basicSalary : double, HRAPer : double,DAPer : double,
// enrollmentTarget: int, enrollmentReached: int, perkPerEnrollment: double
// Public Method: calculateGrossSalary() - returns a double
// Calculate the gross salary as: basicSalary +HRAPer
// +DAPer
// +((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)
// Class TaxUtil
// Fields: None
// Public
// Methods:
// calculateTax(Employee) - returns a
// doublecalculateTax(Manager) - returns
// a double calculateTax(Trainer) - returns
// a double calculateTax(Sourcing) -
// returns a double
// Tax Calculation Logic: If gross salary is greater than 30000 tax is 20% else, tax is
// 5%Note : Attributes/Fields must be non-Private for the above classes.
// A class Test is given to you with the main Method. Use this class to test your solution.

// Sol:
// -----
// package com.ankush.object_passing_day25;

// public class Employee 
// {
//     int id;
//     String name;
//     double basicSalary;
//     double HRAPer;
//     double DAPer; 
    
    
    
//     public Employee(int id, String name, double basicSalary, double hRAPer, double dAPer) 
//     {
// 		super();
// 		this.id = id;
// 		this.name = name;
// 		this.basicSalary = basicSalary;
// 		HRAPer = hRAPer;
// 		DAPer = dAPer;
// 	}



// 	public double calculateGrossSalary()
//     {
//     	return basicSalary+HRAPer+DAPer;
//     }
// }

// __________
// package com.ankush.object_passing_day25;

// public class Manager 
// {
// 	int id;
//     String name;
//     double basicSalary;
//     double HRAPer;
//     double DAPer; 
//     double projectAllowance;
    
    
    
//     public Manager(int id, String name, double basicSalary, double hRAPer, double dAPer, double projectAllowance) {
// 		super();
// 		this.id = id;
// 		this.name = name;
// 		this.basicSalary = basicSalary;
// 		HRAPer = hRAPer;
// 		DAPer = dAPer;
// 		this.projectAllowance = projectAllowance;
// 	}



// 	public double calculateGrossSalary()
//     {
//     	return basicSalary+HRAPer+DAPer+projectAllowance;
//     }
// }
// __________
// package com.ankush.object_passing_day25;

// public class Trainer 
// {
// 	int id;
//     String name;
//     double basicSalary;
//     double HRAPer;
//     double DAPer; 
//     int batchCount;
//     double perkPerBatch;
    
    
    
//     public Trainer(int id, String name, double basicSalary, double hRAPer, double dAPer, int batchCount,
// 			double perkPerBatch)
//     {
// 		super();
// 		this.id = id;
// 		this.name = name;
// 		this.basicSalary = basicSalary;
// 		HRAPer = hRAPer;
// 		DAPer = dAPer;
// 		this.batchCount = batchCount;
// 		this.perkPerBatch = perkPerBatch;
// 	}



// 	public double calculateGrossSalary()
//     {
//     	return basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch);
//     }
// }

// ____________
// package com.ankush.object_passing_day25;

// public class Sourcing 
// {
// 	 int id;
// 	 String name;
// 	 double basicSalary;
// 	 double HRAPer;
// 	 double DAPer;
// 	 int enrollmentTarget;
// 	 int enrollmentReached;
// 	 double perkPerEnrollment;
	 
	 
	 
// 	 public Sourcing(int id, String name, double basicSalary, double hRAPer, double dAPer, int enrollmentTarget,
// 			int enrollmentReached, double perkPerEnrollment) {
// 		super();
// 		this.id = id;
// 		this.name = name;
// 		this.basicSalary = basicSalary;
// 		HRAPer = hRAPer;
// 		DAPer = dAPer;
// 		this.enrollmentTarget = enrollmentTarget;
// 		this.enrollmentReached = enrollmentReached;
// 		this.perkPerEnrollment = perkPerEnrollment;
// 	}



// 	public double calculateGrossSalary()
// 	 {
// 		 return basicSalary+HRAPer+DAPer+((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment;
// 	 }
	 
	 
	    
	    
// }
// _____________
// package com.ankush.object_passing_day25;

// public class TaxUtil 
// {
   
	
// 	public double calculateTax(Employee e)
// 	{
// 		 double grossSalary = e.calculateGrossSalary();
// 		 if(grossSalary>30000)
// 		 {
// 			return (grossSalary * 20 /100);
// 		 }
// 		 else
// 		 {
// 			 return grossSalary*5/100;
// 		 }
		 
// 	}
	
// 	public double doublecalculateTax(Manager m)
// 	{
// 		 double grossSalary = m.calculateGrossSalary();
// 		 if(grossSalary>30000)
// 		 {
// 			return (grossSalary * 20 /100);
// 		 }
// 		 else
// 		 {
// 			 return grossSalary*5/100;
// 		 }
// 	}
	
// 	public double calculateTax(Trainer t)
// 	{
// 		 double grossSalary = t.calculateGrossSalary();
// 		 if(grossSalary>30000)
// 		 {
// 			return (grossSalary * 20 /100);
// 		 }
// 		 else
// 		 {
// 			 return grossSalary*5/100;
// 		 }
// 	}
	
// 	public double calculateTax(Sourcing s)
// 	{
// 		 double grossSalary = s.calculateGrossSalary();
// 		 if(grossSalary>30000)
// 		 {
// 			return (grossSalary * 20 /100);
// 		 }
// 		 else
// 		 {
// 			 return grossSalary*5/100;
// 		 }
// 	}
	
// }
// _____________

// package com.ankush.object_passing_day25;

// import java.util.Scanner;

// public class Test {

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);

// 		System.out.println("Choose the type of person (1 for Employee, 2 for Manager, 3 for Trainer, 4 for Sourcing):");
// 		int choice = sc.nextInt();
// 		TaxUtil taxUtil = new TaxUtil();
// 		switch (choice) {
// 		case 1:

// 			System.out.println("Enter Employee Details:");

// 			System.out.print("Enter Employee Id: ");
// 			int empId = sc.nextInt();
// 			System.out.print("Enter Employee Name: ");
// 			sc.nextLine();
// 			String empName = sc.nextLine();
// 			System.out.println("Enter BasicSalary: ");
// 			double empBasicSalary = sc.nextDouble();
// 			System.out.println("Enter HRA Percentage: ");
// 			double empHRAPer = sc.nextDouble();
// 			System.out.println("Enter DA Percentage: ");
// 			double empDAPer = sc.nextDouble();

// 			Employee employee = new Employee(empId, empName, empBasicSalary, empHRAPer, empDAPer);

// 			System.out.println("\nEmployee All Details:");
// 			System.out.println("Employee Id is: " + empId);
// 			System.out.println("Employee Name is: " + empName);
// 			System.out.println("Employee Basic Salary is: " + empBasicSalary);
// 			System.out.println("Employee HRA percentage is: " + empHRAPer);
// 			System.out.println("Employee DA percentage is: " + empDAPer);
// 			System.out.println("Employee Gross Salary: " + employee.calculateGrossSalary());
// 			System.out.println("Employee Tax: " + taxUtil.calculateTax(employee));
// 			break;

// 		case 2:

// 			System.out.println("Enter Manager Details:");

// 			System.out.print("Enter Manager Id: ");
// 			int mgrId = sc.nextInt();
// 			System.out.print("Enter Manager Name: ");
// 			sc.nextLine();
// 			String mgrName = sc.nextLine();
// 			System.out.println("Enter BasicSalary: ");
// 			double mgrBasicSalary = sc.nextDouble();
// 			System.out.println("Enter HRA Percentage: ");
// 			double mgrHRAPer = sc.nextDouble();
// 			System.out.println("Enter DA Percentage: ");
// 			double mgrDAPer = sc.nextDouble();
// 			System.out.println("Enter Project Allowance: ");
// 			double mgrProjectAllowance = sc.nextDouble();

// 			Manager manager = new Manager(mgrId, mgrName, mgrBasicSalary, mgrHRAPer, mgrDAPer, mgrProjectAllowance);

// 			System.out.println("\nManager All Details:");
// 			System.out.println("Manager Id is: " + mgrId);
// 			System.out.println("Manager Name is: " + mgrName);
// 			System.out.println("Manager Basic Salary is: " + mgrBasicSalary);
// 			System.out.println("Manager HRA percentage is: " + mgrHRAPer);
// 			System.out.println("Manager DA percentage is: " + mgrDAPer);
// 			System.out.println("Manager Project Allowance: " + mgrProjectAllowance);
// 			System.out.println("Manager Gross Salary: " + manager.calculateGrossSalary());
// 			System.out.println("Manager Tax: " + taxUtil.doublecalculateTax(manager));
// 			break;

// 		case 3:

// 			System.out.println("Enter Trainer Details:");

// 			System.out.print("Enter Trainer Id: ");
// 			int trainerId = sc.nextInt();
// 			System.out.print("Enter Trainer Name: ");
// 			sc.nextLine();
// 			String trainerName = sc.nextLine();
// 			System.out.println("Enter BasicSalary: ");
// 			double trainerBasicSalary = sc.nextDouble();
// 			System.out.println("Enter HRA Percentage: ");
// 			double trainerHRAPer = sc.nextDouble();
// 			System.out.println("Enter DA Percentage: ");
// 			double trainerDAPer = sc.nextDouble();
// 			System.out.println("Enter Batch Count: ");
// 			int trainerBatchCount = sc.nextInt();
// 			System.out.println("Enter Perk Per Batch: ");
// 			double trainerPerkPerBatch = sc.nextDouble();

// 			Trainer trainer = new Trainer(trainerId, trainerName, trainerBasicSalary, trainerHRAPer, trainerDAPer,
// 					trainerBatchCount, trainerPerkPerBatch);

// 			System.out.println("\nTrainer All Details:");
// 			System.out.println("Trainer Id is: " + trainerId);
// 			System.out.println("Trainer Name is: " + trainerName);
// 			System.out.println("Trainer Basic Salary is: " + trainerBasicSalary);
// 			System.out.println("Trainer HRA percentage is: " + trainerHRAPer);
// 			System.out.println("Trainer DA percentage is: " + trainerDAPer);
// 			System.out.println("Trainer Batch Count: " + trainerBatchCount);
// 			System.out.println("Trainer Perk Per Batch: " + trainerPerkPerBatch);
// 			System.out.println("Trainer Gross Salary: " + trainer.calculateGrossSalary());
// 			System.out.println("Trainer Tax: " + taxUtil.calculateTax(trainer));
// 			break;

// 		case 4:

// 			System.out.println("Enter Sourcing Details:");

// 			System.out.print("Enter Sourcing Id: ");
// 			int sourcingId = sc.nextInt();
// 			System.out.print("Enter Sourcing Name: ");
// 			sc.nextLine();
// 			String sourcingName = sc.nextLine();
// 			System.out.println("Enter BasicSalary: ");
// 			double sourcingBasicSalary = sc.nextDouble();
// 			System.out.println("Enter HRA Percentage: ");
// 			double sourcingHRAPer = sc.nextDouble();
// 			System.out.println("Enter DA Percentage: ");
// 			double sourcingDAPer = sc.nextDouble();
// 			System.out.println("Enter Enrollment Target: ");
// 			int sourcingEnrollmentTarget = sc.nextInt();
// 			System.out.println("Enter Enrollment Reached: ");
// 			int sourcingEnrollmentReached = sc.nextInt();
// 			System.out.println("Enter Perk Per Enrollment: ");
// 			double sourcingPerkPerEnrollment = sc.nextDouble();

// 			Sourcing sourcing = new Sourcing(sourcingId, sourcingName, sourcingBasicSalary, sourcingHRAPer,
// 					sourcingDAPer, sourcingEnrollmentTarget, sourcingEnrollmentReached, sourcingPerkPerEnrollment);

// 			System.out.println("\nSourcing All Details:");
// 			System.out.println("Sourcing Id is: " + sourcingId);
// 			System.out.println("Sourcing Name is: " + sourcingName);
// 			System.out.println("Sourcing Basic Salary is: " + sourcingBasicSalary);
// 			System.out.println("Sourcing HRA percentage is: " + sourcingHRAPer);
// 			System.out.println("Sourcing DA percentage is: " + sourcingDAPer);
// 			System.out.println("Sourcing Enrollment Target: " + sourcingEnrollmentTarget);
// 			System.out.println("Sourcing Enrollment Reached: " + sourcingEnrollmentReached);
// 			System.out.println("Sourcing Perk Per Enrollment: " + sourcingPerkPerEnrollment);
// 			System.out.println("Sourcing Gross Salary: " + sourcing.calculateGrossSalary());
// 			System.out.println("Sourcing Tax: " + taxUtil.calculateTax(sourcing));
// 			break;

// 		default:
// 			System.out.println("Invalid choice!");
// 		}

// 		sc.close();
// 	}
// }
