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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newL1=reverse(l1);
        ListNode newL2=reverse(l2);
        ListNode dummy=new ListNode(0);
        ListNode temp=dummy;
        int carry=0;
        while(newL1!=null || newL2!=null || carry!=0){
            int sum=carry;
            if(newL1!=null){
                sum+=newL1.val;
                newL1=newL1.next;
            }
            if(newL2!=null){
                sum+=newL2.val;
                newL2=newL2.next;
            }
            temp.next=new ListNode(sum%10);
            carry=sum/10;
            temp=temp.next;
        }
        dummy.next=reverse(dummy.next);
        return dummy.next;
    }
}