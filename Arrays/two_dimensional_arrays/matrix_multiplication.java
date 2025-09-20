
import java.util.Scanner;

public class matrix_multiplication {

    public static void main(String args[]) {
        System.out.print("Hellow");
        int row, col;
        System.out.println("Enter the number of rows : ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        System.out.println("Enter the number of col : ");
        col = sc.nextInt();

        int m1[][] = new int[row][col];
        int m2[][] = new int[row][col];
        int ans[][] = new int[row][col];

        for (int start = 0; start < row; start++) {
            for (int end = 0; end < col; end++) {

                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        ans[start][end] += m1[i][j] * m2[j][i];
                    }
                }
            }
        }
    }
}
