// Question - 1
// --------------
//  Design sports Model system

// Create  a class name Sports (BLC Class)


// Atributes :

// name 			Return Type
// -------			--------------
// sportName            :String 

// teamSize		      :int 

// sportType              :String 

// Acess modifier  :private (for all varriable)

// Take a no parameterized constructor and initialize all the default values to varriables.

// Take one more constructor with two parameteres sportName and teamSize
// and intialize with user values and write the validation logic

// Take another constructor with 3 parameters and intialize all the values and check the validation.

// Methods  :

// Method Name     : displayInfo
// Return Type 	     : void
// Acess Modifier    : public 

// and in this method to print all the details of the class.


// Take a Main Class(ELC Class)wich having main method and instatiate the object and execute the method.

// Test Cases:
// -------------

// for teamSize. If teamSize is less than or equal to zero, it sets teamSize to 0 and prints an error message.

// Test Case 1: Valid sport with name and team size
// Sport Name: Football
// Team Size: 11
// Sport Type: Unknown

// Expected Output :
// ---------------------
// (print the details)

// Test Case 2: Invalid sport with negative team size
// Error: Team size must be positive.
// Sport Name: Volleyball
// Team Size: -1
// Sport Type: Unknown

// Expected Output :
// ---------------------
// Error: Team size must be positive.

// Sol:
// package com.ankush.senariobased_constructor_overloading_labday24;

// public class Sports 
// {
//   private String sportName;
//   private int teamSize;
//   private String sportsType;
  
  
//   public Sports()
//   {
// 	   this.sportName = "Unknown";
// 	   this.teamSize = 0;
// 	   this.sportsType = "Unknown";
	  
//   }
//   public Sports(String sportName, int teamSize)
//   {
// 	  this.sportName = sportName;
// 	  this.teamSize = teamSize;
//   }
//     public Sports(String sportName, int teamSize, String sportsType) 
//     {
//        	super();
// 	   this.sportName = sportName;
// 	   this.teamSize = teamSize;
// 	   this.sportsType = sportsType;
	  
//     }

//     public void displayInfo()
//    {
// 	 System.out.println("Sports Name is: "+sportName);
// 	 System.out.println("Sports team size is: "+teamSize);
// 	 System.out.println("Sports Type is: "+sportsType);
	 
//    }
  
  
  
// }
// ________________


// package com.ankush.senariobased_constructor_overloading_labday24;

// import java.util.Scanner;

// public class SportsDetails 
// {

// 	public static void main(String[] args) 
// 	{
// 		Scanner sc = new Scanner(System.in);
		
// 		System.out.print("Enter a Sports Name: ");
// 		String sportsName = sc.nextLine();
		
// 		System.out.print("Enter a Team Size: ");
// 		int teamSize = sc.nextInt();
		
// 		System.out.print("Enter a Sport type: ");
// 		String sportSize = sc.next();
// 		sportSize = sc.next();
		
// 		Sports s = new Sports(sportsName, teamSize, sportSize);
		
// 		if(teamSize<=0)
// 		{
// 			System.out.println("Error: Team size must be positive.");
// 		}
// 		else 
// 		{
// 			System.out.println("Print detilas");
// 			s.displayInfo();
// 		}
		
//          sc.close();
// 	}

// }
// ___________________________________________________________________________________________

// ============================================================================================================================================================================================================================


// Question -2
// ---------------
// TimeFormatter (Class as a return type and Class as an argument

// A class called  Time is given to you. The task is to create and return a new time object in terms of hours,minutes and seconds by adding two Time objects.

// Define the following for the class.

// Attributes :

// name 
// -------
// hh,mm,ss as private  :-for all (int) is data type and (private) is acessmodifier

// Constructor :

// 	default : Create a no-parameterize constructor. Initialize all attributes to 0.

// 	paramterized : Create a public parameterized constructor for hours,minutes and seconds in the same sequence.

// Methods :

// 	Name of the method : show 

// 	Return Type 	: void

// 	Modifier	: public

// 	Task : It must display the time in hours:minutes:seconds format. 

//        Name Of the method : add  

