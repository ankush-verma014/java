// public class Example2
// {
// int value = 50;
// public static void main(String[] args)
// {
// Example2 obj = getInstance();
// System.out.println(obj.value);
// }
// public static Example2 getInstance()
// {
// return new Example2();
// }
// }

// public class Example2
// {
// static
// {
// x = m1();
// System.out.println(Example2.x);
// }
// static int x = 100;
// static int m1()
// {
// System.out.println(x);
// x = 40;
// return x + 20;
// }
// public static void main(String[] args)
// {

// System.out.println(x);
// }
// }

// public class Example2
// {
// static int a = m1(); 
// static int m1()
// {
// System.out.println("m1 called"); 
// return 30;
// }
// static
// {
// System.out.println("Static block executed");
// a += 20;
// }
// public static void main(String[] args)
// {
// System.out.println("Final value of a: " + a);
// }
// }

// public class Example2
// {
// static int x = 10;
// static
// {
// System.out.println("Static Block 1: " + x); //10
// x = m1(); // x= 20

// }
// static
// {
// System.out.println("Static Block 2: " + x);//20
// x += 5; // x= 25
// }
// static int m1()
// {
// System.out.println("m1 executed");
// return 20;
// }
// public static void main(String[] args)
// {
// System.out.println("Main: x = " + x); //25
// }
// }


class ClassA
{
static int a = 5;
static
{
System.out.println("Static Block :"+a); //5
a = 10;
}
}
public class Example2
{
static
{

System.out.println("Example5 Static Block");
}
public static void main(String[] args)
{
System.out.println("Main Method");
System.out.println("Class A a :" + ClassA.a);//10
}
}