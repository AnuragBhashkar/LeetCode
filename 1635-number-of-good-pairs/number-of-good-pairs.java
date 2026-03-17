class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            int freq=map.getOrDefault(ele,0);
            count+=freq;
            map.put(ele,freq+1);
        }
        return count;
    }
}