
import java.util.Scanner;

public class check_num{ 
    public static void main(String[] args) {
        System.out.println("Enter any random number to check: ");
        Scanner sc = new Scanner(System.in); 
        int num  = sc.nextInt();

        if((num & 1) != 0){ 
            System.out.println("the number is odd");
        }
        else{ 
            System.out.println("The number is even");
        }
    }
}