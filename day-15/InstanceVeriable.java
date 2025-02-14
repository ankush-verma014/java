// Instance variable 
//parmeter



// Program 01 :
// ------------
// Create a BLC(Business Logic Class) called Bowler. Add below details to the class. 

// 1. Instance variables:
//  name: String
//  wickets: int
//  matches: int,
//  balls_bowled: int,
//  runs_conceded: int. 

// 2. Method - bowlerDetails() : public void

// Create a method name called bowlerDetails() that accepts name, wickets, matches, balls_bowled and runs_conceded.

// Method name: bowlerDetails 

// Return type: void


// 3. Create below public methods,
//  Method name: computeBowlingAverage
//  Return type: void

//  This method should print the bowling average of the bowler by dividing runs_conceded with wickets.

//  Input:
//  name = "Sachin",
//  wickets = 10,
//  matches = 5,
//  balls_bowled = 750,
//  runs_conceded 463.

//  Output:
//  Name: Sachin
//  bowling_avg=46.3
//  Note: a. If any values are negative print 'Error'.

//  b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

//  Method name: computeStrikeRate
//  Return type: void

// This method should print the Strike Rate of the bowler by dividing runs_conceded with balls_bowled.

//  Input:
//  name = "Sachin",
//  wickets = 10,
//  matches = 5,
//  balls_bowled = 750,
//  runs_conceded 463.

//  Output:
//  Name: Sachin
//  Strike_rate=0.61733335
//  Note: a. If any values are negative print 'Error'.

//  b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

//  Method name: showStatistics
//  Return type: void

//  This method should print the details of the batter.
//  Input:
//  name = "Sachin",
//  wickets = 10,
//  matches = 5,
//  balls_bowled = 750,
//  runs_conceded 463.

//  Output:
//  Name=Sachin
//  wickets=10
//  matches=5

//  balls_bowled=750
//  runs_conceded=463

//  Note: a. If any values are negative print 'Error'.

//  b. If runs_conceded or balls_bowled are greater than 0 when matches are 0 print 'Error'.

//  An ELC(Executable Logic Class) Test that contains main method. Use this class to test your code.

// Sol: 
// BLC
// ____
// package com.ankush.labday15instaceandstaticrole;

// public class Bowler 
// {
//     String bowlerName;
//     int bowlerWicket;
//     int bowlerMatch;
//     int ballsBowled;
//     int runsConceded;
    
    
//     public void bowlerDetials(String Name,int Wicket,int Match,int Bowled,int Conceded)
//     {
//            bowlerName   = Name;
//     	   bowlerWicket=Wicket;
//     	   bowlerMatch = Match;
//     	   ballsBowled = Bowled;
//     	   runsConceded = Conceded;
// //    	   System.out.println("Name :"+Name);
//     }
    
//     public void computeBowlingAverage()
//     {
//     	double bowlingAvg=0;
//     	if(bowlerWicket<=0||bowlerMatch<=0||ballsBowled<=0||runsConceded<=0)
//     	{
//     		System.out.println("Error");
//     	}
//     	else 
//     	{
//     		bowlingAvg= ((double)runsConceded/bowlerWicket);
//     		System.out.println("Name :"+bowlerName);
//     		System.out.println("bowling average is : "+bowlingAvg);
//     	}	
    	
//     }
    
    
// 	public void computeStrikeRate()
// 	{
// 		double strikeRate=0;
//     	if(bowlerWicket<=0||bowlerMatch<=0||ballsBowled<=0||runsConceded<=0)
//     	{
//     		System.out.println("Error");
//     	}
//     	else
//     	{
//     		strikeRate=(double) runsConceded/ballsBowled;
//     		System.out.println("Name :"+bowlerName);
//     		System.out.println("Strike Rate : "+strikeRate);

//     	}
// 	}
    	
