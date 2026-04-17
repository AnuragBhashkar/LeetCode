class Solution {
    public int[] getAverages(int[] nums, int k) {
        if(nums.length==1){
            if(k==0) return new int[]{nums[0]};
            else return new int[]{-1};
        }

        int[] result=new int[nums.length];
        Arrays.fill(result,-1);
        int windowSize=(2*k+1);
        if(windowSize > nums.length) return result;

        long sum=0;
        int j=k,a=0;
        while(a<windowSize){
            sum+=nums[a];
            a++;
        }
        int avg=(int)(sum/windowSize);
        result[j]=avg;

        int left=0,right=windowSize;
        while(right<nums.length){
            sum-=nums[left];
            sum+=nums[right];
            j++;
            avg=(int)(sum/windowSize);
            result[j]=avg;
            left++;
            right++;
        }
        return result;
    }
}