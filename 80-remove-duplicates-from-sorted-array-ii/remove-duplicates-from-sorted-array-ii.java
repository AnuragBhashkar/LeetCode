class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int idx=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(i==0 || nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count<=2){
                ans[idx++]=nums[i];
            }
        }
        for (int i=0;i<idx;i++) {
            nums[i] = ans[i];
        }
        return idx;
    }
}