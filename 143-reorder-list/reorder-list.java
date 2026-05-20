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
    public void reorderList(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;

        ListNode prev = null, next = null, curr = head2;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        head2=prev;
        while(head!=null && head2!=null){
            temp.next=head;
            head=head.next;
            temp=temp.next;

            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        if(head!=null) temp.next=head;
        if(head2!=null) temp.next=head2;
    }
}