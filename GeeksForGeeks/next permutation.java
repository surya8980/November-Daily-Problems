
/*Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order). 

Note - A permutation of n numbers is any possible arrangement of all the integers in range [1-n] where each integer occurs exactly once. */
class Solution {
     void nextPermutation(int[] arr) {
        // Step 1: Find the first index from the end where nums[i] < nums[i+1]
        int ind = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                ind = i;
                break;
            }
        }
        // Step 2: If no such index exists, the array is sorted in descending order. 
        // Reverse the whole array to get the smallest permutation.
        if (ind == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        }
        for (int i = arr.length - 1; i > ind; i--) {
            if (arr[i] > arr[ind]) {
                int temp = arr[i];
                arr[i] = arr[ind];
                arr[ind] = temp;
                break;
            }
        }
        
        reverse(arr, ind + 1, arr.length - 1);
    }

    private void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
