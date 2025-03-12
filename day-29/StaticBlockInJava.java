// MCQs :
// -------
// Q1) Find the Output :

// public class Test
// {
// static
// {
// System.out.println("Static Block Executed");
// }

// public static void main(String[] args)
// {
// System.out.println("Main Method Executed");
// }
// }

// output:
// Static Block Executed
// Main Method Executed 

// ========================================================================================

// Q2) Find the Output :
// class A
// {
// static
// {

// System.out.println("Class A Static Block");
// }
// }
// class B extends A
// {
// static
// {
// System.out.println("Class B Static Block");
// }
// }
// public class Main
// {
// public static void main(String[] args)
// {
// B obj = new B();
// System.out.println("Main Method");
// }
// }

// output:
// Class A Static Block
// Class B Static Block
// Main Method

// ========================================================================================

// Q3) Find the Output :
// public class Test
// {
// static
// {
// System.out.println("Static Block Executed");
// System.exit(0);
// }
// }

// output:
// Error : main method is compulsary

// ========================================================================================

// Q4) Find the Output :
// class Demo
// {
// {
// System.out.println("Non Static Block in Demo");
// }

// public Demo()
// {
// System.out.println("Constructor of Demo");
// }
// static
// {
// System.out.println("Static Block in Demo");
// }
// }
// public class Test
// {
// public static void main(String[] args)
// {
// Demo d1 = new Demo();
// Demo d2 = new Demo();
// }
// }

// output:
// Static Block in Demo
// Non Static Block in Demo
// Constructor of Demo
// Non Static Block in Demo
// Constructor of Demo

// ========================================================================================

// Q5) Find the Output :
// class X
// {
// static
// {
// System.out.println("Class X Static Block");
// }
// }
// class Y extends X
// {
// static
// {
// System.out.println("Class Y Static Block");
// }
// }
// public class Test
// {

// public static void main(String[] args)
// {
// X obj1 = new X();
// Y obj2 = new Y();
// Y obj3 = new Y();
// }
// }

// output:
// Class X Static Block
// Class Y Static Block

// ========================================================================================

// Q6) Find the Output :
// class Test
// {
// static
// {
// System.out.println("Static Block Executed");
// }
// static void display()
// {
// System.out.println("Static Method Executed");
// }
// public static void main(String[] args)
// {
// System.out.println("Main Method Started");
// display();
// }
// }

// output:
// Static Block Executed
// Main Method Started
// Static Method Executed

// ========================================================================================

// Q7) Find the Output :
// class Demo
// {
// public static final int VALUE;

// public static void access()
// {
// VALUE = 50;
// System.out.println("Value is :" + VALUE);
// }

// }
// class Test
// {
// public static void main(String[] args)
// {
// Demo.access();
// }
// }

// output:
// Error

// ========================================================================================

// Q8) Find the Output :
// class Demo
// {
// public static final int VALUE;
// static
// {
// VALUE = 50;
// System.out.println("Value is : " + VALUE);
// }
// }
// class Test
// {
// public static void main(String[] args)
// {
// System.out.println("Main Method VALUE = " + Demo.VALUE);
// }
// }

// output:
// Value is : 50
// Main Method VALUE = 50

// ========================================================================================

// Q9) Find the Output :
// class Singleton
// {
// private static Singleton instance;
// static
// {
// instance = new Singleton();
// System.out.println("Static Block: Singleton Instance Created");

// }
// private Singleton()
// {
// System.out.println("Constructor: Singleton Object Created");
// }
// public static Singleton getInstance()
// {
// return instance;
// }
// public void greet()
// {
// System.out.println("Hello Everyone!!!");
// }
// }
// public class Test
// {
// public static void main(String[] args)
// {
// System.out.println("Main Method");
// Singleton obj1 = Singleton.getInstance();

// obj1.greet();

// }
// }

// output:
// Main Method
// Constructor: Singleton Object Created
// Static Block: Singleton Instance Created
// Hello Everyone!!!
// ========================================================================================

