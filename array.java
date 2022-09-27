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
            {1,4,6,8,3},
            {2,7,8}
        };

        s1.id=101;
        s1.name="Tintumon KB";

        s2.id=102;
        s2.name="dundumol";

        s3.id=103;
        s3.name="Shuppandi";

        s4.id=104;
        s4.name="pappoos";

        System.out.println(s1.id+":"+s1.name);
        System.out.println(num[2][2]);
        System.out.println();
        
        //code for printing all elements in a two diomosinal array using for loop


        for(int i=0;i<num.length;i++)//for loop for columns
        {
           for(int j=0;j<num[i].length;j++)//for loop for rows
           {
            System.out.print(" "+num[i][j]);
           } 
           System.out.println();
        }

        //Enhanced for loop with arrays

    
        for(Student k:lis)//passing  array of object to enhanced for loop
        {
          System.out.println(k.id+":"+k.name);

        }


        for(int j[]:num)//enhanced for loop for two diomonsional array 
        {
          for(int l:j)
          {
            System.out.print(l+" ");
          }
          System.out.println();
        }

       }
}
