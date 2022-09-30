public class WrapperClass 
{
    public static void main(String[] args) 
        {
            int i =6;//Primitive data type

            //Wraper class 
            /*integer() is a wrapper class that allows to store an integer value to object
            */
            Integer ii = new Integer(6);   //Wrapping or Boxing
            int k=ii.intValue();//Un wrapping or unboxing

            Integer n =i;//Auto wrapping :- Hear we can put an integer value to the Integer wrapper class object and java automaticlly
                    // wrrapp the data and this is called auto wrapping
            int l=n;//Auto Unwrapping
            
            //NB: Primitive data types are more faster than the wrapper classes.But some frameworks in java
                //dose not support the primitive data types they only accept the wrapperr classes for performing 
                //operation related to data in such situations we need to use the wrapperr classes

        }
}
