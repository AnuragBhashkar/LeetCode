class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0,j=nums.length-1,a=j;
        while(i<=j){
            int leftSquare=nums[i]*nums[i];
            int rightSquare=nums[j]*nums[j];

            if(leftSquare>rightSquare){
                ans[a--]=leftSquare;
                i++;
            }
            else{
                ans[a--]=rightSquare;
                j--;
            }
        }
        return ans;
    }
}