import  java.util.Scanner;
public class intro{ 

    public static void changeArr(int arr[]){ 
        arr[0] += 1;
    }
    public static void main(String args[]){ 
        int arr[] = new int[5]; // this will declare the arrray with memory address 
        System.out.println(arr.length);
        

        // int arr1[] = { 1 , 5 , 5 ,6}; 
        // System.out.println(arr1.length);
        // System.out.println(arr1[1]);
        // System.out.println(arr[0]);
        // changeArr(arr);  // means here we are passing array to a function 
        // System.out.println(arr[0]);  


        System.out.println("Enter the size of the new array : ");
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 
        System.out.println("Now enter the element one by one : ");
        int newArr[] = new int[size]; 
        for(int i = 0; i < size; i++){ 
            newArr[i] = sc.nextInt(); 
        }
        System.out.println("Now enter the target value : ");
        int target = sc.nextInt(); 
        int ans = -1; 
        for(int i = 0; i < size;  i++){ 
            if(newArr[i] == target){ 
                ans = i;
            }
        }
        System.out.println("The target is found at index : " + ans);

    }
}