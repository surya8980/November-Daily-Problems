/*Given an integer array arr, remove a subarray (can be empty) from arr such that the remaining elements in arr are non-decreasing.

Return the length of the shortest subarray to remove.

A subarray is a contiguous subsequence of the array.*/
class Solution {

    public int findLengthOfShortestSubarray(int[] arr) {
        int right = arr.length - 1;
        while (right > 0 && arr[right] >= arr[right - 1]) {
            right--;
        }

        int ans = right;
        int left = 0;
        while (left < right && (left == 0 || arr[left - 1] <= arr[left])) {
            // find next valid number after arr[left]
            while (right < arr.length && arr[left] > arr[right]) {
                right++;
            }
            // save length of removed subarray
            ans = Math.min(ans, right - left - 1);
            left++;
        }
        return ans;
    }
}
