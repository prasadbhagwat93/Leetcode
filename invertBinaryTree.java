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
    public TreeNode invertTree(TreeNode root) {
        if(root!=null){
        TreeNode base = root;
        helper(base);
        }
        return root;
    }
    
    void helper(TreeNode root){
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        if(root.left!=null){
            helper(root.left);
        }
        if(root.right!=null){
            helper(root.right);
        }
    }
}
