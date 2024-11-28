
// Given an integer array arr[]. You need to find the maximum sum of a subarray.
class Solution {

    // arr: input array
    // Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int[] arr) {

        // Your code here
        long sum=0;
        long maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            maxsum=Math.max(sum,maxsum);
            if(sum<0) sum=0;
        }
        return maxsum;
    }
}