//     	public void showStatistics()
//     	{
//         	if(bowlerWicket<=0||bowlerMatch<=0||ballsBowled<=0||runsConceded<=0)
//         	{
//         		System.out.println("Error");
//         	}
//         	else 
//         	{
//         		System.out.println("Name :"+bowlerName);
//         		System.out.println("Wickets :"+bowlerWicket);
//         		System.out.println("matches :"+bowlerMatch);
//         		System.out.println("Balls_bowled :"+ballsBowled);
//         		System.out.println("Runs_conceded :"+runsConceded);
//         	}
//     	}   
    
// }


// ELC
// ____
// package com.ankush.labday15instaceandstaticrole;

// public class BowlerDetials 
// {

// 	public static void main(String[] args) 
// 	{
// 		Bowler b = new Bowler();
// 		b.bowlerDetials("Sachin", 10, 4, 750, 463);
// 		b.computeBowlingAverage();
// 		System.out.println("------------------------------------------------------");
// 		b.computeStrikeRate();
// 		System.out.println("------------------------------------------------------");
// 		b.showStatistics();
// 		System.out.println("------------------------------------------------------");


// 	}

// }

// ======================================================================================================================================================================================================
// -----------------------------------------------------------------------
// Program 02 :
// ------------
// Class Batter is given to you. Add below details to the class

//  1. Instance variables:
//  name: String,
//  runs: int,
//  matches: int,
//  batting_avg: float.

// 2.  Method batterDetails() : public void

// Create a method name called batterDetails() that accepts name, runs, matches.

// Method name: batterDetails
// Return type: void

//  3. Create below public methods,
//  Method name: computeBattingAverage
//  Return type: void

//  This method should print the batting average of the batter by dividing run with matches.

//  Input: 

//  Name: "Sachin"
//  Runs: 18000
//  Matches: 463



//  Output:
//  Name: Sachin
//  Batting_Avg: 38.87689

//  Note: a. If runs or matches values are negative print 'Error'.

//  b. If runs are greater than 0 when matches are 0 print 'Error'.

//  Method name: getStatistics
//  Return type: void
//  This method should print the details of the batter.

//  Input: 
// Name: "Sachin"
// Runs: 18000
// Matches: 463

//  Output:
//  Name: Sachin
//  Runs: 18000
//  Matches: 463


//  Note: a. If runs or matches values are negative print 'Error'.
//  b. If runs are greater than 0 when matches are 0 print 'Error'.

//  Given an ELC(Executable Logic class) class for Testing that contains main method. Use this class to test your code.

// Sol:

// BLC
// ____
// package com.ankush.labday15instaceandstaticrole;

// public class Better 
// {
//   String betterName;
//   int betterRuns;
//   int betterMatch;
//   float betterAvg;
  
//   public void batterDetails(String name,int runs,int matches)
//   {
// 	  betterName = name;
// 	  betterRuns = runs;
// 	  betterMatch = matches;
//   }
  
//   public void computeBattingAverage()
//   {
// 	  if(betterRuns<=0 || betterMatch<=0)
// 	  {
// 		  System.out.println("Error");
// 	  }
// 	  else
// 	  {
// 	    betterAvg = (float)betterRuns/betterMatch;
// 	    System.out.println("Name :"+betterName);
// 	    System.out.println("Batting Avg is : "+betterAvg);
// 	  }
//   }
  
//   public void getStatistics()
//   {
// 	  if(betterRuns<=0||betterMatch<=0)
// 	  {
// 		  System.out.println("Error");
// 	  }
// 	  else
// 	  {
// 		  System.out.println("Name :"+betterName);
// 		  System.out.println("Runs :"+betterRuns);
// 		  System.out.println("Matches :"+betterMatch);
// 	  }
//   } 
  
// }


// ELC
// ____
// package com.ankush.labday15instaceandstaticrole;

// public class BetterDetials 
// {

// 	public static void main(String[] args) 
// 	{
// 		Better b = new Better();
// 		b.batterDetails("Sachin", 18000, 463);
// 		b.computeBattingAverage();
// 		System.out.println("-------------------------------------------");
// 		b.getStatistics();
		
// 	}

// }
