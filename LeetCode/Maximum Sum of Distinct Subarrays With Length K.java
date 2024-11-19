/*You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

The length of the subarray is k, and
All the elements of the subarray are distinct.
Return the maximum subarray sum of all the subarrays that meet the conditions. If no subarray meets the conditions, return 0.

A subarray is a contiguous non-empty sequence of elements within an array.*/
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max =0;
		long sum =0;
        int n = nums.length;
		HashMap<Integer,Integer > hs = new HashMap<>();
		for(int i=0; i<k; i++) {
			hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
		}
        if(hs.size()==k){
            max = sum;
        }
		for(int i=k; i<n; i++) {
			if(hs.containsKey(nums[i-k])&&hs.get(nums[i-k])>1){
                hs.put(nums[i-k],hs.get(nums[i-k])-1);
            }else{
                hs.remove(nums[i-k]);
            }
            sum= sum-nums[i-k]+nums[i];
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);
            if(hs.size()==k){
                max = Math.max(sum, max);
            }
		}
		return max;
    }
}
