import java.util.ArrayList;
import java.util.Arrays;

public class CountOccurance {

    static void find_occurance(ArrayList<Integer> arr){

   
        ArrayList<Integer> newArr =new ArrayList<>();
        int f_big=arr.get(0);
        int s_big=arr.get(0);
        for(int i:arr){
            if(newArr.contains(i)){
                continue;
            }
            int count=0;
            newArr.add(i);


            for(int j:arr){
                if (i==j){
                    count +=1;
                }
            }
            if(count>1){
                System.out.println("Number "+i+" occurs "+count+" times");
            }

            // System.out.println(i);

            if(i>f_big){
                f_big=i;
            }
  
        }

        for(int i:arr){
            if(i>s_big && i != f_big){
                s_big = i;
            }
        }
        System.out.println("Second largest number is "+s_big);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>(Arrays.asList(3,6,9,3,2,2,1,3,3));

        find_occurance(arr);
    }
    
}


