class Calcs//super ,parent,base
{
    public int add(int a,int b)
    {
        return a+b;
    }
}

class CalcsAdv extends Calcs//sub ,child,derived
{
    public int sub(int a, int b)
    {
        return a-b;
    }
}

class CalcsPro extends CalcsAdv
{
    public int mul(int a,int b)
    {
        return a*b;
    }
}

public class DemoInheritance 
{
    public static void main(String[] args) 
    {
        Calcs c1 = new Calcs();
        System.out.println(c1.add(6,7));

        CalcsAdv c2 = new CalcsAdv();
        System.out.println(c2.add(8,7));
        System.out.println(c2.sub(3, 9));

        CalcsPro c3 = new CalcsPro();//sub class inherit all the properties of its all parent classes.
        System.out.println(c3.add(2, 4));
        System.out.println(c3.sub(5,3));
        System.out.println(c3.mul(4, 6));

    }
}
