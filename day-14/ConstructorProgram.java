     // parameter 




// Program 01 :
// ------------
// A BLC (Business Logic Class) called Student is given to you.
// Instance Variables: 
// studentId :int
// studentName : String
// marks: int
// grade: char

// method : calculateGrade():public:void

// Create a method public void setStudentData() with the parameters: studentId, studentName, marks.

// Note that grade is not set through method because it is a calculated value.

// Methods :
// displayDetails(): This method should return a String with  the details of the student in the following format:
// Student [name=John Smith, studentId=123, marks=95, grade=A] 

// calculateGrade(): This is a public method that calculates the grade based on the marks that is set. 
// If marks is above 90, grade is set to A. 
// If marks is between 81 and 90, grade is set to B, 
// if marks is between 71 and 80, grade is set to C, 
// if marks is between 61 and 70, grade is set to D, 
// if marks is less than 61, grade is set to E.
// Use this method when you need to set or reset grade.

// An ELC(Executable Logic class) Tester with main method is given to you to test your code.

// Sol:

// BLC
// ____
// package com.ankush.constructor_labday14elcblc;
// //BLC
// public class Student 
// {
//    int studentId;
//    String studentName;
//    int studentMarks;
//    char studentGrade;
   
//    public void calculateGrade()
//    {
// 	   if(studentMarks>90)
// 	   {
// 		   studentGrade = 'A';
// 	   }
// 	   else if (studentMarks>=81 && studentMarks<=90)
// 	   {
// 		   studentGrade = 'B';
// 	   }
// 	   else if (studentMarks>=71 && studentMarks<=80)
// 	   {
// 		   studentGrade = 'c';
// 	   }
// 	   else if (studentMarks>=61 && studentMarks<=70)
// 	   {
// 		   studentGrade = 'D';
// 	   }
// 	   else {
// 		   studentGrade = 'E';
// 	   }
//    }
   
//    public void setStudentData(int Id,String name,int marks)
//    {
// 	   studentId=Id;
// 	   studentName=name;
// 	   studentMarks=marks;
//    }
   
//    public String displayDetials()
//    {
// 	    return "[Student Id is :" +studentId+", Student Name is : "+ studentName +", Student Mark is :"+ studentMarks+ ", Student Garde is :"+ studentGrade +"]";
//    }
   
// }


// ELC
// ____
// package com.ankush.constructor_labday14elcblc;

// public class StudentDetials {

// 	public static void main(String[] args) 
// 	{
// 		Student s = new Student();
// 		s.setStudentData(101, "Ankush", 79);
// 		s.calculateGrade();
// 		System.out.println(s.displayDetials());

// 	}

// }


// ===========================================================================================================================================================================================================

// Program 02 :
// ------------
// Create a BLC class Employee class with properties 

// String firstName
// String lastName
// int employeeId
// double salary
// int noOfProject


// Create a setEmployeeData() method with 5 parameters to initialize all the instance variables.

// Implement calculateSalary() method that will add extra ammount in salary based on NoOfProject by using following criteria.

// NoOfProject is more than 5 and less that 10 then add 5000.
// NoOfProject is more than 10 and less that 20 then add 10000.
// NoOfProject is more than 20 then add 15000. 	

//  Take a method called displayDetails() to display the salary.

//  Take an ELC class Tester to test your logic.


// Sol:

// BLC
// ______
// package com.ankush.constructor_labday14elcblc;
// //BLC
// public class Employee 
// {
//      String firstName;
//      String lastName;
//      int employeeId;
//      double salary;
//      int noOfProject;
     
     
//      public void setEmployeeData(String fName,String lName,int Id,double sal,int project)
//      {
//     	 firstName=fName;
//     	 lastName=lName;
//     	 employeeId=Id;
//     	 salary=sal;
//     	 noOfProject=project;
    	 
//      }
     
//       public double calculateSalary()
//        {
    	
//     	  if (noOfProject>5 && noOfProject<=10 ) 
//     	 {
// 			 salary=salary+5000;
// 		 }else if(noOfProject>10 && noOfProject<=20) 
// 		 {
//     	   salary= salary+10000;
    
// 		 } 
// 		 else if(noOfProject>20)
// 		 {
// 		  salary=salary+15000;
// 		 }
//     	 return salary;
    	  
//       }
     
     
//       public String displayDetials()
//       {
//    	    return "[Employee first name is  :" +firstName+"\nEmployee last Name is : "+ lastName +"\nEmployee Id is :"+ employeeId+ "\nEmployee Salary is :"+ salary +"\nEmployee project is :"+noOfProject+"]";
//       }     
     
// }



// ELC
// _____

// package com.ankush.constructor_labday14elcblc;
// //ELC
// public class EmployeeDetials {

// 	public static void main(String[] args) 
// 	{
// 		Employee e= new Employee();
	    
// 		e.setEmployeeData("Ankush", "Verma", 101, 10000.0, 12);
// 		e.calculateSalary();
// 		System.out.println(e.displayDetials());
// 	}

// }


// ===========================================================================================================================================================================================================
