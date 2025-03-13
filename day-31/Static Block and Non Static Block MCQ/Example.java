// class Example
// {

// static
// {
// int x = 10;
// System.out.println("Step 1");
// Example.x = x+x;
// System.out.println("Step 2");
// }
// static int x;
// public static void main(String[] args)
// {
// System.out.println("Class Level X : "+Example.x);
// }
// static
// {
// x = x + Example.x;
// System.out.println("Step 3");
// }

// }


// class Example
// {
// static int a;
// public static void main(String[] args)
// {
// System.out.println(Example.a);
// Example.a = Example.initialize();
// System.out.println(Example.a);
// }
// static int initialize()
// {
// Example.a = 50;
// return 60;
// }
// }


// class Example
// {
// static int x = Example.m1();
// public static void main(String[] args)
// {
   
// System.out.println(Example.x);
// }
// static int m1()
// {

// x = 10;
// return Example.m2();
// }
// static int m2()
// {
// System.out.println(Example.x);

// return 20;
// }
// }

public class Example
{
{
System.out.println("Instance Block");
}
static
{
System.out.println("Static Block");
}
public static void show()
{
System.out.println("Static Method");
// Example e1 = new Example();
// e1.display();
display();
}
public void display()
{
System.out.println("Instance Method");
}
public static void main(String[] args)
{
show();
}
}