//Encapsulation

/*
 * Binding data with methods
 * hear we can only acces the variable throug methods 
 */
class A
{
    private int id;
    private String name;

    public int getId() 
    {
        return id;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
}
public class Encapsulation 
{
    public static void main(String[] args) 
    {
        A obj = new A();

        obj.setId(101);
        obj.setName("Raju Bhai");
        

        //obj.id=102; we cannote acces the data of class A directly because it is private instead of it we can
        //use getters and setters ie we can acces the data only through the methodes 
        System.out.println(obj.getId()+":"+obj.getName());
    }
}
