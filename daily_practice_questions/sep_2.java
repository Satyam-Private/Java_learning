import java.util.*;
public class sep_2 { 

    static boolean guessNum(int randomNum){ 
        System.out.println("First guess the number !! ");
        Scanner sc = new Scanner(System.in); 
        int entered = sc.nextInt(); 
        int count = 1;
        while(entered != randomNum){ 
            if(entered == randomNum){ 
            break;
        }
        else if(entered > randomNum){ 
            System.out.println("You entered a larger number! Enter again :  ");
            entered = sc.nextInt(); 
        }
        else{ 
            System.out.println("You entered a smaller number! Enter again: ");
            entered = sc.nextInt(); 
        }
        count++;
        }
        System.out.println("You made it in " + count + " moves");
        return true;
    }
    public static void main(String args[]){ 
        int randomNum =  ( int ) (Math.random() * 100);

        boolean ans =  guessNum(randomNum);
        if(ans){ 
            System.out.println("Hey you found it ");
        }
        System.out.println(randomNum);
    }
}