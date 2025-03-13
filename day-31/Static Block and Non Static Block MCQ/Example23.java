
class Example23
{
static int x = m1();
public static void main(String[] args)
{
System.out.println(x);

}
static
{
System.out.println(x);
x = x + 20;
}
static int m1()
{
x = 50;
return m2();
}
static int m2()
{
System.out.println(x);
return 100;
}
}
