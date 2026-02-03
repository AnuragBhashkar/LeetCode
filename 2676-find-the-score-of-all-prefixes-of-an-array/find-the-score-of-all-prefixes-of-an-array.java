class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            nums[i]+=max;
        }
        
        long[] pre=new long[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        return pre;
    }
}