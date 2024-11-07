/*The bitwise AND of an array nums is the bitwise AND of all integers in nums.

For example, for nums = [1, 5, 3], the bitwise AND is equal to 1 & 5 & 3 = 1.
Also, for nums = [7], the bitwise AND is 7.
You are given an array of positive integers candidates. Evaluate the bitwise AND of every combination of numbers of candidates. 
Each number in candidates may only be used once in each combination.

Return the size of the largest combination of candidates with a bitwise AND greater than 0.*/
class Solution {
    public int largestCombination(int[] candidates) {
        int maxCount = 0;
        
        // Iterate over each bit position from 0 to 31
        for (int bit = 0; bit < 32; bit++) {
            int count = 0;
            
            // Count how many numbers have the current bit set
            for (int num : candidates) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }
            
            // Keep track of the maximum count across all bit positions
            maxCount = Math.max(maxCount, count);
        }
        
        return maxCount;
    }
}
