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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode even=new ListNode(0);
        ListNode curr1=even;
        ListNode odd=new ListNode(0);
        ListNode curr2=odd;
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        for(int i=0;i<len;i++){
            if(i%2==0){
                curr1.next=temp;
                curr1=curr1.next;
            }
            else{
                curr2.next=temp;
                curr2=curr2.next;
            }
            temp=temp.next;
        }
        curr2.next=null;
        curr1.next=odd.next;
        return even.next;
    }
}