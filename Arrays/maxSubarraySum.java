public class maxSubarraySum{ 
    public static int maxSum_brute(int arr[]){ 
        int sum = 0, maxSum = Integer.MIN_VALUE; 
        for(int i = 0; i < arr.length; i++){ 
            for(int j = i; j < arr.length; j++){ 
                for(int k = i; k <= j; k++){ 
                    sum += arr[k]; 
                }
                if(sum > maxSum) maxSum = sum; 
                sum = 0; 
            }
        }
        return maxSum; 
    }
    // public static int  maxSum_prefixSum(int arr[]){
    //     int sum = 0, maxSum = Integer.MIN_VALUE; 
    //     int prefix_sum[] = new int[arr.length];
    //     prefix_sum[0] = arr[0];  
    //     for(int i = 1; i < arr.length; i++){ 
    //         prefix_sum[i] = prefix_sum[i-1] + arr[i]; 
    //     }
        
    // }

    public static int maxSum_kadanes(int arr[]){ 
        int maxEle = Integer.MIN_VALUE, count = 0;
        for(int i = 0; i < arr.length; i++){ 
            if(arr[i] > 0){ 
                break;
            }
            if(arr[i] > maxEle){ 
                maxEle = arr[i];
            }
            count++;
        }
        if(count == arr.length){ 
            return maxEle; 
        }
        int currSum = 0, maxSum = Integer.MIN_VALUE; 
        for(int i = 0;  i < arr.length; i++){ 
            currSum = currSum + arr[i]; 
            if(currSum < 0){ 
                currSum = 0; 
            }
            maxSum = Math.max(currSum, maxSum); 
        }
        return maxSum;
    }
    public static void main(String[] args) {
        // int arr[] = { 1, -2, 3, -4 , 5 }; 
        // int arr[] = {-2, -3, 4, -1 , -2, 1 , 5,  -3 }; 
        int arr[] = {-2, -3, -4, -10 , -2, -1 , -5,  -3 }; 

        // int ans = maxSum_brute(arr); 
        int ans = maxSum_kadanes(arr);
        System.out.println("The max sum that can be obtained from this array is " + ans);
    }
}