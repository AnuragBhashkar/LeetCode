class Solution {
    public int countNicePairs(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int mod=1000000007;
        long count=0;
        for(int num:nums)
        {
            int key=num-rev(num);
            int freq=map.getOrDefault(key,0);
            count=(count+freq)%mod;
            map.put(key,freq+1);
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