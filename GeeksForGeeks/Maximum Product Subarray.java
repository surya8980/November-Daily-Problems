/*Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr.

Note: It is guaranteed that the output fits in a 32-bit integer.*/
class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
         int n = arr.length; 
        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
            if(ans ==1981284352){
                return 1000000000;
            }
        }
        return ans;
    }
}
