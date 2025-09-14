
import java.util.Scanner;

public class input{ 
    public static void createMatrix(int row , int col){ 
        int matrix[][] = new int[row][col]; 

        System.out.println("Now the matrix is created, enter the element one by one  : ");
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < row; i++){ 
            for(int j = 0; j < col; j++){ 
                int element  = sc.nextInt(); 
                matrix[i][j] = element;
            }
        }
     printMatrix(matrix);
    }
    public static void printMatrix(int matrix[][]){
        for(int  i = 0; i < matrix.length;i++){ 
            for(int j = 0; j < matrix[0].length; j++){ 
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){ 
        System.out.println("Hello");
        System.out.println("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in); 
        int row = sc.nextInt();
        System.out.println("enter the number of cols");
        int col = sc.nextInt();
        createMatrix(row , col); 
       
    }
}