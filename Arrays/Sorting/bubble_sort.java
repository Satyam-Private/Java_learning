public class bubble_sort{ 
    public static void bubble_sort(int arr[]){ 
        for(int turn = 0; turn < arr.length-1; turn++){ 
            for(int i = 0; i < arr.length-1-turn; i++){ 
                if(arr[i] > arr[i+1]){ 
                    int temp = arr[i]; 
                    arr[i] = arr[i+1]; 
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){ 
        System.err.println("Hello");
        int arr[] = {5 , 3, 4 , 2 ,1};
        
        for(int i = 0 ; i  < arr.length; i++){ 
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubble_sort(arr); 
        System.out.println("The modified array is : ");

        for(int i = 0 ; i  < arr.length; i++){ 
            System.out.print(arr[i] + " ");
        }
    }
}