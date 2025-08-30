import java.util.*;
public class largestNum{ 
    public static void main(String args[]){ 
        System.out.println("Hellow this program finds the largest of two numbers ");

        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the first number : ");
        int num1 = sc.nextInt(); 
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt(); 

        if(num1 > num2){ 
            System.out.println(num1 + " is greater than " + num2);
        }
        else if(num2 > num1){ 
            System.out.println(num2 + " is greater than " + num1);
        }
        else{ 
            System.out.println(num1 + " and " + num2 + "are the equal numbers ");
        }

        int randomNum = sc.nextInt(); 

        if(randomNum % 2 == 0){ 
            System.out.println("The number " + randomNum + " is even");
        }
        else{ 
            System.out.println("The number " + randomNum + " is odd");
        }


        System.out.println("Now lets build a tax calculator ");

        // income < 5L => NO tax 
        // income between 5L to 10L => 20% tax 
        // income > 10L => 30% tax


        System.out.println("Now enter the income : ");
        int income = sc.nextInt(); 

        if(income < 500000){ 
            System.out.println("Your income tax is 0");
        }
        else if(income >= 500000 && income < 1000000){ 
            System.out.println("Your income tax is " + 0.20*income);
        }
        else{ 
            System.out.println("Your income tax is " + 0.30*income);
        }

        System.out.println("Now enter the three numbers to find largest");

        System.out.println("Enter the first number : ");
        int firstNum = sc.nextInt(); 
        System.out.println("Enter the second number : ");
        int secondNum = sc.nextInt(); 
        System.out.println("Enter the third number : ");
        int thirdNum = sc.nextInt(); 

        if(firstNum > secondNum){ 
            if(firstNum > thirdNum){ 
                System.out.println("The " + firstNum + "  first number is greater than other");
            }
            else{ 
                System.out.println("The" + thirdNum + "  third number is greater than the other ");
            }
        }
        else if(secondNum > firstNum){ 
            if(secondNum > thirdNum){ 
                System.out.println("The" + secondNum + "  is greater than the other ");
            }
            else{ 
                System.out.println("The " + thirdNum + "  is greater than the other ");
            }
        }
        else{ 
            if(firstNum < thirdNum){ 
                System.out.println("The " + thirdNum + " is greater than the other ");
            }
        }
        
    }
}