// Q10) Find the Output :
// class Foo
// {
// Foo()
// {
// System.out.println("No Argument constructor..");
// }
// {
// System.out.println("Instance block..");
// }

// static
// {
// System.out.println("Static block...");
// }
// }
// public class Test
// {
// public static void main(String [] args)
// {
// System.out.println("Main Method Executed ");
// }
// }

// output:
// Main Method Executed

// ========================================================================================

// Q11) Find the Output :
// class Alpha
// {
// static
// {
// System.out.println("A");
// }
// {
// System.out.println("B");
// }
// A()
// {
// System.out.println("C");
// }
// }
// class Beta extends Alpha
// {
// static
// {
// System.out.println("D");
// }

// {
// System.out.println("E");
// }
// B()
// {
// System.out.println("F");
// }
// }
// public class Test
// {
// public static void main(String[] args)
// {
// new B();
// }
// }

// output:
// compile time Error

// ========================================================================================

// Q12) Find the Output :
// class Demo
// {
// static
// {
// i = 100;
// }
// static int i;
// }
// public class Test
// {
// public static void main(String[] args)
// {
// System.out.println(Demo.i);
// }
// }

// output: 100

// ========================================================================================

// Q13) Find the Output :

// class Demo
// {
// static
// {
// i = 100;
// System.out.println(i);
// }
// static int i;
// }
// public class Test
// {
// public static void main(String[] args)
// {
// System.out.println(Demo.i);
// }
// }

// output:
// 0
// ========================================================================================

// Q14) Find the Output :
// class Demo
// {
// {
// i = 100;
// System.out.println(i);
// }
// int i;
// }
// public class Test
// {
// public static void main(String[] args)
// {
// new Demo();
// }
// }

// output:
// Error
// ========================================================================================

// Q15) Find the Output :
// class Alpha
// {
// public static final int A;
// static
// {
// print();
// A = 100;
// }
// public static void print()
// {
// System.out.println("Default value :"+A);
// }
// }
// public class Test
// {
// public static void main(String[] args)
// {
// System.out.println("User value :"+Alpha.A);
// }
// }

// output:
// Default value :0
// User value :100
// ========================================================================================

// Q16) Find the Output :
// class Test
// {
// public static final Test t1 = new Test(); //t1 = null;
// static
// {
// System.out.println("static block");
// }
// {
// System.out.println("Non static block");
// }

// Test()
// {
// System.out.println("No Argument Constructor");
// }
// }
// public class Demo
// {
// public static void main(String[] args)
// {
// new Test();
// }
// }

// output:
// Non static block
// No Argument Constructor
// static block
// Non static block
// No Argument Constructor

// ========================================================================================

// Q17) Find the Output :
// class Sample
// {
// static
// {
// System.out.println("Static Block");
// x = m1();
// System.out.println(Sample.x);
// }
// public static int m1()
// {
// System.out.println("Static Method");
// return 100;
// }
// static int x;
// }

// public class Test
// {
// public static void main(String[] args)

// {
// System.out.println(Sample.x);
// }
// }

// output:
// Static Block
// Static Method
// 100
// 100
// ========================================================================================

// Q18) Find the Output :
// class Alpha
// {
// public static void print()
// {
// x = 100;
// System.out.println(x);
// }
// static int x;
// }
// public class Test
// {
// public static void main(String[] args)
// {
// Alpha.print();
// }
// }

// output: 100

// ========================================================================================

// Q19) Find the Output :
// class Alpha
// {
// public static final int MAX_VALUE = 100;
// static
// {
// System.out.println("Static Block");
// }
// }
// public class Test
// {
// public static void main(String[] args)

// {
// System.out.println(Alpha.MAX_VALUE);
// }
// }

// output: 100

// ========================================================================================

// Q20) Find the Output
// class Alpha
// {
// public static final int MAX_VALUE = access();
// static
// {
// System.out.println("Static Block");
// }
// public static int access()
// {
// return 100;
// }
// }
// public class Test
// {
// public static void main(String[] args)
// {
// System.out.println(Alpha.MAX_VALUE);
// }
// }

// output:

// ========================================================================================
