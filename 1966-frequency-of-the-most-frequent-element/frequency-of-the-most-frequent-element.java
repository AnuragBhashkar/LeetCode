class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int result=0;
        int l=0;
        long currSum=0;
        for(int r=0;r<nums.length;r++){
            long target=nums[r];
            currSum+=nums[r];
            if((r-l+1)*target-currSum>k){
                currSum-=nums[l];
                l++;
            }
            result=Math.max(result,(r-l+1));
        }
        return result;
    }
}