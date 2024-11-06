/*
You are given a 0-indexed array of positive integers nums.

In one operation, you can swap any two adjacent elements if they have the same number of 
set bits
. You are allowed to do this operation any number of times (including zero).
Return true if you can sort the array, else return false.*/
class Solution {
    public boolean canSortArray(int[] nums) {int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[i]){
                    if(Integer.bitCount(nums[i])==
                    Integer.bitCount(nums[j])){
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
                    else return false;
                }
            }
        }
        for(int i=1;i<=n-1;i++){
            if(nums[i]<nums[i-1]) return false;
        }
        return true;
    }
}
