/*Given an array, arr[], determine if arr can be split into three consecutive parts such that the sum of each part is equal.
If possible, return any index pair(i, j) in an array such that sum(arr[0..i]) = sum(arr[i+1..j]) = sum(arr[j+1..n-1]), otherwise return an array {-1,-1}.
Note: Since multiple answers are possible, return any of them. The driver code will print true if it is correct otherwise, it will print false.
*/
class Solution {

    public List<Integer> findSplit(int[] arr) {
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
        int sum=0;
        int l=arr.length;
        for(int a:arr){
        sum+=a;
        }
        if(sum%3!=0){
            return  Arrays.asList(-1,-1);
        }
        int part=sum/3;
        int s=0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<l;i++){
        s+=arr[i];
        if(s==part){
            list.add(i);  
            s=0;
            if(list.size()==2)return list;
        } 
    }
    return  Arrays.asList(-1,-1);
}}