// 	Return Type 	: Time

// 	Modifiers:	: public,static

// 	Arguments	: 2Time arguments.

// 	Task		: Add the time


// Take a ELC Class TimeTester class having main method instatiate the object and check the taste cases.


// Example : 

//   Sample Input :

// 	time 1 : 2:30:40

// 	time 2 : 4:40:21 

// Expected	output :

// Result : 7:11:1


// Sol:
// package com.ankush.senariobased_constructor_overloading_labday24;

// public class Time 
// {
//      int hh;
//       int mm;
//      int ss;
     
//      public Time()
//      {
//     	 this.hh = 0;
//     	 this.mm = 0;
//     	 this.ss = 0;
    	 
    	 
//      }

// 	public Time(int hh, int mm, int ss) 
// 	{
// //		super();
// 		this.hh = hh;
// 		this.mm = mm;
// 		this.ss = ss;
// 	}
	
	
	
// 	public void show()
// 	{
// 		System.out.println("The time1 is: "+hh+":"+mm+":"+ss);
// 	}
	
	

// }
// ____________
// package com.ankush.senariobased_constructor_overloading_labday24;

// import java.util.Scanner;

// public class TimeTester 
// {

// 	public static void main(String[] args)
// 	{
// 		Scanner sc = new Scanner(System.in);
		
// 		System.out.print("Enter a time1 in Hours:");
// 		int hh = sc.nextInt();
// 		System.out.print("Enter a time1 in minutes:");
// 		int mm = sc.nextInt();
// 		System.out.print("Enter a time1 in Seconds:");
// 		int ss = sc.nextInt();
		
// 		System.out.print("Enter a time2 in Hours:");
// 		int hh1 = sc.nextInt();
// 		System.out.print("Enter a time2 in minutes:");
// 		int mm1 = sc.nextInt();
// 		System.out.print("Enter a time2 in Seconds:");
// 		int ss1 = sc.nextInt();
		
// 		Time t = new Time(hh,mm,ss);
// 		t.show();
		
// 		Time t1 = new Time(hh1,mm1,ss1);
// 		t1.show();
	
		
//         Time result = add(t,t1);
// 		System.out.println("Result : "+result.hh+":"+result.mm+":"+result.ss);
		
           
// 	}
	
// 	public static Time add(Time t, Time t1)
// 	{
// 		int sec = t.ss + t1.ss;
// 		int min = t.mm +  t1.mm+(sec/60);
// 		sec = sec % 60;
// 		int hour = t.hh + t1.hh +(min/60);
// 		min = min % 60;
// 		return new Time(hour,min,sec);
// 	}

// }
// ______________________________________________________________________________

// ============================================================================================================================================================================================================================


// Question - 3 [Copy Constructor]
// --------------
// Take a class Student(BLC Class)

// Attributes:
 
// names		dataType
// ---------		-----------
// studentId         :  int
// studentName   : String
// studentAge      : int

// Access Modifier :private for all varriables

// take one no-parameterize constructor and initialize with default value.

// Take one parameterize constructor to initialize all the attributes.

// devlop getter and setter method to acess the private properties



// Methods:


// Name Of the method 	: showDetails()  

// 	Return Type 		: void

// 	Modifiers:		: public


// Take one more (BLC Class) Player .

// Attributes:

// names		dataType
// ---------		-----------
// playerId 		 int
// playerName    String
// playerAge        int

// Access Modifier :private for all varriables


// create a Copy constructor that takes a Student object and initializes the Player object's attributes using the Student object's attributes.

// Methods :

// Name Of the method 	: showDetails()  

// 	Return Type 		: void

// 	Modifiers:		: public


// Name Of the method 	: updateName(String newName)

//     Return Type 		: void

// 	Modifiers:		: public

// Public method to update the player's name.


// Name Of the method 	: isEligible()  

//     Return Type 		: void

// 	Modifiers:		: boolean

// method that returns a boolean indicating if the player is eligible (e.g., age must be at least 18).


// Take one Main class(ELC Class) which is having main method  and instantiate the both class object and check all the terms and conditions.


