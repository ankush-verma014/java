// Que-1)
// ________________
// class ConstructorsTest
// {
//     public static void main(String[] args)
//     {
//         U u = new U();
//         U u1 = new U(1);
//         V v = new V();
//         V v1 = new V(1);
//         T t = new T();
//         T t1 = new T(1);
//     }
// }
// class U {
//     V v = new V();

//     U() 
//     { 
//      System.out.print("U"); 
//       }

//     U(int i) {
//      System.out.print("u");
//      }
// }

// class V {
//     V() {
//      System.out.print("V");
//       }

//     V(int i) {
//     System.out.print("v"); 
//      }
// }

// class T extends V {

//     T() {
//      System.out.print("T"); 
//      }

//     T(int i) {
//      System.out.print("t"); 
//      }
// }


// ________________________________________________________________________________________________
// Que-2)
// ____________________
// class OutPut
// {
//     public static void main(String[] args)
//     {
//         new Alpha();
//         new Base();
//     }
// }
// class Alpha extends Base
// {
//     Alpha()
//     {
//         System.out.print("Base");
//     }
// }
// class Base
// {  
//     Base()
//     {
//         System.out.println("Base");
//     }
// }
// Sol:
//  Base
// BaseBase
// ____________________________________________________________________________________________________
// Que-3)
// ___________________
// class OutPut
// {
//     public static void main(String [] args)
//     {
//         Count t = new Count();
//         t.count();
//     }
// }

// class Count extends Count2
// {
//     Count()
//     {

//     }
// }
// class Count2
// {
//     void count()
//     {
//         System.out.print("Output = ");

//         for (int x = 0; x < 7; x++,x++ )
//         {
//             System.out.print(" " + x);
//         }
//     }
// }
// Sol: Output =  0 2 4 6
// ____________________________________________________________________________________________
// Que-4)
// _______________

// What will be the output of the following program?

// class OutPut
// {
//     public static void main(String [] args)
//     {
//         Count2 count = new Count2();
//         count.count();
//     }
// }

// class Count extends Count2
// {
//     Count()
//     {

//     }
// }
// class Count2
// {
//     void count()
//     {
//         int i = 5;
//         System.out.print("Output = ");

//         for (int x = 0; x <= (i % 7); x += 1)
//         {
//             System.out.print(" " + x);
//         }
//     }
// }
// Sol: Output =  0 1 2 3 4 5
// ___________________________________________________________________________________
// Que-5)
// ____________________
// What will be the output of the following program?

// class OutPut
// {
//     public static void main(String [] args)
//     {
//         Count2 count = new Count2();
//         count.count();
//     }
// }

// class Count extends Count2
// {
//     Count()
//     {

//     }
// }
// class Count2
// {
//     void count()
//     {
//         int i = 5;
//         System.out.print("Output = ");

//         for (int x = 0; x <= (i % 7); x += 1)
//         {
//             System.out.print(" " + x);
//             i++;
//         }
//     }
// }
// Sol: Output =  0 1
// _______________________________________________________________________________________
// Que-6)
// ___________________
// What will be the output of the following program?

// class OutPut
// {
//     public static void main(String s[])
//     {
//         int i = 2;
//         B b = new B();
//         b.execute();
//     }
// }

// class A
// {
//     int i = 0;
//     A(){}
// }

// class B extends A
// {
//     void execute()
//     {
//         for(; i < 6; i++)
        
//             switch(i)
//             {
//                 case 0:
//                 System.out.println("i is zero.");
//                 break;
        
//                 case 1:
//                 System.out.println("i is one.");
//                 break;
        
//                 case 2:
//                 System.out.println("i is two.");
//                 continue;
        
//                 case 3:
//                 System.out.println("i is three.");
//                 break;
        
//                 default:
//                 System.out.println("i is greater than three.");
//             }
//     }
// }
// Sol:
// i is one.
// i is two.
// i is three.
// i is greater than three.
// i is greater than three.
// __
// _______________________________________________________________________________
// Que-7)
// _______________________
// What will be the output of the following program?

