
import java.util.Scanner;

public class aug_30{ 


    public void pattern(int n){ 
        for(int i = 1; i <= n; i++){ 
            for(int j = 1; j <= n; j++){ 
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

    public int reverseNum(int num){ 
        int temp = 0; 
        while(num > 0){ 
            int lastDigit = num % 10;
            temp = temp*10 + lastDigit;

            num = num / 10;
        }
        return temp;
    }

    public boolean checkForPrime(int num) {
    if (num <= 1) return false; // 0, 1, negatives are not prime
    if (num == 2) return true;  // 2 is prime
    
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false; // found a divisor
        }
    }
    return true; // no divisors found
}
    public static void main(String args[]){ 
        aug_30 obj = new aug_30();
        Scanner sc = new Scanner(System.in);

        System.out.println("Your task is to keep entering the number : ");

        while (true) { 
            int num = sc.nextInt(); 
            if(num % 10 == 0){ 
                System.out.println("You entered " + num + " which is multiple of 10");
                break;
            }
            System.out.println("You entered " + num);
        }

        System.out.println("Now lets print a pattern ");
        System.out.println("Enter a random number : ");
        int randomNum = sc.nextInt();
        obj.pattern(randomNum);


        System.out.println("Lets reverse a number !!");
        System.out.println("Enter a random number again : ");
        int num1 = sc.nextInt();
        int ans = obj.reverseNum(num1);
        System.out.println("The reversed number is " + ans);


        System.out.println("Now lets see you enter a prime number or a not prime number !");

        int num2 = sc.nextInt(); 

        boolean ans1 = obj.checkForPrime(num2);
        System.out.println(ans1);
    }
}