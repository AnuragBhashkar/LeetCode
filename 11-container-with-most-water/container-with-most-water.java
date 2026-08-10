class Solution {
    public int maxArea(int[] height) {
        int maxA=0,area=0;
        int n=height.length;
        int i=0,j=n-1;
        while(i<j){
            int l=Math.min(height[i],height[j]);
            area=Math.max(area,l*(j-i));
            maxA=Math.max(area,maxA);
            if(height[i]<=height[j]) i++;
            else j--;
        }
        return maxA;
    }
}