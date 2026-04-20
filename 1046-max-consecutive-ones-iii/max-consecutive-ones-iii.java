class Solution {
    public int longestOnes(int[] nums, int k) {
        int countZero=0;
        int maxCount=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0) countZero++;
            if(countZero==k) maxCount=Math.max(maxCount,right-left+1);
            while(countZero>k){
                if(nums[left]==0) countZero--;
                left++;
            }
            maxCount=Math.max(maxCount,right-left+1);
        }
        return maxCount;
    }
}