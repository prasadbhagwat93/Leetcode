/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode nextNode = null;
        ListNode prev=null; ListNode current=null;
        current =head; 
        while(current!=null){
            nextNode=current.next;
          current.next=prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }
}
