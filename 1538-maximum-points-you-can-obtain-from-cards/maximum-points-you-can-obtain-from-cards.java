class Solution {
    public int maxScore(int[] card, int k) {
        int ans=0;
        int n=card.length;
        int lSum=0,rSum=0;
        int maxSum=0;
        for(int i=0;i<k;i++){
            lSum+=card[i];
        }
        maxSum=lSum;
        for(int i=k-1;i>=0;i--){
            lSum-=card[i];
            rSum+=card[n-1];
            n--;
            maxSum=Math.max(maxSum,lSum+rSum);
        }
        return maxSum;
    }
}