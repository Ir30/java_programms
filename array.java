class Student
{
    int id;
    String name;
}
public class array 
{
    public static void main(String[] args) 
    {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        Student s4=new Student();

        // Student lis[]=new Student[4];
        
        Student lis[]={s1,s2,s3,s4};//creating array of objects

        int num[][]=//creating multy diomonsional array
        {
            {1,2,3,4},
            {2,7,8,9},
            {1,4,6,8}
        };

        s1.id=101;
        s1.name="Tintumon KB";

        System.out.println(s1.id+":"+s1.name);
        System.out.println(num[2][2]);
       }
}
