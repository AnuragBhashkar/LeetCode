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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode firstHalf=head;
        ListNode slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondHalf=slow.next;
        slow.next=null;

        firstHalf=sortList(firstHalf);
        secondHalf=sortList(secondHalf);
        ListNode ans=merge(firstHalf,secondHalf);
        return ans;
    }
    public ListNode merge(ListNode list1,ListNode list2){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                curr.next=list1;
                list1=list1.next;
            }
            else{
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }

        while(list1!=null){
            curr.next=list1;
            list1=list1.next;
            curr=curr.next;
        }
        while(list2!=null){
            curr.next=list2;
            list2=list2.next;
            curr=curr.next;
        }
        return dummy.next;
    }
}