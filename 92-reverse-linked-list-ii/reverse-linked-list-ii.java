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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode beforeLeft=dummy;
        for(int i=1;i<left;i++){
            beforeLeft=beforeLeft.next;
        }
        ListNode subHead=beforeLeft.next;
        ListNode prev = null, curr = subHead, next=null;
        for(int i=0;i<=right-left;i++){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        beforeLeft.next=prev;
        subHead.next=curr;
        return dummy.next;
    }
}