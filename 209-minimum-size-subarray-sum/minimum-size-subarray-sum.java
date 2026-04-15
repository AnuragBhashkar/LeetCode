class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int minLen=Integer.MAX_VALUE;
        int currSum=0;
        for(int j=0;j<nums.length;j++){
            currSum+=nums[j];
            while(currSum>=target){
                minLen=Math.min(minLen,j-i+1);
                currSum-=nums[i];
                i++;
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}