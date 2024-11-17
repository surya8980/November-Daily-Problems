//You are given an array of integers arr[]. Your task is to reverse the given array.
class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            int k = arr[i];
            arr[i]=arr[j];
            arr[j]=k;
            i++;
            j--;
        }
    }
}
