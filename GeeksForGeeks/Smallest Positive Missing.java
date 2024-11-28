//You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

//Note: Positive number starts from 1. The array can have negative integers too.
class Solution {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        Arrays.sort(arr);
        int n = arr.length;
        int k = arr[n-1];
        HashSet<Integer> hs = new HashSet<>();
        for(int i:arr){
            hs.add(i);
        }
        int ans=1;
        for(int i=1;i<=k+1;i++){
             if(!hs.contains(i)) {
                 ans=i;
                 break;
             }
        }
        return ans;
    }
}