// class OutPut
// {
//     public static void main(String s[])
//     {
//         int i = 2;
//         B b = new B();
//         b.execute();
//     }
// }

// class A
// {
//     A()
//     {
//         int i = 1;
//     }
// }

// class B extends A
// {
//     void execute()
//     {
//         System.out.println("i = " + i);
//     }
// }
// Sol: Error
// _____________________________________________________________________________
// Que-8)
// _________________

// What will be the output of the following program?

// class Constructors {
//     public static void main(String[] args) {
//         new A(3);
//         new B(5, 6);
//         new B(6, 7).C(1, 2, 3);
//         new C(3, 3, 4).B(4, 5);
//         new C(1, 1, 1);
//     }
// }
// class A {
//     A(int i) {  
//   print(i * 2);   
//      }
//     void print(int i) { 
//     System.out.print(i + " ");   
//     }
// }
// class B extends A {
//     B(int j, int k) {
//         super(j);
//         print(k * 4);
//     }
//     void C(int j, int k, int l) {
//       print(j + k + l - 3);   
//        }
// }
// class C extends B {
//     C(int j, int k, int l) {
//         super(j, k);
//         print(l - 3);
//     }
//     void B(int i, int k) {  
//       print(i * 6);   
//       }
// }
// Sol: 6 10 24 12 28 3 6 12 1 24 2 4 -2 
// ________________________________________________________
// Que-9)
// ________________
// What will be the output of the following program?

// class FourWheeler
// {
//     public static void main(String[] args)
//     {
//         new Car(0);
//     }
// }

// class Vehicle
// {
//     int i;
//     int j;

//     Vehicle(int i)
//     {
//         this.i = i;
//         j = i;
//     }

//     Vehicle(int i, int j)
//     {
//         this.i = i;
//         this.j = j;
//     }
// }

// class Bus extends Vehicle
// {
//     double j;

//     Bus(double j)
//     {
//         this.j = j;
//     }
// }

// class Car extends Vehicle
// {
//     Car(int i)
//     {
//         super(i);
//         System.out.print("Executed Successfully");
//     }
// }
// _____________________________________________________________
// Que-10)
// ______________
// What will be the output of the following program?

// class BaseClass {
//     BaseClass() {
//         System.out.print("*");
//     }
//     BaseClass(String str) {
//         this();
//         System.out.print("@" + str);
//     }
// }
// public class ChildClass extends BaseClass {
//     ChildClass() {
//         System.out.print("#");
//     }
//     ChildClass(String name) {
//         this();
//         System.out.print("$" + name);
//     }
//     public static void main(String args[]) {
//         new ChildClass("hello");
//     }
// }
// ______________________________________________________________
// Que-11)
// ________________
// What will be the output of the following program?

// class White {
//     White() {
//         System.out.print("white is ");
//     }
// }
// class Purple extends White {
//     Purple(String color) {
//         System.out.print(color);
//     }
// }
// public class Black extends Purple {
//     Black() {
//         super("beautiful" + ",");
//     }
//     public static void main(String[] a) {
//         new Purple("awesome" + ",");
//         new Purple("nice");
//     }
// }
// _______________________________________________________________
// Que-12)
// ________________
// What will be the output of the following program?

// public class IAm {
//     public static void main(String arg[]) {
//         School ref = null;
//         ref = new Office();
//         ref.display();
//     }
// }
// class School {
//     void display() {
//         System.out.println("10th class");
//     }
// }
// class College extends School {
//     void display() {
//         new School().display();
//         System.out.println("B.Tech");
//     }
// }
// class Office extends School {
//     void display() {
//         new College().display();
//         System.out.println("S/W company");
//     }
// }
// __________________________________________________________________
// Que-13)
// ______________
// What will be the output of the following program?

// public class IAm {
//     public static void main(String arg[]) {
//         float input = 24.8888888888888889f;
//         School ref = null;
//         if (input < 10) {
//             ref = new School();
//         } else if (input > 30) {
//             ref = new College();
//         } else if (input == 24.88889f) {
//             ref = new Office();
//         }
//         ref.display();
//     }
// }
// class School {
//     void display() {
//         System.out.println("I am studying 10th class.");
//     }
// }
// class College extends School {
//     void display() {
//         System.out.println("I am studying B.Tech.");
//     }
// }

