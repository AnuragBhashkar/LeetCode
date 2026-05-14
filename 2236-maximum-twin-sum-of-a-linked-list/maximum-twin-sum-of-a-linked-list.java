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
    public int pairSum(ListNode head) {
        if(head.next.next==null) return head.val+head.next.val;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode firstHalf=head;

        ListNode curr=slow,prev=null,next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode secondHalf=prev;

        int maxSum=Integer.MIN_VALUE;
        ListNode temp=head;
        while(temp!=slow){
            int sum=(firstHalf.val+secondHalf.val);
            maxSum=Math.max(maxSum,sum);
            firstHalf=firstHalf.next;
            secondHalf=secondHalf.next;
            temp=temp.next;
        }
        return maxSum;
    }
}