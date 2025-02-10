//                                  MCQ
//                               ____________


// Q1) Find the output of the following program

// class Test 
// {
// 	public static void main(String[] args) 
// 	{
// 		for(;false;)
// 		System.out.println("Hello World!");
// 	}
// }

// Ans : error: unreachable statement

// __________________________________________________________________________________________________________________________________________________________________________________________________________________________

// Q2) Find the output of the following program

// public class Test
// { 
//   public static void main(String [ ] args) 
//    { 
//      int a=1;
//      switch(a) 
//      { 
//        default: 
//        System.out.println("You choose correct option"); 
//      }
//    }
// }

// Ans : You choose correct option

// __________________________________________________________________________________________________________________________________________________________________________________________________________________________


// Q3) Find the output of the following program
// class Test28 
// {
//     public static void main(String[] args) 
//     {
// 	for(int i=0; i <= 3 ; i++)
//     {
//     switch(i)
//     {
//     case 0:
//     System.out.println("i is 0");
//     break;
//     case 1:
//     System.out.println("i is 1");
//     break;
//     case 2:
//     System.out.println("i is 2");
//     break;
//     default:
//     System.out.println("i is grater than 2");
//     }
// }

// }
// }

// Ans : 
 
// i is 0
// i is 1
// i is 2
// i is grater than 2

// __________________________________________________________________________________________________________________________________________________________________________________________________________________________


// Q4) Find the output of the following program
// class Test 
// {
// 	public static void main(String[] args) 
// 	{
// 		byte b =2;		
// 		switch(b)
// 		{	case 23:
// 			case 128:
// 		}		
// 	}
// }

// Ans :  error

// __________________________________________________________________________________________________________________________________________________________________________________________________________________________

// Q5) Find the output of the following program
// public class Test
// {
//       public static void main(String[] argv)
//       {
//            final int a = 1;
//             int b=  2;
            
//            int x = 0;
//            switch (x) 
//            {
//                  case a:     
//                  case b:     
//            }
//      }
// }

// Ans :   error: constant expression required

// __________________________________________________________________________________________________________________________________________________________________________________________________________________________

// Q6) Find the output of the following program
// public class Test
// {
//        public static void main(String[] argv)
//        {
//              int temp = 90;
//              switch(temp) 
//              {
//                   case 80 :  System.out.println("80");
//                   case 80 :  System.out.println("80");   
//                   case 90 :  System.out.println("90");
//                   default :  System.out.println("default");
//              }
//        }
// }

// Ans : error: duplicate case label

// __________________________________________________________________________________________________________________________________________________________________________________________________________________________

// Q7) Find the output of the following program

// public class Test
// {
//         public static void main(String[] argv)
//         {
//                int x = 1;
//                switch(x) 
//                {
//                      case 1: 
//                      {
//                            System.out.println("x is one"); 
//                            break;
//                      }
//                      case 2:  
//                      {
//                            System.out.println("x is two"); 
//                            break;
//                      }
//                      case 3:  
//                      {
//                            System.out.println("x is two");  break;
//                      }
//                }
//                System.out.println("out of the switch");
//        }
// }

// Ans : 
//  x is one
// out of the switch

// __________________________________________________________________________________________________________________________________________________________________________________________________________________________

// Q8) Find the output of the following program

// public class Test
// {
//        public static void main(String[] argv)
//        {
//             int x = 2;
//             switch (x) 
//             {
//                  case 2:
//                  case 4:
//                  case 6:
//                  case 8:
//                  case 10: {
//                             System.out.println("x is an even number");  break;
//                           }
//             }
//       }
// }

// Ans :  x is an even number

// __________________________________________________________________________________________________________________________________________________________________________________________________________________________

// Q9) Find the output of the following program
// public class Test
// {
//        public static void main(String[] argv)
//        {
//              int x = 2;
//              switch (x) 
//              {
//                    case 2:  System.out.println("2");
//                    default: System.out.println("default");
//                    case 3: System.out.println("3");
//                    case 4: System.out.println("4");
//              }
//         }
// }

// Ans :  
//  2
// default
// 3
// 4

// __________________________________________________________________________________________________________________________________________________________________________________________________________________________

// Q10) Find the output of the following program

// public class Test
// {
//       public static void main(String[] argv) 
//       {
//            short x = 200;
//            switch( x ) {
//                   case 100 : System.out.println("One hundred");break ;
//                   case 200 : System.out.println("Two hundred");break ;
//                   case 33000 : System.out.println("Thirty thousand ");break ;
//           }
//       }
// }

// Ans : error
// __________________________________________________________________________________________________________________________________________________________________________________________________________________________

// Q11) Find the output of the following program

// public class Test
// {
//       public static void main(String[] argv) 
//       {
//            long  x = 400;
//            switch( x ) {
//                   case 100 : System.out.println("One hundred");break ;
//                   case 200 : System.out.println("Two hundred");break ;
//                   case 400 : System.out.println("Three hundred");break ;
//           }
//       }
// }

// Ans : error

// __________________________________________________________________________________________________________________________________________________________________________________________________________________________

// Q12) Find the output of the following program

// public class Test 
// {
//       public static void main(String[] argv) 
//       {
//            int j = 3;
//            switch (j) 
//            {
//                 case 2:
//                       System.out.println("value is two");
//                 case 2 + 1:
//                      System.out.println("value is three");
//                      break;
//                 default:
//                      System.out.println("value is " + j);
//                      break;
//           }
//     }
// }

// Ans : value is three

// __________________________________________________________________________________________________________________________________________________________________________________________________________________________

// Q13) Find the output of the following program

// class Test 
// {
//         public static void main(String args[]) 
//         {    
//           final int a=10,b=20;
//           while(a<b)
//           { 
//           System.out.println("Hello");
//           }
//           System.out.println("World"); 
//         } 
// }

// Ans :  error

// __________________________________________________________________________________________________________________________________________________________________________________________________________________________

// Q14) Which of these selection statements test only for equality?

// a) if
// b) switch
// c) if & switch
// d) none of the mentioned

// Ans : switch
 
// __________________________________________________________________________________________________________________________________________________________________________________________________________________________


// Q15) Find the output of the following program

// public class Test
// {
//       public static void main(String[] argv)
//       {
//             String s = "xyz";
//             switch (s.length()) 
//             {
//                  case 1:
//                        System.out.println("length is one");
//                        break;
//                  case 2:
//                        System.out.println("length is two");
//                        break;
//                  case 3:
//                        System.out.println("length is three");
//                        break;
//                  default:
//                        System.out.println("no match");
//            }
//       }
// }

// Ans : length is three
