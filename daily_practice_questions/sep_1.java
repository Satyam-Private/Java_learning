
import java.util.Scanner;

public class sep_1 { 

    void hollow_rect(int num){ 
        for(int i = 1; i <= num; i++){ 
            for(int j = 1; j <= num; j++){ 
                if(i == 1 || j == 1 || i == num || j == num){ 
                    System.out.print("*");
                }
                else{ 
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

    void inv_rot_half_pyramid(int num){ 
        for(int i = 1; i <= num; i++){ 
            for(int j = 1; j <= num - i; j++){ 
                    System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){ 
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void inv_half_pyramid(int num){ 
        int count; 
        for(int i = 0; i < num; i++){ 
            count = 1;
            for(int j = 0; j < num - i; j++){ 
                    System.out.print(count);
                    count++;
            }
            System.out.println("");
        }
    }

    void floyyd_triangle(int num){ 
        int count = 1;
        for(int i = 1; i <= num; i++){ 
            for(int j = 1; j <= i; j++){ 
                System.out.print(count + " ");
                count++;
            }
            System.out.println("");
        }
    }
    void floyyd_triangle01(int num){ 
        int count = 1;
        for(int i = 1; i <= num; i++){ 
            for(int j = 1; j <= i; j++){ 
                System.out.print(count + " ");
                if(count == 1){ 
                    count = 0;
                }
                else{ 
                    count = 1;
                }
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any random number : ");
        int num = sc.nextInt();
        sep_1 obj = new sep_1();
        obj.hollow_rect(num);
        obj.inv_rot_half_pyramid(num);
        obj.inv_half_pyramid(num);
        obj.floyyd_triangle(num);
        obj.floyyd_triangle01(num);
    }
}