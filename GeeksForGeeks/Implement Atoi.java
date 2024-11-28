/*Given a string s, the objective is to convert it into integer format without utilizing any built-in functions. Refer the below steps to know about atoi() function.

Cases for atoi() conversion:

Skip any leading whitespaces.
Check for a sign (‘+’ or ‘-‘), default to positive if no sign is present.
Read the integer by ignoring leading zeros until a non-digit character is encountered or end of the string is reached. If no digits are present, return 0.
If the integer is greater than 231 – 1, then return 231 – 1 and if the integer is smaller than -231, then return -231.*/
class Solution {
    public int myAtoi(String s) {
        // Your code here
        int i=0;
        long val=0;
        int flag = 1;
        //case 1 handle white spaces
        while(i<s.length()&&s.charAt(i)==' ')i++;
        // for a sign (‘+’ or ‘-‘), default to positive if no sign is present.
        if(i<s.length()&&s.charAt(i)=='+'||s.charAt(i)=='-'){
            if(s.charAt(i)=='-')flag=-1;
            else flag=1;
            i++;
        }
        //Read the integer by ignoring leading zeros until a non-digit character 
        //is encountered or end of the string is reached. If no digits are present, return 0
        while(i<s.length()&&s.charAt(i)>='0'&&s.charAt(i)<='9'){
            val = val*10+(s.charAt(i)-'0');
            if(val*flag>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }else if(val*flag<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)(val*flag);
    }
}
