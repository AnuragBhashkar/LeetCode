class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int i=0,sum=0,count=0;
        int j=0;
        int zeroes=0;
        while(j<n){
            sum+=nums[j];
            while (i<j && sum>goal) {
                sum -= nums[i];
                if (nums[i] == 1) {
                    zeroes = 0;
                }
                i++;
            }
            while(nums[i]==0 && i<j){
                zeroes++;
                i++;
            }
            if(sum==goal) count+=1+zeroes;
            j++;
        }
        return count;
    }
}