/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode head =null; TreeLinkNode first =null; TreeLinkNode holding =null; boolean bool =false;
        head = root;
        Queue<TreeLinkNode> q =new LinkedList<TreeLinkNode>();
        if(head!=null){
        q.add(head);
        while(!q.isEmpty()){
            int size = q.size();
            second = null;
            LinkedList<TreeLinkNode> resu = new LinkedList<TreeLinkNode>();
            while(size>0 ){
               first = (TreeLinkNode) q.remove();
               resu.add(first);
               if(first.left!=null){
                   q.add(first.left);
               }
               if(first.right!=null){
                   q.add(first.right);
               }
               size --;
        
                if(second!=null){
                      second.next = first; 
                      second = first;
            }
                   else{
                       second= first;
                   }
                   
                   
               }
             }
             
        }
    }
    }

