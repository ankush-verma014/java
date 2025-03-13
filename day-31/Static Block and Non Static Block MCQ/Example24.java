
class Example24
{

    static// ----------------------------1
    {
        a = m1();//50
    }

    static int a = 80;//50// ------------------------2   a=130

    public static void main(String[] args)// ----------------------3
    {
    System.out.println(a);
    }

    static//-------------------------4
    {//a=50
    a = a + m1();//80 + 50= 130
    }

    static int m1()// -----------------------------5
    {
        a = 30;
        return m2();
    }

    static int m2()//============================6
    {
        System.out.println(a);//p-1 p-1
         return a + 20;
    }

}
