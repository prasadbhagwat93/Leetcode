/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {

    /** @param head The linked list's head.
        Note that the head is guaranteed to be not null, so it contains at least one node. */
        ListNode h = null; ListNode go;
    public Solution(ListNode head) {
        h = head;
        go =head;
    }
    
    /** Returns a random node's value. */
   /** Returns a random node's value. */
    public int getRandom() {
        Random r= new Random();
        int count=1;
        ListNode p = h;
        int result = 0;
        while(p!=null){
            if(r.nextInt(count)==0)
                result= p.val;
            count++;
            p = p.next;
        }
        return result;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */
