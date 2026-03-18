class Solution {
    public int countNicePairs(int[] nums) {
        int n=nums.length;
        long count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            nums[i]=nums[i]-rev(nums[i]);  //see notebook for the reason
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int freq : map.values()) {
            count = (count +(long)freq * (freq - 1) / 2) % 1000000007;
        }
        return (int)count;
    }
    public int rev(int n){
        int reverse=0;
        while(n>0){
            reverse=reverse*10+n%10;
            n/=10;
        }
        return reverse;
    }
}