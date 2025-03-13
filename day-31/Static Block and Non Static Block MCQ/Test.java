// public class Test
// {
// static
// {
// System.out.println("Static Block");
// }
// {
// System.out.println("Instance Block");
// }
// Test()
// {
// System.out.println("Constructor");
// }
// public static void main(String[] args)
// {
// System.out.println("Main Method");
// Test obj1 = new Test();
// Test obj2 = new Test();
// }
// }

public class Test
{
static int x = 10;
{
x = 50;

}
static
{
x = 30;
}
public static void main(String[] args)
{
System.out.println("Before Object Creation: " + x);
Test obj1 = new Test();
System.out.println("After Object Creation: " + x);
}
}