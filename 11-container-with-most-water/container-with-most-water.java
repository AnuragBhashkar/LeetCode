class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1,maxA=0,area=0;
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