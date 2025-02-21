// Program 01 :
// -----------
// Create a Loan class to calculate loan payments based on principal, interest rate, and duration.

// Class name Loan with the Instance variable double principal ,private  
//  double interestRate ,private
//  int durationMonths ,private
// 1.Create a public constructor with parameters are principal,interestRate and durationMonths. To initialise the instance variable.
// Access modifier:-

// public

// If any parameter value is 0 the print "Error".

// 2.Create a method name as calculateMonthlyPayment().Public method to calculate the monthly loan payment

// Access modifier:-
// public
// return type:-
// double
// 3.Create a method name as getPrincipal().To get the principal amount

// Access modifier:-

// public

// return type:-

// double

// 4.Create a method name as getInterestRate().To get the interest rate

// Access modifier:-

// public
// return type:-
// double

// 5.Create a method name as getDurationMonths().To get the loan duration in months

// Access modifier:-
// public
// return type:- 

// int
// Create a Class CheckLoan to check your functionalities of the class.Like to intialise the instance variable which is present in Loan class.

// Program-2
// ----------

// Design a Movie class with attributes like title, release year, and genre.

// Create a class Movie (Business Logic Class)
// Instance Variables: 
// String title - private
// int releaseYear - private
// String genre - private


// Create a parameterized constructor to initialilize all the fields.
// Create getters and setters method for all the fields.

// Create another class Main which contains main method (ELC class) which will receive all the instance variable value from BLC class.
// Use elc class for:-
// // Accessing movie details using getters
// // Modifying movie details using setters
// // Displaying modified movie details


// Sol : 


// package com.ankush.labday20_encapsulation;

// public class MovieDetials 
// {
// 	public static void main(String[] args) 
// 	{
// 		Movies m = new Movies("Sanam Teri kasm", 2016, "LoveStory");
//           System.out.println("Movie Title : "+m.getTitle());
//           System.out.println("Movie realese Year :"+m.getReleaseYear());
//           System.out.println("Movie Genre is :"+ m.getGenre());
//           System.out.println(" ");
          
//           System.out.println("Modifying movie details.");
//           System.out.println("     ");
          
//           m.setTitle("Aashiqui 2");
//           m.setReleaseYear(2013);
//           m.setGenre("Romatic Love");
//           // display
//           System.out.println("Movie Title : "+m.getTitle());
//           System.out.println("Movie realese Year :"+m.getReleaseYear());
//           System.out.println("Movie Genre is :"+ m.getGenre());     
         
// 	}
// }


//  class Movies 
// {
// 	private String title;
// 	private int releaseYear;
// 	private String genre;
	
// 	public Movies(String title,int releaseYear,String genre)
// 	{
// 		this.title = title;
// 		this.releaseYear = releaseYear;
// 		this.genre = genre;
		
// 	}

// 	public String getTitle() 
// 	{
// 		return title;
// 	}

// 	public void setTitle(String title) 
// 	{
// 		this.title = title;
// 	}

// 	public int getReleaseYear() 
// 	{
// 		return releaseYear;
// 	}

// 	public void setReleaseYear(int releaseYear) 
// 	{
// 		this.releaseYear = releaseYear;
// 	}

// 	public String getGenre() 
// 	{
// 		return genre;
// 	}

// 	public void setGenre(String genre) 
// 	{
// 		this.genre = genre;
// 	}
	
// }



// ===================================================================================================================================================================================================================