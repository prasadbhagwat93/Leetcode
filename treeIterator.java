/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    Queue<Integer> damn = new LinkedList<Integer>();
    TreeNode head;

    public BSTIterator(TreeNode root) {
        head = root;
        helper(root,damn);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(damn.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    /** @return the next smallest number */
    public int next() {
        int x= (int) damn.remove();
        return x;
    }
    public void helper(TreeNode root, Queue<Integer> damn){
        if(root!=null){
            helper(root.left,damn);
            damn.add(root.val);
            helper(root.right,damn);
            }
        }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
