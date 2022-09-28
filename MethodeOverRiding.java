class A
{
    int i;

    public void show()
    {
        System.out.println("in A");
    }
}

class B extends A
{
   
    int i;

    

    @Override//it is an annotation that hear exist methode that override the methode of super class
             //in some occations we get some logical error by spellng mistake that we want to create a methode  that
             //shuld override the super class methode.by giving the annotation we get an error if we do some mistake.
             // and it check if there exist an overriding methode under the @override and instead of getting a logical error
             // we get a compilation error.
    public void show()
    {
        super.i=3;//we have a variable i in both super and  sub classes if we want to assign a value to super class
                  //variable i inside the sub class we can use the super keyword to specify the super class variable i.


        super.show();//if we want to call the super class methode with the  override methode we can use super
        //key word.We can use the super key word to specify the super class variable if exist same variable in the
        //sub calss
        System.out.println("in B");
    }

    
}


public class MethodeOverRiding 
{
    public static void main(String[] args) 
    {
       B obj = new B(); 
       obj.show();
    }    
}
