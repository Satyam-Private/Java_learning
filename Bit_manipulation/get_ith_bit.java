
import java.util.Scanner;

public class get_ith_bit{ 
    public static void main(String args[]){ 
        // this uses the left shift and bitmask of 1 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int num = sc.nextInt(); 


        int bitmask = 1; 

        System.out.println("Enter the bit that you want: ");
        int bit_in = sc.nextInt(); 

        

        bitmask = 1 << bit_in; 
        if((num & bitmask) != 0){ 
            System.out.println("The bit is set");
        }
        else{ 
            System.out.println("The bit is not set");
        }


    }
}