// class Office extends School {
//     void display() {
//         System.out.println("I am working in S/W company.");
//     }
// }
// ____________________________________________________________________
// Que-14)
// ________________
// What will be the output of the following program?
// public class Fruit  
// {  
// private double fprice;  
// private String fname;  

// Fruit(double fPrice, String fName)  
// {   
// fprice = fPrice;  
// fname = fName;  
// }  

// Fruit(Fruit fruit)  
// {  
// System.out.println("\nAfter invoking the Copy Constructor:\n");  
// fprice = fruit.fprice;  
// fname = fruit.fname;  
// }  

// double showPrice()  
// {  
// return fprice;  
// }  
 
// String showName()  
// {  
// return fname;  
// }  
 
// public static void main(String args[])  
// {  
// Fruit f1 = new Fruit(399, "Ruby Roman Grapes");  
// System.out.println("Name of the first fruit: "+ f1.showName());  
// System.out.println("Price of the first fruit: "+ f1.showPrice());  
// Fruit f2 = new Fruit(f1);  
// System.out.println("Name of the second fruit: "+ f2.showName());  
// System.out.println("Price of the second fruit: "+ f2.showPrice());  
// }  
// }
// ______________________________________________________________________ 
// Que-15)
// ________________
// What is the output of the below Java program?
// public class TestingConstructor
// {
//   void TestingConstructor()
//   {
//     System.out.println("Amsterdam");	
//   }

//   TestingConstructor()
//   {
//     System.out.println("Antarctica");	
//   }
	
//   public static void main(String[] args)
//   {
//     TestingConstructor tc = new TestingConstructor();
//   }
// }
// ______________________________________________________________________
// Que-16)
// ________________
// public class Constructor3
// {
//   int birds=10;
//   Constructor3()
//   {
//     this(20);
//   }
//   Constructor3(int birds)
//   {
//     System.out.println("Birds=" + birds);
//   }

//   public static void main(String[] args)
//   {
//     Constructor3 con = new Constructor3();
//   }
// }
// _____________________________________________________________________
// Que-17)
// ________________
// public class Constructor7
// {
//   Constructor7(int a)
//   {
//     System.out.println("Book=" + a);
//   }
//   Constructor7(float a)
//   {
//     System.out.println("Pen="+ a );
//   }
//   public static void main(String[] args)
//   {
//     Constructor7 con = new Constructor7(50.5f);
//   }
// }
// ____________________________________________________________________
// Que-18)
// _________________
// What will be the output of the following Java program?

// class A
// {
// int i;
// void display()
// {
// System.out.println(i);
// }
// }
// class B extends A
// {
// int j;
// void display()
// {
// System.out.println(j);
// }
// }
// class inheritance_demo
// {
// public static void main(String args[])
// {
// B obj = new B();
// obj.i=1;
// obj.j=2;
// obj.display();
// }
// }
// _________________________________________________________________
// Que-19)
// ______________
// class Main {

//   String languages;

//   // constructor accepting single value
//   Main(String lang) {
//     languages = lang;
//     System.out.println(languages + " Programming Language");
//   }

//   public static void main(String[] args) {

//     // call constructor by passing a single value
//     Main obj1 = new Main("Java");
//     Main obj2 = new Main("Python");
//     Main obj3 = new Main("C");
//   }
// }
// ________________________________________________________________
// Que-20)
// _____________
// class Main {

//   String language;

//   Main() {
//     this.language = "Java";
//   }

//   Main(String language) {
//     this.language = language;
//   }

//   public void getName() {
//     System.out.println("Programming Langauage: " + this.language);
//   }

//   public static void main(String[] args) {

//     Main obj1 = new Main();

//     Main obj2 = new Main("Python");

//     obj1.getName();
//     obj2.getName();
//   }
// } 