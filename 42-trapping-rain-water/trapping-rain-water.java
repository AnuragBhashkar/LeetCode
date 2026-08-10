class Solution {
    public int trap(int[] height) {
        int n=height.length,water=0;
        int[] pre=new int[n];
        pre[0]=height[0];
        for(int i=1;i<n;i++) pre[i]=Math.max(height[i],pre[i-1]);

        int[] suff=new int[n];
        suff[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--) suff[i]=Math.max(height[i],suff[i+1]);

        for(int i=0;i<n;i++){
            water+=Math.min(pre[i],suff[i])-height[i];
        }
        return water;
    }
}