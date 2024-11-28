
/*
Given two singly linked lists, return the point where two linked lists intersect.

Note: If the linked lists do not merge at any point, return -1.
Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
    int intersectPoint(Node head1, Node head2) {
        // code here
        Node temp1 = head1;
        HashSet<Node> hm = new HashSet<>();
        while(temp1!=null){
            hm.add(temp1);
            temp1=temp1.next;
        }
        Node temp2= head2;
        while(temp2!=null){
            if(hm.contains(temp2)){
                return temp2.data;
            }else{
                temp2=temp2.next;
            }
        }
        return -1;
    }
}
