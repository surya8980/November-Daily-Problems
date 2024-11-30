//Given two strings s1 and s2 consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other. Strings s1 and s2 can only contain lowercase alphabets.

//Note: You can assume both the strings s1 & s2 are non-empty.

  class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {
        //base case if lengths are not equal they are not anagrams
        if(s1.length()!=s2.length())return false;
        char []ss1= s1.toCharArray();
        char []ss2 = s2.toCharArray();
        Arrays.sort(ss1);
        Arrays.sort(ss2);
        for(int i=0;i<ss1.length;i++){
            if(ss1[i]!=ss2[i])return false;
        }
        return true;
    }
}
