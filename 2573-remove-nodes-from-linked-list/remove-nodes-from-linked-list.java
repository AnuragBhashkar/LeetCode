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
    public ListNode reverse(ListNode head){
        ListNode curr=head,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode temp=head;
        int max=0;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(temp!=null){
            ListNode next=temp.next;
            if(temp.val>=max){
                max=temp.val;
                curr.next=temp;
                curr=curr.next;
                curr.next=null;
            }
            temp=next;
        }
        return reverse(dummy.next);
    }
}