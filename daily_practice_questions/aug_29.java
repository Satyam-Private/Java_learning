
import java.util.Scanner;

public class aug_29{

    public void average(){ 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the first number : ");
        int firstNum = sc.nextInt();

        System.out.println("Enter the second number : ");
        int secondNum = sc.nextInt(); 

        System.out.println("Enter the third number : ");
        int thirdNum = sc.nextInt(); 


        int avg = (firstNum + secondNum + thirdNum)/3; 
        System.out.println("The average of the above three numbers is " + avg);
    }

    public int squareArea(){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square : ");
        int side = sc.nextInt(); 


        return side*side;
    }
    
    public static void main(String[] args) {
        aug_29 obj = new aug_29();
        obj.average();


        int area = obj.squareArea();
        System.out.println("The area of the entered sqaure is " + area);
    }
}