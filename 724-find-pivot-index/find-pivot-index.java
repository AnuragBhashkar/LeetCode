class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sumL=0,sumR=0;
            for(int j=0;j<i;j++){
                sumL+=nums[j];
            }
            for(int j=i+1;j<n;j++){
                sumR+=nums[j];
            }
            if(sumL==sumR) return i;
        }
        return -1;
    }
}