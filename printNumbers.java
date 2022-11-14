import java.util.Scanner;

public class printNumbers {
    static void printing_numbers(int num){
        String newNum =String.valueOf(num);
        // System.out.println(newNum);

        String res="";
        String[] onedigit = new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
        String[] twodigits = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};  
        String[] multipleoftens = new String[] {"",  "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"}; 
        // System.out.println(newNum.length());
        // System.out.println("----------"+newNum.split("")[0]);

        
        if(newNum.length()==1){
            System.out.println(onedigit[num]);
            
        }
        else if(newNum.length()==2){
            // System.out.println("yes");
            // System.out.println((newNum.split("")[0]));
            if((newNum.split("")[0]).equals("1")){
                // System.out.println("yes");
                System.out.println(twodigits[Integer.parseInt(newNum.split("")[1])]);    
            }
            else{
                System.out.println(multipleoftens[Integer.parseInt(newNum.split("")[0])]+" "+onedigit[Integer.parseInt(newNum.split("")[1])]);
            }
        }
        else{
            if((newNum.split("")[1]).equals("1")){
                System.out.println(onedigit[Integer.parseInt(newNum.split("")[0])]+" Hundred "+twodigits[Integer.parseInt(newNum.split("")[2])]);
            }
            else{
                System.out.println(onedigit[Integer.parseInt(newNum.split("")[0])]+" Hundred "+multipleoftens[Integer.parseInt(newNum.split("")[1])]+" "+onedigit[Integer.parseInt(newNum.split("")[2])]);
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        printNumbers.printing_numbers(num);
}
}
    

