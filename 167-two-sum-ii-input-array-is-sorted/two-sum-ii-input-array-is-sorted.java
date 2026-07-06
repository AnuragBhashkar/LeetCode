class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int i=0,j=nums.length-1;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==target){
                ans[0]=i+1;
                ans[1]=j+1;
            }
            if(sum>target) j--;
            else i++;
        }
        return ans;
    }
}