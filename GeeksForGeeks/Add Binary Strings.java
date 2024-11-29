/* Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.*/


class Solution {
    public String addBinary(String s1, String s2) {
       StringBuilder sb = new StringBuilder();
       int l1 = s1.length()-1;
       int l2 = s2.length()-1;
       int carry = 0;
       
       while(l1>=0||l2>=0||carry>0)
       {
           int a = (l1>=0) ? s1.charAt(l1)-'0' : 0;
           int b = (l2>=0) ? s2.charAt(l2)-'0' : 0;
           
           int sum = a+b+carry;
           int digit = sum%2;
           carry = sum/2;
           
           sb.append(digit);
           l1--;
           l2--;
       }
       sb.reverse();
       while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0); 
        }
       
       return sb.toString();
    }
}
