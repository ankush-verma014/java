// MCQs
// ----
// Q1) What is the main responsibility of the ClassLoader in JVM?
// a) Executing bytecode
// b) Loading class files into memory
// c) Managing garbage collection
// d) Compiling Java code to bytecode

// Ans: b) Loading class files into memory


// =================================================================================================================

// Q2) The Java Heap Memory is used for storing:
// a) Primitive local variables
// b) Objects and instance variables
// c) Method calls
// d) Class definitions

// Ans: b) Objects and instance variables


// =================================================================================================================

// Q3) Which part of the JVM executes Java bytecode?

// a) Just-In-Time (JIT) Compiler
// b) Java Virtual Machine (JVM) Interpreter
// c) Java Development Kit (JDK)
// d) Java Runtime Environment (JRE)

// Ans: b) Java Virtual Machine (JVM) Interpreter


// =================================================================================================================

// Q4) What is the purpose of the Just-In-Time (JIT) compiler in JVM?
// a) Convert Java source code into bytecode
// b) Interpret bytecode one instruction at a time
// c) Convert bytecode into native machine code at runtime
// d) Load Java classes into memory

// Ans: 
// c) Convert bytecode into native machine code at runtime

// =================================================================================================================

// Q5) Which of the following is the highest-level class loader in the JVM hierarchy?
// a) System ClassLoader
// b) Bootstrap ClassLoader
// c) Extension ClassLoader
// d) Custom ClassLoader

// Ans:  b) Bootstrap ClassLoader


// =================================================================================================================

// Q6) Which of the following class loaders loads classes from CLASSPATH?
// a) Bootstrap ClassLoader
// b) Extension ClassLoader
// c) System (Application) ClassLoader
// d) Native Method ClassLoader

// Ans: 
// c) System (Application) ClassLoader

// =================================================================================================================

// Q7) What is the output of the following code?
// public class Test
// {
// public static void main(String[] args)
// {
// System.out.println(String.class.getClassLoader());
// }
// }

// a) null
// b) Bootstrap ClassLoader
// c) AppClassLoader
// d) Exception at runtime

// Ans: null

// =================================================================================================================

// Q8) What is the output of the following code?
// public class Test
// {
// public static void main(String[] args)
// {
// System.out.println(Test.class.getClassLoader());
// }
// }

// a) null
// b) Bootstrap ClassLoader
// c) AppClassLoader
// d) PlatformClassLoader

// Ans: c) AppClassLoader

// =================================================================================================================

// Q9) What is the output of the following code?
// public class Test
// {
// public static void main(String[] args)
// {
// System.out.println(Test.class.getClassLoader().getParent());
// }
// }

// a) null
// b) Bootstrap ClassLoader
// c) AppClassLoader
// d) PlatformClassLoader

// Ans: d) PlatformClassLoader

// =================================================================================================================

// Q10) What is the output of the following code?
// public class Test
// {
// public static void main(String[] args) throws ClassNotFoundException {
// ClassLoader cl = ClassLoader.getSystemClassLoader();
// Class cls = cl.loadClass("java.lang.String");
// System.out.println(cls.getClassLoader());
// }
// }
// a) null
// b) Bootstrap ClassLoader
// c) Exception at runtime
// d) System ClassLoader

// Ans: a) null

// =================================================================================================================
// ------------------------------------------------------------------------
// Que 5 : Ticket Management System with VIP and Student Tickets
// =============================================================
// You have been hired by an event management company to develop a ticketing system that
// can manage different types of tickets for various events.
// The system needs to handle regular tickets, VIP tickets with special access privileges, and
// student tickets that may have a discount.
// Your task is to create a Java program with the following requirements:
// Design a Ticket class with attributes like event name, seat number, and price.

// 1.Create a class Ticket
// ------------------------
// Instance variable:-
// String eventName,private
// int seatNumber,private
// double price,private
// Create a parameterized constructor for all Instance variable to initialize the variable.
// Generate Getters and setters for all Instance variable to get values and set values.

// 2.Create another class VIPTicket and inherit Ticket class here.
// ---------------------------------------------------------------
// Instance variable:-
// String specialAccess,private
// Create a parameterized constructor for Instance variable to initialize the variable.
// //Use super keyword to initialize Ticket class constructor attributes.
// Generate Getters and setters for Instance variable to get values and set values.

// 3.Create another class StudentTicket and inherit Ticket class here.
// -------------------------------------------------------------------
// Instance variable:-
// boolean studentDiscount,private
// Create a parameterized constructor for Instance variable to initialize the variable.

// //Use super keyword to initialize Ticket class constructor attributes.
// Generate Getters and setters for Instance variable to get values and set values.
// Create a class MainTicket which contains main method to demonstrate the usage.


// //Creating a Ticket object using the parameterized constructor
// //Creating a VIPTicket object using the parameterized constructor
// //Creating a StudentTicket object using the parameterized constructor

