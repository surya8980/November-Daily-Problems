/*Given an integer array arr[ ], your task is to find the minimum number of increment operations required to make all the array elements unique. i.e. no value in the array should occur more than once. In one operation, a value can be incremented by 1 only.

Note: The answer will always fit into a 32-bit integer.*/
class Solution {
    public int minIncrements(int[] arr) {
        // Code here
        int cout=0;
        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<=arr[i-1]){
                int val = arr[i-1]-arr[i]+1;
                cout+=val;
                arr[i]+=val;
            }
        }
        return cout;
        
    }
}
