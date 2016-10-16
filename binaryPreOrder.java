/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
     public List<Integer> inOrder = new ArrayList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
       
       addInorder(root,inOrder);
       return inOrder;
       
    }
    public void addInorder(TreeNode root, List<Integer> inOrder){
         if(root!=null){
            inOrder.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
         }
    }
}
