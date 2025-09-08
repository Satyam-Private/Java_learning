import  java.util.*;
public class arrays{ 
    public static int LinearSearch(int arr[] , int target){ 
        for(int i = 0; i < arr.length; i++){ 
            if(arr[i] == target){ 
                return i;
            }
        }
        return -1;
    }

    public static int  binarySearch(int arr[] , int target){ 
        // for using binary search the array must be sorted otherwise it will not work 
        Arrays.sort(arr);
        System.out.println("The sorted array is : ");
        for(int i  = 0; i < arr.length; i++){ 
            System.out.println(arr[i]);
        }

        int start = 0 , end = arr.length -1; 
        int mid = (start + end) / 2; 

        while(start <= end){ 
            if(arr[mid] == target){ 
                return mid; 
            }
            else if(arr[mid] < target){ 
                start = mid + 1;
            }
            else{ 
                end = mid -1;
            }
            mid = (start + end) / 2;
        }
        return -1;
        
    }
    public static void main(String[] args) {
        int arr[] = {8 , 3 , 5 ,6 ,6}; 
        System.out.println(arr);
        System.out.println("hello");

        for(int i = 0; i < arr.length; i++){ 
            System.out.println(arr[i]);
        }
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the target to find the above array : ");
        int target = sc.nextInt(); 
        int ans = LinearSearch(arr , target); 
        System.out.println("the provided target is present at index " + ans);
        int ans2 = binarySearch(arr, target);
        System.out.println("Binary search find the element at index " + ans2);
    }
}