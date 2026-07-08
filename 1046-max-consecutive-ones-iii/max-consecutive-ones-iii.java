class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxCount=0,countZero=0,left=0,right=0;
        while(right<nums.length){
            if(nums[right]==0) countZero++;
            if(countZero==k) maxCount=Math.max(maxCount,right-left+1);
            while(countZero>k){
                if(nums[left]==0) countZero--;
                left++;
            }
            maxCount=Math.max(maxCount,right-left+1);
            right++;
        }
        return maxCount;
    }
}