/*You are given a 0-indexed binary string s having an even length.

A string is beautiful if it's possible to partition it into one or more substrings such that:

Each substring has an even length.
Each substring contains only 1's or only 0's.
You can change any character in s to 0 or 1.

Return the minimum number of changes required to make the string s beautiful.*/

class Solution {
    public int minChanges(String s) {
        int ans=0,c=0;
        for(int i=0;i<s.length();i++){
            c+=s.charAt(i)-'0';
            if(i%2==1){
                ans+=(c%2);
                c=0;
            }
        }
        return ans;
    }
}

