/*Given a binary tree, where every node value is a number. Find the sum of all the numbers that are formed from root to leaf paths.
The formation of the numbers would be like 10*parent + current (see the examples for more clarification).*/
class Tree
{
      int data;
      Tree left,right;
      Tree(int d){
          data=d;
          left=null;
          right=null;
}
}
class Solution {
    public static int sum = 0;
    public static void pathSum(Node root,int num){
        if(root==null) return;
        if(root.left==null && root.right==null){
            num = num*10+root.data;
            sum += num;
            return;
        }
        num = num*10+root.data;
        pathSum(root.left,num);
        pathSum(root.right,num);
    }
    public static int treePathsSum(Node root) {
        sum = 0;
        pathSum(root,0);
        return sum;
    }
}
