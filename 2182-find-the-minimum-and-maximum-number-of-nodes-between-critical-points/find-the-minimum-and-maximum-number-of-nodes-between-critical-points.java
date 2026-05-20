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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return new int[]{-1,-1};
        ListNode left=head,mid=head.next,right=head.next.next;
        int first=-1,last=-1;
        int prevCritical=-1;
        int idx=1;
        int minDistance = Integer.MAX_VALUE;
        int mmaxDistance = Integer.MIN_VALUE;
        while(right!=null){
            if((mid.val<left.val && mid.val<right.val) || (mid.val>left.val && mid.val>right.val)){
                if(first==-1){
                    first=idx;
                }
                else{
                    minDistance=Math.min(minDistance,idx-prevCritical);
                }
                prevCritical=idx;
                last=idx;
            }
            if(right.next==null) break;
            left=left.next;
            mid=mid.next;
            right=right.next;
            idx++;
        }
        if (first==-1 || first==last) return new int[]{-1,-1};

        int maxDistance=(last-first);
        return new int[]{minDistance,maxDistance};
    }
}