/*You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

Note: The answer should be returned in an increasing format.*/
class Solution {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer> al = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:nums){
            if(3*hm.get(i)>n) {
                if(!al.contains(i))al.add(i);
        }
        }
        Collections.sort(al);
        return al;
    }
}
