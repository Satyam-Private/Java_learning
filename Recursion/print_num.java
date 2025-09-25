
import java.util.Scanner;

public class print_num{ 
    public static void printNum(int num){ 
        if(num < 1) return; 
        System.out.println("The value is " + num);
        printNum(num-1);
    }
    public static void main(String args[]){ 
        System.out.println("Lets print the number in decreasing order : "); 
        System.out.println("first enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 

        printNum(num);
    }
}