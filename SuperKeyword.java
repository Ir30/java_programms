
//super();
/*
 * Super methode is in cunstructor of sub class to decide that wich cunstructor of super class will be called
 * when we creating the object of sub class ie.. we want to call the  parametrized one or not. 
 */


class A
{
    public A()
    {
        System.out.println("In A");
    }

    public A(int l)
    {
        System.out.println("in A int");
    }
}

class B extends A
{
    public B()
    {
        super();//in every cunstructor of child class there is  a deffault super methode to specify wich cunstructor of superr class will be called 
        
        
        //super(6);--- if we want the non parameterised cunstrucor of sub class and parameterrized 
                    // of super class we can use the super methode in sub classes custructor as parameterized super methode
        
        
        System.out.println("in B");
    }

    public B(int k)
    {
        super(k);//hear by default non parameterized super methode (super();) and it will call the non parametetrized 
                 //cunstructor of super class if we specify the number or type or order of parameter in super methode it will act like that.

        System.out.println("in B int");
    }
}

public class SuperKeyword 
{
    public static void main(String[] args) 
    {
        A obj1 = new A();
        
        B obj2 = new B();//hear first load the default cunstrucor of super class A then the default cunstructor of 
                         //sub  B
        
        B obj3 = new B(4);//hear by default first load the deffault cunstructor of super class A and then 
                             //the parameterised cunstructor of sub class B.
    } 
      
}
