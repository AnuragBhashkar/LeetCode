class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int i=0,j=0,result=0;
        int odd=0,count=0;
        while(j<nums.length){
            if(nums[j]%2!=0){
                odd++;
                count=0;
            }
            while(odd==k){
                count++;
                if(i<nums.length && nums[i]%2==1) odd--;
                i++;
            }
            result+=count;
            j++;
        }
        return result;
    }
}