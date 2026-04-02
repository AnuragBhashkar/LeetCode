class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        int count=0;
        int windowSum=0;
        for(int i=0;i<k;i++){
            windowSum+=nums[i];
        }
        int i=0,j=k;
        int target=k*threshold;
        if(windowSum>=target) count++;
        while(j<nums.length){
            windowSum=windowSum-nums[i]+nums[j];
            if(windowSum>=target) count++;
            i++;
            j++;
        }
        return count;
    }
}