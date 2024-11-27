/*Given a linked list, 
your task is to complete the function isLengthEven() which contains the head of the linked list
and check whether the length of the linked list is even or not. Return true if it is even, otherwise false.
*/
class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        int len=0;
        Node cur = head;
        while(cur!=null){
            cur=cur.next;
            len++;
        }
        if(len%2==0)return true;
        return false;
    }
}
