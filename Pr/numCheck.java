
import java.util.Scanner;

// Check if the given number is in power of two or not  



public class numCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 


        int num = sc.nextInt(); 


        String ans = ""; 

        while(num > 0){ 
            int rem = num % 2; 
            ans += rem;

            num = num / 2;
        }

        String finalAns = ""; 
        for(int i = ans.length() - 1; i >= 0; i--){ 
            finalAns += ans.charAt(i);
        }

        int setBits = 0; 

        for(int i = 0; i < finalAns.length(); i++){ 
            if(finalAns.charAt(i) == '1'){ 
                setBits++;
            }
        }
        if(setBits == 1){ 
            System.out.println("the given number is in power of two"); 
        }
        else{ 
            System.out.println("the given number is not in power of two");
        }
    }
}