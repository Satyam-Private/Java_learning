public class revArr{ 
    public static void reverseArr(int arr[]){ 
        int start = 0, end = arr.length-1; 
        while(start <= end){ 
            int temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp;
            start++; 
            end--;
        }
    }
    public static void findPairs(int arr[]){
        int totalPairs = 0;
        for(int i = 0; i < arr.length; i++){ 
            for(int j = i+1; j < arr.length; j++){ 
                System.out.println(arr[i] + " " + arr[j]);
                totalPairs++;
            }
        } 
        System.out.println("The total number of pairs are " + totalPairs);

    }
    public static void main(String[] args) {
        int arr[] = {1, 2 , 3 , 4 ,5}; 

        reverseArr(arr); 
        for(int i = 0; i < arr.length; i++){ 
            System.out.println(arr[i]);
        }
        reverseArr(arr); 
        for(int i = 0; i < arr.length; i++){ 
            System.out.println(arr[i]);
        }
        findPairs(arr); 

    }
}