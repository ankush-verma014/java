public class Test54
{
int x = 10;
public static void main(String[] args)
{
Test54 obj = passObject(null);
System.out.println(obj.x);
}
static
{
Test54 t = new Test54();
System.out.print(t.x + " ");
passObject(t);
}
public static Test54 passObject(Test54 t1)
{
return t1;
}
}