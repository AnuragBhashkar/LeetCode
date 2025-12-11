class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int len=nums.length;
        int max=1,ans=-1;
        for(int i=0;i<len;i++){
            max=Math.max(max,nums[i]);
        }
        int low=1,high=max;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sum=0;
            for(int i=0;i<len;i++){
                if(nums[i]%mid==0) sum+=nums[i]/mid;
                else sum+=nums[i]/mid+1;
            }
            if(sum<=threshold){
                high=mid-1;
                ans=mid;
            } 
            else low=mid+1;
        }
        return ans;
    }
}