class Cals{
    int num1;
    int num2;
    int res;

    public void perform(){
        res=num1+num2;
    }
    
}
public class democlass {
    public static void main(String[] args) {
        

        Cals obj=new Cals();
        obj.num1=8;
        obj.num2=9;

        obj.perform();
        System.out.println(obj.res);
    }
    
}
