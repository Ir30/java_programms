class Outer{
    int var;//member variable

    void display(){//member mesthode

    }    

    class inner{//non static inner class
        void show(){
            System.out.println("this is inner class methode");
        }
    
    }

    static class inner_static{//static inner class
        void show(){
            System.out.println("This is a inner static class methode");
        }
    }
}
public class inner_demo {
    public static void main(String[] args) {
        Outer obj=new Outer();
        
        Outer.inner obj1=obj.new inner();//need object for accesing the inner class
        Outer.inner_static obj2=new Outer.inner_static();//no need of object to acces inner class because it is a static class

        obj1.show();
        obj2.show();
    }
}
