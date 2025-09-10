import java.util.*;
public class find_largest{ 
    public static int getLargest(int newArr[]){ 
        int largestNum = Integer.MIN_VALUE;
        for(int i = 0 ;  i < newArr.length; i++){ 
            if(newArr[i] > largestNum){ 
                largestNum = i;
            }
        }
        return largestNum;

    }
    public static int getSmallest(int newArr[]){ 
        int smallestNum = Integer.MAX_VALUE;
        for(int i = 0; i < newArr.length; i++){ 
            if(newArr[i] < smallestNum){ 
                smallestNum = i;
            }
        }
        return smallestNum;
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of the new array : ");
        Scanner sc = new Scanner(System.in); 
        int size = sc.nextInt(); 
        System.out.println("Now enter the element one by one : ");
        int newArr[] = new int[size]; 
        for(int i = 0; i < size; i++){ 
            newArr[i] = sc.nextInt(); 
        }
        
        System.out.println("the largest element is at index " + getLargest(newArr));
        System.out.println("the smallest element is at index " + getSmallest(newArr));

    }
}