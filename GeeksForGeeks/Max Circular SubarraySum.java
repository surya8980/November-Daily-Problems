//Given an array of integers arr[] in a circular fashion. Find the maximum subarray sum that we can get if we assume the array to be circular.
class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[]) {
        
        // Your code here
        int totalSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int currMax = 0;
        int currMin = 0;
        
        for (int num : a) {
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);
            
            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);
            
            totalSum += num;
        }
        
        if (maxSum < 0) {
            // All numbers are negative, return the max element
            return maxSum;
        }
        
        return Math.max(maxSum, totalSum - minSum);
    }
    
}
