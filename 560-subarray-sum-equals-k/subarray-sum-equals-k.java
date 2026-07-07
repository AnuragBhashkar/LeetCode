class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        for(int i=1;i<n;i++) nums[i]+=nums[i-1];
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(num==k) count++;
            if(map.containsKey(num-k)) count+=map.get(num-k);
            if(map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }
        return count;
    }
}