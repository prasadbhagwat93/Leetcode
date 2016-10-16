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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> list = new LinkedList<TreeNode>();
        List<Integer> res = new LinkedList<Integer>();
        if(root == null)
        {
            return res;
        }
        list.add(root);
        while(!list.isEmpty()){
            int m = list.size();
            for(int i =0;i<m;i++){
            TreeNode node = list.remove();
            if(i == 0){
               res.add(node.val);   
            }
          try{
            if(node.right!=null){
            list.add(node.right);
            }
          }
          catch(Exception e){
              
          }
            if(node.left!=null){
            list.add(node.left);
            }
                
            }
            
        }
        return res;
    }
}
