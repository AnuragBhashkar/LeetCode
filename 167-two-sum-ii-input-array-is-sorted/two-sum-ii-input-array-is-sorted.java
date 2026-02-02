class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ans={-1,-1};
        int i=0,j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
            if(sum>target) j--;
            else i++;
        }
        return ans;
    }
}