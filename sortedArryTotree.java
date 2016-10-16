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
    public TreeNode sortedArrayToBST(int[] nums) {
        
      if(nums.length==0)
        {
            return null;
        }
        else{
            TreeNode root = damn(nums,0,nums.length-1);
            return root;
        }
    }
    
    public TreeNode damn(int[] nums, int s, int l){
        if(s>l){
            return null;
        }
        
            int m = (s+l)/2;
            TreeNode root = new TreeNode(nums[m]);
            root.left = damn(nums, s,m-1);
            root.right= damn(nums,m+1,l);
        return root;
    }
}
