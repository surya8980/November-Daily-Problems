/*You are given a string s consisting of the characters 'a', 'b', and 'c' and a non-negative integer k. Each minute, you may take either the leftmost character of s, or the rightmost character of s.

Return the minimum number of minutes needed for you to take at least k of each character, or return -1 if it is not possible to take k of each character.*/
class Solution {

    public int takeCharacters(String s, int k) {
        int[] count = new int[3];
        int n = s.length();

        // Count total occurrences
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Check if we have enough characters
        for (int i = 0; i < 3; i++) {
            if (count[i] < k) return -1;
        }

        int[] window = new int[3];
        int left = 0, maxWindow = 0;

        // Find the longest window that leaves k of each character outside
        for (int right = 0; right < n; right++) {
            window[s.charAt(right) - 'a']++;

            // Shrink window if we take too many characters
            while (
                left <= right &&
                (count[0] - window[0] < k ||
                    count[1] - window[1] < k ||
                    count[2] - window[2] < k)
            ) {
                window[s.charAt(left) - 'a']--;
                left++;
            }

            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        return n - maxWindow;
    }
}

/*
count total occurances
if any of the letter count is less than k return -1
else initialise a count array of size 3 
start iterating from 0 to n
increment the count of char 
if at any time count exceeding k decrement window len 
max windiw will be tot len - max valid window
*/
