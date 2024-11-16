/*Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements.
Do the mentioned change in the array in place.*/
class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int i =0 ;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=0){
                int t= arr[i];
                arr[i]= arr[j];
                arr[j] = t;
                i++;
            }
        }    
    }
}
