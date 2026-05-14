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
    public ListNode reverseList(ListNode head){
        ListNode curr=head;
        ListNode prev=null, next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head==null || head.next==null || left==right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next=head;

        ListNode temp1=dummy;
        for (int i=1; i<left;i++) {
            temp1=temp1.next;
        }

        ListNode reverseNode=temp1.next;
        ListNode temp2=reverseNode;
        for (int i=left;i<right;i++) {
            temp2=temp2.next;
        }

        ListNode join=temp2.next;
        temp2.next=null;
        temp1.next=reverseList(reverseNode);
        reverseNode.next=join;

        return dummy.next;
    }
}