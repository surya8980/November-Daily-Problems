/*Given an integer array nums and an integer k, return the length of the shortest non-empty subarray of nums with a sum of at least k. If there is no such subarray, return -1.

A subarray is a contiguous part of an array.*/
class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] sum = new long[n + 1];
        
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        
        int[] q = new int[n + 1]; 
        int l = 0, r = 0; 
        int minLength = n + 1;
        
        for (int i = 0; i < sum.length; i++) {
            while (r > l && sum[i] >= sum[q[l]] + k) {
                minLength = Math.min(minLength, i - q[l++]);
            }
            
            while (r > l && sum[i] <= sum[q[r - 1]]) {
                r--;
            }
            
            q[r++] = i;
        }
        
        return minLength <= n ? minLength : -1;
    }
}
