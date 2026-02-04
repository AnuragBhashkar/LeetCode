class Solution {
    public int binarySearch(int[] nums,int value){
        int lo=0,hi=nums.length-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]>value) hi=mid-1;
            else {
                lo=mid+1;
            }
        }
        return lo;
    }
    public int[] answerQueries(int[] nums, int[] queries) {

        //1). sort
        Arrays.sort(nums);

        //2). prefix sum
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        int[] ans=new int[queries.length];

        //3). bs
        for(int i=0;i<queries.length;i++){
            ans[i]=binarySearch(nums,queries[i]);
        }

        return ans;
    }
}