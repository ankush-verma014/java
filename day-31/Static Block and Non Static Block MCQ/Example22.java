
class Example22
{
static int x = 10;
public static void main(String[] args)
{
System.out.println(Example22.m1()+ x);
}
static int m1()
{
x = x + 100;
return x;
}
}