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
    public ListNode modifiedList(int[] nums, ListNode head) {
        if(head==null || head.next==null) return head;
        Set<Integer> set=new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        ListNode temp=head;
        while(temp!=null){
            if(!set.contains(temp.val)){
                curr.next=temp;
                curr=curr.next;
            }
            temp=temp.next;
        }
        curr.next=null;
        return dummy.next;
    }
}