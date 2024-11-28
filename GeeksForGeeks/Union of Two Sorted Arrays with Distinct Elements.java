
/*Given two sorted arrays a[] and b[], where each array contains distinct elements , the task is to return the elements in the union of the two arrays in sorted order.

Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.*/
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
         ArrayList<Integer> al = new ArrayList<>();
         for(int i :a){
             if(!al.contains(i)) al.add(i);
         }
         for(int i :b){
             if(!al.contains(i)) al.add(i);
         }
         Collections.sort(al);
         return al;
    }
}
