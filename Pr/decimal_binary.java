import java.util.*;

public class decimal_binary{ 
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 

        int num = sc.nextInt(); 

        System.out.println("the number that entered is " + num);
        String ans = "";
        while(num > 0){ 
            int rem = num % 2; 
            num = num / 2;
            ans += rem;

        }
        String finalAns = "";
        for(int i = ans.length() - 1; i >= 0; i--){ 
            finalAns += ans.charAt(i);
        }
        System.out.println(finalAns);

    }
}