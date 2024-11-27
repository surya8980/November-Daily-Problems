/*Given a string word, compress it using the following algorithm:

Begin with an empty string comp. While word is not empty, use the following operation:
Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
Append the length of the prefix followed by c to comp.
Return the string comp.
*/
class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();//to store th resultant string
        int cnt = 1, n = word.length();
        char ch = word.charAt(0);
        for (int i = 1; i < n; i++) {
            if (word.charAt(i) == ch && cnt < 9) { //if char == ch and cnt <9 cnt++
                cnt++;
            } else {
                comp.append(cnt).append(ch); //else append ch to string update count and char 
                ch = word.charAt(i);
                cnt = 1;
            }
        }
        comp.append(cnt).append(ch);
        return comp.toString();
    }
}
