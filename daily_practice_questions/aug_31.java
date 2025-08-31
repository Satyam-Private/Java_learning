import java.util.Scanner;

public class aug_31{ 
    public static void main(String args[]){ 
        System.out.println("Here are the solutions of practice session");

        System.out.println("Your task is to enter five random  integers, i will give sum of odd and even numbers within it! ");
        int sumEven = 0;
        int sumOdd  = 0;
        Scanner sc = new Scanner(System.in); 
        for(int i = 1; i <= 5; i++){ 
           
            int number = sc.nextInt(); 

            if(number % 2 == 0){ 
                sumEven += number;
            }
            else{ 
                sumOdd += number;
            }


        }
        System.out.println("The sum of even numbers is " + sumEven);
        System.out.println("The sum of odd numbers is " + sumOdd);

        System.out.println("Now lets give multiplication table ");
        int number = sc.nextInt(); 


        for(int i = 1; i<= 10; i++){ 
            System.out.println(number*i);
        }


        System.out.println("Lets implement factorial of a number : ");

        int factNum = sc.nextInt(); 
        if(factNum == 0 || factNum == 1){ 
            System.out.println("The factorial is 1");
        }
        else{ 
            int ans = 1;
        while(factNum >= 1){
            ans *= factNum;
            factNum--;
        }
        System.out.println("The factorial is "+ ans);
        
        }

    }
}