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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy, temp=head;
        while(temp!=null){
            if(temp.val!=val){
                curr.next=temp;
                curr=curr.next;
            }
            temp=temp.next;
        }
        curr.next=null;
        return dummy.next;
    }
}