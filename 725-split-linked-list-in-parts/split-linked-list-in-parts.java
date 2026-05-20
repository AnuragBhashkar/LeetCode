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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans=new ListNode[k];
        int idx=0;

        int n=lengthOfLL(head);
        int size=n/k;
        int extra=n%k;
        int len=1;
        ListNode temp=head;
        while(temp!=null){
            int s=size;
            if(extra>0) s++;
            if(len==1) ans[idx++]=temp;
            if(len==s){
                ListNode nextPart=temp.next;
                temp.next=null;
                temp=nextPart;
                extra--;
                len=1;
            }
            else{
                len++;
                temp=temp.next;
            }
        }
        return ans;
    }
    public int lengthOfLL(ListNode head){
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
}