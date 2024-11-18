/*Given an unsorted array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.
Note: Consider the array as circular.*/class Solution {
    static void reverse(int []arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        d=d%arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        // d=d%arr.length;
        // while(d>0){
        //     int temp = arr[0];
        //     for(int i=1;i<arr.length;i++){
        //         arr[i-1]=arr[i];
        //     }
        //     arr[arr.length-1]=temp;
        //     d--;
        // }
    }
}
