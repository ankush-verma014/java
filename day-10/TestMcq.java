// //               MCQ TYPE QUESTION


// Q1) Find the output of the following
// An expression involving byte, int literal numbers is promoted to which of these?
// a. int
// b. long
// c. byte
// d. float

// Ans : a. int

// ======================================================================================================================================================================================================

// Q2) Find the output of the following
// What is the range of data type short in Java?
// a. -128 to 127
// b. -32768 to 32767
// c. -2147483648 to 2147483647
// d. None of the mentioned

// Ans : b. -32768 to 32767

// ======================================================================================================================================================================================================

// Q3) Find the output of the following
// Which of these operators can skip evaluating right hand operand?
// a. !
// b. |
// c. &
// d. &&

// Ans : &&

// ======================================================================================================================================================================================================

// Q4) Find the output of the following

// class HelloWorld 
// {
//     public static void main(String[] args)
//     {
//        int i = 0;

//         int j = i++ + i;

//         System.out.printf("%d\n", j);

//     }
// }

// Ans : 1

// ======================================================================================================================================================================================================


// Q5) Find the output of the following
// What is the range of data type short in Java?
// a. -128 to 127
// b. -32768 to 32767
// c. -2147483648 to 2147483647
// d. None of the mentioned

// Ans : b. -32768 to 32767

// ======================================================================================================================================================================================================

// Q6) Find the output of the following
// public class Test
// {
// public static void main(String[] args)
// {
// 	int a = 20, b=10;

//    if((a<b) && (++b < 20))
// 	{
// 	   System.out.println("Logical AND ");
// 	}
// 	else
// 	{
// 		System.out.println("b value is : "+b);
// 	}
// }
// }

// Ans : b value is : 10

// ======================================================================================================================================================================================================

// Q7) Find the output of the following
// public class Test
// {
// public static void main(String[] args)
// {
// 	int a = 20, b=10;

//         if((a<b) & (++b < 20))
// 	{
// 	   System.out.println("Boolean AND ");
// 	}
// 	else
// 	{
// 		System.out.println("b value is : "+b);
// 	}
// }
// }

// Ans : b value is : 11

// ======================================================================================================================================================================================================

// Q8) Find the output of the following

// public class Test
// {
// public static void main(String[] args)
// {
// 	      int z = 5;
// 		  if(++z > 5 || ++z > 6)   //Logical OR
// 		  {
// 			  z++;
// 		  }
// 		  System.out.println(z);

// }
// }

// Ans : 7

// ======================================================================================================================================================================================================


// Q9) Find the output of the following

// public class Test
// {
// public static void main(String[] args)
// {
// 	      int z = 5;
// 		  if(++z > 5 | ++z > 6)   //Boolean OR
// 		  {
// 			  z++;
// 		  }
// 		  System.out.println(z);

// }
// }

// Ans : 8

// ======================================================================================================================================================================================================

// Q10) Find the output of the following
// public class Test1
// 	{
// 	public static void main(String args[]) 
// 	{
// 		char c;
// 		int i;
// 		c = 'A';		
// 		i = c;		
// 		c = i + 1;	
// 		c++;		
// 	}
// }

// Ans : erorr 

// ======================================================================================================================================================================================================


// Q11) Find the output of the following
// class Test
// 	{
// 	public static void main(String args[]) 
// 	{
// 		int i,j,k,l=0;
// 		k = l++;
// 		j = ++k;
// 		i = j++;
// 		System.out.println(i);		
// 	}
// }

// Ans : 1

// ======================================================================================================================================================================================================

// Q12) Find the output of the following
// public class Test
// {
// 	public static void main(String args[]) 
// 	{
// 		int i = 0;
// 		boolean t = true;
// 		boolean f = false, b;
// 		b = (t && ((i++) == 0));
// 		b = (f && ((i+=2) > 0));
// 		System.out.println(i);		
// 	}
// }

// Ans : 1

// ======================================================================================================================================================================================================

// Q13) Find the output of the following
// public class Test
// {
// 	public static void main(String args[]) 
// 	{
// 		int i = 0;
// 		boolean t = true;
// 		boolean f = false, b;
// 		b = (t & ((i++) == 0));
// 		b = (f & ((i+=2) > 0));
// 		System.out.println(i);		
// 	}
// }

// Ans : 3

// ======================================================================================================================================================================================================


// Q14) Find the output of the following
// public class Test
// {
// 	public static void main(String args[]) 
// 	{
// 		int i = 0;
// 		boolean t = true;
// 		boolean f = false, b;
// 		b = (t || ((i++) == 0));
// 		b = (f || ((i+=2) > 0));
// 		System.out.println(i);		
// 	}
// }

// Ans : 2

// ======================================================================================================================================================================================================

// Q15) Find the output of the following
// public class Test
// {
// 	public static void main(String args[])
// 	{
// 		int i = 0;
// 		boolean t = true;
// 		boolean f = false, b;
// 		b = (t | ((i++) == 0));
// 		b = (f | ((i+=2) > 0));
// 		System.out.println(i);		
// 	}
// }

// Ans : 3

// ======================================================================================================================================================================================================

// Q16) Find the output of the following
// public class Test
// {
// 	public static void main(String args[])
// 	{		
// 		int x = 3 & 5; 0 1 1
//                                1 0 1
//                              ----------
//                              0  0  1 =1


// 		int y = 3 | 5; 0 1 1
//                                1 0 1
//                              -------------
//                                1  1  1 
                               
//                                4  2  1=7

// 		System.out.println(x + " " + y);
// 	}
// }

// Ans : x=1, y=7
// 22
// ======================================================================================================================================================================================================

// Q17) Find the output of the following
// public class Test16
// {
// 	public static void main(String args[])
// 	{
// 		int x = 0, y = 1, z;
// 		if(x) 
// 		    z = 0;
// 		else
// 		    z = 1;

// 		if(y) 
// 		    z = 2;
// 		else
// 		    z = 3;
// 		System.out.println(z); 		
// 	}
// }

// Ans : error

// ======================================================================================================================================================================================================

// Q18) Find the output of the following

// public class Test
// {
//       public static void main(String[] argv)
//       {
//              byte b = 1;
//              byte b1 = -b;
//       }
// }

// Ans : error

// ======================================================================================================================================================================================================

// Q19) Find the output of the following
// public class Test
// {
//       public static void main(String[] argv)
//       {
//              byte b = 1;
//              int b1 = -b;
//       }
// }

// Ans : empty nothing print only blank

// ======================================================================================================================================================================================================

// Q20) Find the output of the following
// public class Test 
// {
//      public static void main(String[] argv) 
//      {
//           byte b = 0;
//           b += 27;
//           b = b+28;
//           b = (byte)(b+29);

//       }
// }

// Ans : error

// ======================================================================================================================================================================================================