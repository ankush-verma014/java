// Program 01
// ----------
// Write a Program on OOPs to define Dog class properties and behaviour.

// properties :

// name    : String
// height  : double
// age	: int

// behaviour:

// getDogInformation() : public void
//              bark() : public void    


// Sol:

// BLC
// -------
// package com.ankush.labday_12oops;
// //BLC
// public class Dog 
// {
	
//   String dogName;
//   double dogHeight;
//   int dogAge;
  
//   public void getInformation()
//   {
// 	  System.out.println("My Dog name is :"+dogName);
// 	  System.out.println("My Dog height is :"+dogHeight);
// 	  System.out.println("My Dog Age is :"+dogAge);

//   }
  
//   public void bark()
//   {
// 	  System.out.println("The dog barks loudly at the passing people.");
//   }
// }



// ELC
// -------
// package com.ankush.labday_12oops;
//    //ELC
// public class DogInformation 
// {
// 	public static void main(String[] args) 
// 	{
// 		Dog tommy = new Dog();
		
// 		tommy.dogName= "Tommy";
// 		tommy.dogHeight= 2.6;
// 		tommy.dogAge= 5;
		
// 		tommy.getInformation();
//         tommy.bark();
		
// 	}

// }

// ____________________________________________________________________________________________________________________________________________________
// ------------------------------------------------------------------------
// ===============================================================================================================================================================================================================
// Program 02
// ----------
// Write a Program on OOPs to define Fan class properties and behaviour.

// properties :

// name    : String
// coil    : String
// wings	: int

// behaviour:

// switchOn()  : public void
// switchOff() : public void  

// Sol:

// BLC
// -------
// package com.ankush.labday_12oops;
// //BLC
// public class Fan {
//     String fanName;
//     String fanCoil;
//     int fanWings;
  
//     public void fanInformations() 
//     {
//         System.out.println("My fan name is : " + fanName);
//         System.out.println("My Fan coil is : " + fanCoil);
//         System.out.println("My Fan wings is : " + fanWings);
//     }

//     public void SwitchOn() 
//     {
//         System.out.println("my fan is now ON.");
//     }

//     public void SwitchOff() 
//     {
//         System.out.println("my fan is now OFF.");
//     }
// }

// ELC
// -------
// package com.ankush.labday_12oops;
// //ELC
// public class FanInformation 
// {

//     public static void main(String[] args) 
//     {
  
//         Fan fan = new Fan();
        
//         fan.fanName = "Bajaj";
//         fan.fanCoil = "Arioso 12DC5R";
//         fan.fanWings = 3;
        
//         fan.fanInformations();

//         fan.SwitchOn();
//         fan.SwitchOff();
//     }
// }

// ==========================================================================================================================================================================================================

 
// ------------------------------------------------------------------------
// Program 03
// -----------
// Write 2 programs on OOPs by your own thinking and imagination.

// Sol:

// BLC
// -------
// package com.ankush.labday_12oops;

// //BLC

// public class Bank 
// {
//    String bankName;
//    String accountHolderName;
//    long accountNumber;
//    String ifscCode;
//    String branch;
   
   
//    public void getpersonInformation()
//    {
// 	   System.out.println("Bank name is : "+bankName);
// 	   System.out.println("Bank account holder name is : "+accountHolderName);
// 	   System.out.println("Account number  : "+accountNumber);
// 	   System.out.println("IFSC code : "+ifscCode);
// 	   System.out.println("Bank branch name is : "+branch);

//    }
   
//    public void sbi()
//    {
// 	   System.out.println("The State Bank of India is one of the largest public sector banks in the country.");
//    }
   
// }


// ELC
// -------
// package com.ankush.labday_12oops;
// //ELC
// public class BankDetials {

// 	public static void main(String[] args) {

// 		Bank detials = new Bank();

// 		detials.bankName = "State Bank Of India (SBI)";
// 		detials.accountHolderName = "Ankush verma";
// 		detials.accountNumber = 12345678912L;
// 		detials.ifscCode = "19CDB23";
// 		detials.branch = "Bhopal";

// 		detials.sbi();
// 		detials.getpersonInformation();
// 	}

// }

// ____________________________________________________________________________________________________________________________________________________



// BLC 
// ----
// package com.ankush.labday_12oops;
// //BLC

// public class Student 
// {
//   String name;
//   int rollNo;
//   String stream;
//   String course;
//   String batchNo;
//   String coachingCenter;
//   String CoachingPlace;
  
  
//   public void getInformation()
//   {
// 	  System.out.println("Student name : "+name);
// 	  System.out.println("Student Roll number : "+rollNo);
// 	  System.out.println("Student Branch : "+stream);
// 	  System.out.println("Student course : "+course);
// 	  System.out.println("Student Batch no. : "+batchNo);
// 	  System.out.println("Student Coaching center : "+coachingCenter);
// 	  System.out.println("Student Coaching Place in : "+CoachingPlace);
	  
//   }
  
//   public void learn()
//   {
// 	  System.out.println("Currently Student learn Full Stack Java!!");
//   }
  
  
  
// }


// ELC
// ----
// package com.ankush.labday_12oops;
// //ELC
// public class StudentDetials 
// {

// 	public static void main(String[] args) 
// 	{
		
// 		Student student = new Student();
		
// 		  student.name="Ankush Verma";
// 		  student.rollNo=211014;
// 		  student.stream="Computer Science";
// 		  student.course="Java";
// 		  student.batchNo = "J42";
// 		  student.coachingCenter="naresh Insititute technology (NARESH iT)";
// 		  student.CoachingPlace = "Hydrabad";
		  
// 		  student.getInformation();
		  
// 		  student.learn();

// 	}

// }

// =======================================================================================================================================================================================================