// Condition :
// -----------
// if any numeric value is zero or negative then print "Error Invalid Input".

// TEST CASE 1 :
// -------------
// sample input : When your reading values for Ticket class OR VIPTicket OR
// StudentTicket then make sure if any numeric value is <=0 then print "Error Invalid
// Input".
// sample output : Error Invalid Input

// TEST CASE 2 :
// -------------
// sample input :
// VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage
// Access");
// StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0,
// true);
// sample output :
// VIP Ticket:
// Event: VIP Concert

// Seat Number: 201
// Price: $100.0
// Special Access: Backstage Access
// Student Ticket:
// Event: Student Event
// Seat Number: 301
// Price: $30.0
// Student Discount: true


// Ans:
// package com.ankush.inheritance_hirachy;

// public class Ticket 
// {
//    private String eventName;
//    private int seatNumber;
//    private double price;
   
// public Ticket(String eventName, int seatNumber, double price)
// {
// 	super();
// 	this.eventName = eventName;
// 	this.seatNumber = seatNumber;
// 	this.price = price;
	
// }

// public String getEventName()
// {
// 	return eventName;
// }

// public void setEventName(String eventName) 
// {
// 	this.eventName = eventName;
// }

// public int getSeatNumber() {
// 	return seatNumber;
// }

// public void setSeatNumber(int seatNumber) 
// {
// 	this.seatNumber = seatNumber;
// }

// public double getPrice()
// {
// 	return price;
// }

// public void setPrice(double price)
// {
// 	this.price = price;
// }
  
// }
// _____________
// package com.ankush.inheritance_hirachy;

// public class VIPTicket extends Ticket
// {
//    private String specialAccess;

// public VIPTicket(String eventName, int seatNumber, double price, String specialAccess)
// {
// 	super(eventName, seatNumber, price);
// 	this.specialAccess = specialAccess;
// }

// public String getSpecialAccess()
// {
// 	return specialAccess;
// }

// public void setSpecialAccess(String specialAccess) 
// {
// 	this.specialAccess = specialAccess;
// }

// public void display()
// {
// 	if(getSeatNumber()<0 || getPrice()<0)
// 	{
// 		System.out.println("Error Invalid Input");
		
// 	}
// else
// {
// 	System.out.println("VIP Ticket:");
// 	System.out.println("Event: "+getEventName());
// 	System.out.println("Seat Number: "+getSeatNumber());
// 	System.out.println("Price: $"+getPrice());
// 	System.out.println("Special Access: "+getSpecialAccess());
// }
// }
  
// }
// ______________
// package com.ankush.inheritance_hirachy;

// public class StudentTicket extends Ticket
// {
// 	private boolean studentDiscount;

// 	public StudentTicket(String eventName, int seatNumber, double price, boolean studentDiscount) 
// 	{
// 		super(eventName, seatNumber, price);	
// 		this.studentDiscount = studentDiscount;
		
// 	}

// 	public boolean isStudentDiscount() 
// 	{
// 		return studentDiscount;
// 	}

// 	public void setStudentDiscount(boolean studentDiscount) 
// 	{
// 		this.studentDiscount = studentDiscount;
// 	}
	
// 	public void display()
// 	{
// 		if(getSeatNumber()<0 || getPrice()<0)
// 		{
// 			System.out.println("Error Invalid Input");
			
// 		}
// 		else
// 		{
// 		System.out.println("\nStudent Ticket:");
// 		System.out.println("Event: "+getEventName());
// 		System.out.println("Seat Number: "+getSeatNumber());
// 		System.out.println("Price: $"+getPrice());
// 		System.out.println("Student Discount: "+isStudentDiscount());;
// 		}
// 	}

// }
// __________________
// package com.ankush.inheritance_hirachy;

// import java.util.Scanner;
// public class MainTicket {
//     public static void main(String[] args) 
//     {
//         Scanner sc=new Scanner(System.in);
        
//         System.out.println("Enter your choice: "); 
//         int option=Integer.parseInt(sc.nextLine());
//         if(option==1)
//         {
        	
//            String type=sc.nextLine();
          
//             int seatNo=Integer.parseInt(sc.next());
//             double price=Double.parseDouble(sc.next());
//             boolean b=sc.nextBoolean();
                   

//     StudentTicket studentTicket = new StudentTicket(type, seatNo, price, b);
//           studentTicket.display();
        

//         }
//         else if(option==2)
//         {
             
//             String type=sc.nextLine();
//             int seatNo=Integer.parseInt(sc.nextLine());
//             double price=Double.parseDouble(sc.nextLine());
//             String Access=sc.next();
//             VIPTicket vipTicket = new VIPTicket(type, seatNo, price,Access);
//             vipTicket.display();
           

//         }
//         else
//         {
//             System.out.println("invalid Ticket Type");
//         }
//     }
// }

// =================================================================================================================