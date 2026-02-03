class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        for(int i=0;i<n;i++){
            int sumL=0;
            if(i>0) sumL=nums[i-1];

            int sumR=0;
            sumR=nums[n-1]-nums[i];

            if(sumL == sumR) return i;
        }
        return -1;
    }
}