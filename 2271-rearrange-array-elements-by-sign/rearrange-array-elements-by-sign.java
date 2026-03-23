class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] pos=new int[nums.length/2];
        int p=0;
        int[] neg=new int[nums.length/2];
        int n=0;
        for(int ele:nums){
            if(ele>=0){
                pos[p++]=ele;
            }
            else neg[n++]=ele;
        }
        p=0;
        n=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=pos[p++];
            }
            else{
                nums[i]=neg[n++];
            }
        }
        return nums;
    }
}