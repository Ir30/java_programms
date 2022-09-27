class Cals
{
    public int add(int ... n)
    {
      int sum=0;
      for(int k:n)
       {
        sum = sum+k;
       }  
      return sum;
    }
}


public class varargs 
{
  public static void main(String[] args) 
  {
    Cals obj=new Cals();
    // System.out.println(s.add(1,6,7,9));
    // System.out.println(s.add(1,6,7));
    // System.out.println(s.add(1,6));  
    int p=obj.add(2,4);
    System.out.println(p);
  }    
}
