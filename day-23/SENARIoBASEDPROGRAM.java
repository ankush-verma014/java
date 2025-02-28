// Program 01 :
// ------------
// Create a program to find out the Student Grade based on Student Marks :

// Create a BLC class Student

// Instance Variables :
// name : String : private 
// marks : int : private

// Create a parameterized constructor to initialize all the fields.

// Define setter and getter for all fields.

// Override toString() method which will return only the name of the 
// student from this method.

// Creaate another BLC class StudentGrade.

// Instance Variables :
// student : Student : private 
// studentGrade : char : private

// Create a parameterized constructor to initialize all the fields.

// Define setter and getter for all fields.

// Override toString() method to print the following details :

// [The Student Raj has 'A' Grade]


// Create another class CalculateStudentGrade which does not contain any field (Variable)

// Methods :
// Name of the Method : calculateGrade()  [Factory Methdo]
// return type : StudentGrade 
// Access Modifier : public, static
// Argument : Student 

// In calculateGrade() method, task is to find the Student grade based on the Student marks and create and return the StudentGrade
// object on the following criteria :

// Student Marks                 Grade
// > 90                            A
// >= 75                           B
// >= 60                           C
// < 60                            D

// Create an ELC class StudentGradeCalculator which contains main method to test the application.

// Sol:

// package com.ankush.senario_based_program_day23;

// public class Student 
// {
//    private String name;
//    private int marks;
   
//   public Student(String name, int marks) 
//   {
// 	super();
// 	this.name = name;
// 	this.marks = marks;
	
//   }

// public String getName() 
// {
// 	return name;
// }

// public void setName(String name)
// {
// 	this.name = name;
// }

// public int getMarks() 
// {
// 	return marks;
// }

// public void setMarks(int marks) 
// {
// 	this.marks = marks;
// }

// @Override
// public String toString() 
// {
// 	return name;
// }

   
   
   
// }

// package com.ankush.senario_based_program_day23;

// public class StudentGrade 
// {
//   private Student student;
//   private char studentGrade;
  
// public StudentGrade(Student studnet, char studentGrade)
// {
// 	super();
// 	this.student = studnet;
// 	this.studentGrade = studentGrade;
// }

// public Student getStudnet() 
// {
// 	return student;
// }

// public void setStudnet(Student studnet) 
// {
// 	this.student = studnet;
// }

// public char getStudentGrade() 
// {
// 	return studentGrade;
// }

// public void setStudentGrade(char studentGrade) 
// {
// 	this.studentGrade = studentGrade;
// }

// @Override
 // public String toString() 
// { 
// 	return "[ The student "+student.getName()+ "has "+studentGrade+" Grade. ]";
// }
  
  
// }

// package com.ankush.senario_based_program_day23;

// public class CalculateStudentGrade 
// {
//    public static StudentGrade CalculateGrade(Student s1)
//    {
// 	   if(s1.getMarks()>90)
// 	   {
// 		   return new StudentGrade(s1, 'A');
// 	   }
// 	   else if(s1.getMarks()>=75)
// 	   {
// 		   return new StudentGrade(s1, 'B');
// 	   }
// 	   else if(s1.getMarks()>=60)
// 	   {
// 		   return new StudentGrade(s1, 'C');
// 	   }
// 	   else
// 	   {
// 		   return new StudentGrade(s1, 'D');
// 	   }
//    }
// }

// package com.ankush.senario_based_program_day23;

// import java.util.Scanner;

// public class StudentGradeCalculator 
// {

// 	public static void main(String[] args) 
// 	{
		
// 		Scanner sc = new Scanner(System.in);
// 		System.out.print("Enter a Student Name :");
// 		String name = sc.nextLine();
		
// 		System.out.print("Enter a Student Marks :");
// 		int marks = sc.nextInt();
		
// 		sc.close();
// 		Student s = new Student(name,marks);
// 		StudentGrade calculateGrade = CalculateStudentGrade.CalculateGrade(s);
		
// 	       System.out.println(calculateGrade); 
// 	}

// }



