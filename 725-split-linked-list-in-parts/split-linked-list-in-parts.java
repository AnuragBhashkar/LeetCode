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
        ListNode curr=head;
        int len=0;
        while(curr!=null){
            len++;
            curr=curr.next;
        }

        int base=(len/k);
        int extra=(len%k); 

        curr=head;
        for(int i=0;i<k;i++){
            ans[i]=curr;

            int partSize=base+(i<extra?1:0);
            for(int j=1;j<partSize;j++){
                if (curr != null) curr = curr.next;
            }

            if(curr!=null){
                ListNode nextPart=curr.next;
                curr.next=null;
                curr=nextPart;
            }
        }
        return ans;
    }
}