// Test cases :
// --------------
// case-1
// --------
// Sample Input :
// id=-3(Negative ID)

// Expected Output:
// Error: Student ID cannot be negative.

// case-2
// --------
// Sample Input :
//  name =""(Empty Name)

// Expected output :
// Error: Student name cannot be empty.


// case-3
// --------
//  Normal Scenario with Eligibility Check

// SAmple Input :
//  Student ID: 2, Name: Jane Smith, Age: 17
// Player Details: Player ID: 2, Name: Jane Smith, Age: 17
// Is Player Eligible? false

// Expected Output :
// (print all the details )


// Sol:
// package com.ankush.senariobased_constructor_overloading_labday24;

// public class Student 
// {
//    private int studentId;
//    private String studentName;
//    private int studentAge;
   
//    public Student()
//    {
// 	   this.studentId = 0;
// 	   this.studentName = null;
// 	   this.studentAge = 0;
	   
//    }

//      public Student(int studentId, String studentName, int studentAge) 
//      {
// 	    super();
// 	   this.studentId = studentId;
// 	   this.studentName = studentName;
// 	   this.studentAge = studentAge;
//      }

// 	public int getStudentId() {
// 		return studentId;
// 	}

// 	public void setStudentId(int studentId) {
// 		this.studentId = studentId;
// 	}

// 	public String getStudentName() {
// 		return studentName;
// 	}

// 	public void setStudentName(String studentName) {
// 		this.studentName = studentName;
// 	}

// 	 public int getStudentAge()
// 	 {
// 		 return studentAge;
// 	 }
    
// 	 public void setStudentAge(int studentAge)
// 	 {
// 		 this.studentAge = studentAge;
// 	 }
	 
	 
// 	 public void showDetails()
// 	 {
// 		 System.out.println("Student Id is: "+studentId);
// 		 System.out.println("Student Name is: "+studentName);
// 		 System.out.println("Student Age is: "+studentAge);
// 	 }
	 
	 
	 
	 
// }
// ___________

// package com.ankush.senariobased_constructor_overloading_labday24;

// public class Player 
// {
//    private int playerId;
//    private String playerName;
//    private int playerAge;
   
//    public Player(Student s)
//    {
// 	   this.playerId = s.getStudentId();
// 	   this.playerName = s.getStudentName();
// 	   this.playerAge = s.getStudentAge();
	   
//    }
     
//      public void showDetails()
//      {
//     	 System.out.println("Player Id is: "+playerId);
//     	 System.out.println("Player Name is: "+playerName);
//     	 System.out.println("Player Age is: "+playerAge);
//      }
     
//      public void updateName(String newName)
     
//      {
   
//     	 this.playerName = newName;
//      }
     
//      public boolean  isEligible()
//      {
//     	 return playerAge>=18;
    	 
//      }
// }
// _________
// package com.ankush.senariobased_constructor_overloading_labday24;

// import java.util.Scanner;

// public class Test {

// 	public static void main(String[] args) 
// 	{
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter Student Id:");
//         int id = sc.nextInt();
        
//         System.out.print("Enter Student Name:");
//         String name = sc.nextLine();
//         name = sc.nextLine();
       
        
//         System.out.print("Enter Student Age:");
//         int age = sc.nextInt();
        
//         System.out.print("Enter update Player Name:");
//         String newName = sc.nextLine();
//         name = sc.nextLine();
        
        
//         Student student = new Student(id, name, age);
//         Player player = new Player(student);
        
//         if(id<0)
//         {
//         	System.out.println("Error: Student ID cannot be negative.");
//         }
//         else if(name.isEmpty())
//         {
//         	System.out.println("Error: Student name cannot be empty.");
//         }
//         else
//         {
//              System.out.println("Student Details:");	
//         	student.showDetails();
//         	System.out.println("Player Details:");
//         	System.out.println("Update Player Name:"+newName);
//         	player.showDetails();
//         	System.out.println("Is Player Eligible? "+player.isEligible());	
        	
//         }
        
//         sc.close();
        
        
        
// 	}

// }
// ______________________________________________________________________________________
// ============================================================================================================================================================================================================================