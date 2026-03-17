class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int freq=0;
        int result=1;

        int[] prefixSum=new int[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
        }

        for(int i=0;i<nums.length;i++){
            freq=binarySearch(i,nums,k,prefixSum);
            result=Math.max(result,freq);
        }
        return result;
    }

    public int binarySearch(int targetIdx,int[] nums,int k,int[] prefixSum){
        int result=0;
        int lo=0, hi=targetIdx;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int countEle=(targetIdx-mid+1);
            int windowSum=countEle*nums[targetIdx];
            int currSum=prefixSum[targetIdx]-prefixSum[mid]+nums[mid];
            int operations=windowSum-currSum;
            if(operations>k) lo=mid+1;
            else{
                result=mid;
                hi=mid-1;
            }
        }
        return (targetIdx-result+1);
    }
}