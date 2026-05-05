/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head,fast=head,front=null;
        for(int i=1;i<k;i++) fast=fast.next;
        front=fast;
        fast=fast.next;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        int tmp=slow.val;
        slow.val=front.val;
        front.val=tmp;
        return head;
    }
}