class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans=0;
        int lastMin=-1,lastMax=-1,left=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minK || nums[i]>maxK) left=i;
            if(nums[i]==minK) lastMin=i;
            if(nums[i]==maxK) lastMax=i;

            int count=Math.min(lastMin,lastMax)-left;
            if(count>0) ans+=count;
        }
        return ans;
    }
}