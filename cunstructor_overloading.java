class sample{
    int i;
    int j;
    int k;

    public sample(){
        i=0;
        k=0;
        j=0;
    }
    public sample(int l){
        j=l;
        i=0;
        k=0;
    }
    public sample(int m,int n){
        j=n;
        k=m;
        i=0;
    }
    public sample(int a,int b,int c){
        j=a;
        k=b;
        i=c;
    }
} 
public class cunstructor_overloading {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        
        sample obj1=new sample();
        sample obj2=new sample(6);
        sample obj3=new sample(3,4);
        sample obj4=new sample(3,4,9);

        

        System.out.println(obj1.i,obj1.j,obj1.k);
        System.out.println(obj2.i,obj2.j,obj2.k);
        System.out.println(obj3.i,obj3.j,obj3.k);
        System.out.println(obj4.i,obj4.j,obj4.k);

    }
}
