// class Test51
// {
//  int x = 10;
// public static void main(String[] args)
// {

//     System.out.println(x);
// }
// static
// {
// System.out.print(x + " ");
// }
// }

// class Test51
// {
// int x = 10;
// public static void main(String[] args)
// {
// Test51 t1 = new Test51();
// System.out.println(t1.x);
// }
// static
// {
// int x = 20;
// System.out.print(x + " ");
// }
// }

class Test51
{
int x = 10;
public static void main(String[] args)
{
System.out.println(x);
}
static
{
Test51 t = new Test51();
System.out.print(t.x + " ");
}
}