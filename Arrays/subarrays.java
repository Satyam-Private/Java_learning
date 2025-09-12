public class subarrays{ 
    public static void getSubArrays_eff(int arr[]){ 
        int start = 0, end = 0;
        while(start < arr.length){ 
            if(end == arr.length){ 
                end = 0; 
                start++;
            }
            for(int i = start; i <= end; i++){ 
                System.out.print(arr[i] + " ");
            }
            end++;
            System.out.println();
        }
    }
    public static void getSubArrays(int arr[]){ 
        long sum = 0, maxSum = Integer.MIN_VALUE, minSum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){ 
            for(int j  = i; j < arr.length; j++){ 
                for(int  k = i;  k <= j ; k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k]; 
                }
                System.out.println("The sum of above subarray is : " + sum);
                if(sum > maxSum) maxSum = sum; 
                if(sum < minSum) minSum = sum; 
                sum = 0;
                System.out.println();
            }
        }
        System.out.println("The maxsum here is " + maxSum);
        System.out.println("The minsum here is " + minSum);
    }
    public static void main(String[] args) {
        int arr[] = {1 ,  2 , 3 , 4 , 5}; 

        // getSubArrays(arr); 
        getSubArrays_eff(arr);
    }
}