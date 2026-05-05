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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }

        ListNode font=head;
        for(int i=1;i<k;i++) font=font.next;
        ListNode back=head;
        for(int i=1;i<len-k+1;i++) back=back.next;

        int tmp=font.val;
        font.val=back.val;
        back.val=tmp;
        return head;
    }
}