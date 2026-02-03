class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            arr[i]=(long)nums[i]+max;
        }
        
        long[] pre=new long[n];
        pre[0]=arr[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+arr[i];
        }
        return pre;
    }
}