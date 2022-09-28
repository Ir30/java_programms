class Emp{
   int salary;
   int id;
   static String ceo;//static keyword is used to make an object into class specific.and allocate memmory for 
                     //static variable when the class is called and cit is in loader memmory(class loader memmory)
                     //rather than the heap memmory(heap memmory for object specific variables)
   static String c_name;
   
   static{
    c_name="Pachalam Productions";
    System.out.println("This is a static block it is called when a calss is created");//static block  call when a class is  created


   }

   public Emp(){
    id=000;
    salary=3000;
    ceo="Rajappan Thengumood";

    System.out.println("This is a cunstructor it is called while creating an objecct");//called while creating an object
   }

   public void show(){
    System.out.println(id+" :"+salary+" :"+ceo+" :"+c_name);
   } 
}
public class static_keyword {
    public static void main(String[] args) {
        Emp Abu=new Emp();
        Emp Pappan=new Emp();

        Abu.show();//show the default value assigned in cunstructor
        
        Abu.id=101;
        Abu.salary=6000;
        Abu.ceo="Dr Saroj kumar";//change the value for all object because it is class specific

        Abu.show();
        Pappan.show();

        Emp.ceo="Dr LF Kernal Saroj Kumar";//no need to specify the object instead we can use the class name

        Abu.show();
        Pappan.show();
    }
    
}
