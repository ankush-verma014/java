// MCQ Assignment :
// ================
// Q1) Find the output :

// class Parent
// {
//     public void show()
//     {
//       System.out.println("Parent");
//     }
// }
// class Child extends Parent
// {
//     public void show()
//     {
//        System.out.println("Child");
//     }
// }
// public class Main
// {
//     public static void main(String[] args)
//     {
//         Child obj = new Child();
//         obj.show();
//     }
// }

// OUTPUT: child

// ===============================================================================

// Q2) Find the output of the Program

// class Parent
// {
//    protected int num = 100;
// }
// class Child extends Parent
// {
//     protected int num = 200;
// }
// public class Test
// {
//    public static void main(String[] args)
//    {
//         Child obj = new Child();
//         System.out.println(obj.num);
//     }
// }

// output: 200

// ==================================================================================


// Q3)

// If class B extends class A, what can class B access from class A?
// a) Only public members
// b) public and protected members
// c) private members
// d) All members regardless of access modifiers

// output:
// b) public and protected members
// ==================================================================================

// Q4) Find the output of the Program

// class A
// {
//     A()
//     {
//         System.out.println("Class A Constructor");
//     }
// }
// class B extends A
// {
//     B()
//     {
//         System.out.println("Class B Constructor");
//     }
// }
// public class Test
// {
//     public static void main(String[] args)
//     {
//         B obj = new B();
//     }
// }

// output:
// Class A Constructor
// Class B Constructor
// ==================================================================================

// Q5) Find the output of the Program

// class A
// {
//     A(int x)
//     {
//         System.out.println("Class A: " + x);
//     }
// }
// class B extends A
// {
//     B()
//     {
//         super(10);
//         System.out.println("Class B");
//     }
// }
// public class Test
// {
//     public static void main(String[] args)
//     {
//         B obj = new B();
//     }
// }

// output: 
// Class A: 10
// Class B


// ==================================================================================

// Q6) Find the output of the Program

// class Parent
// {
//     Parent()
//     {
//         System.out.println("Parent Constructor");
//     }
// }
// class Child extends Parent
// {
//     Child()
//     {
//         this(10);
//         System.out.println("Child Constructor");
//     }
//     Child(int x)
//     {
//         super();
//         System.out.println("Child Constructor with x: " + x);
//     }
// }
// public class Main
// {
//     public static void main(String[] args)
//     {
//         Child obj = new Child();
//     }
// }

// output:
// Parent Constructor
// Child Constructor with x: 10
// Child Constructor

// ==================================================================================
// Q7) Which of the following is NOT true about constructor chaining?

// a) A constructor can call another constructor of the same class using this()
// b) A constructor can call a superclass constructor using super()
// c) this() and super() can be used together in the same constructor
// d) Constructor chaining helps in code reusability

// output:
// c) this() and super() can be used together in the same constructor

// ==================================================================================

// Q8) Which of the following is true about super() and this()?
// a) Both must be the first statement in a constructor
// b) Both can be used together in a constructor
// c) this() calls the constructor of the same class, and super() calls the superclass constructor
// d) Both can be used outside constructors

// output:

// ==================================================================================


// Q9) Find the output of the following code
// class Parent
// {
//     {
//     System.out.println("Parent Non-Static Block");
//     }
// }

// class Child extends Parent
// {
//     {
//     System.out.println("Child Non-Static Block");
//     }
// }

// public class Test
// {
//     public static void main(String[] args)
//     {
//         Child obj = new Child();
//     }
// }

// output:
// Parent Non-Static Block
// Child Non-Static Block

// ==================================================================================

// Q10)


// class Alpha
// {
//     {
//     System.out.println("Block 1");
//     }
//     {
//     System.out.println("Block 2");
//     }
   
//     Alpha()
//     {
//         System.out.println("Alpha Constructor");
//     }
// }

// class Beta extends Alpha
// {
//     {
//     System.out.println("Block 11");
//     }
//     {
//     System.out.println("Block 22");
//     }
   
//     Beta()
//     {
//         System.out.println("Beta Constructor");
//     }
// }

// public class Test
// {
//     public static void main(String[] args) {
//         new Beta();
//     }
// }

// output:
// Block 1
// Block 2
// Alpha Constructor
// Block 11
// Block 22
// Beta Constructor

// ==================================================================================