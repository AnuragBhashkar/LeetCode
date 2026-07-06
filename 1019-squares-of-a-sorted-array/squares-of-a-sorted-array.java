class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int i=0,j=n-1,a=j;
        while(i<=j){
            int leftSquare=nums[i]*nums[i];
            int rightSquare=nums[j]*nums[j];
            if(leftSquare>rightSquare){
                ans[a]=leftSquare;
                a--;
                i++;
            }
            else{
                ans[a]=rightSquare;
                a--;
                j--;
            }
        }
        return ans;
    }
}