
import java.util.Scanner;

public class armstrong{ 
    public static boolean checkArmstrong(int num){ 
        int temp = num, lastdigit; 
        int obtainedSum = 0; 
        while(temp > 0){ 
            lastdigit = temp % 10; 
            obtainedSum += lastdigit*lastdigit*lastdigit; 
            temp = temp / 10;  
        }
        if(num == obtainedSum){ 
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
         System.out.println("hello");
         System.out.println("Enter any number : ");
         Scanner sc = new Scanner(System.in); 
         int num = sc.nextInt();
         if(checkArmstrong(num)){ 
            System.out.println("The number is armstrong number. ");
         }
         else{ 
            System.out.println("The number is not armstroong number");
         }
    }
}