class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int currSum=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(currSum,1);
        for(int i=0;i<nums.length;i++){
            currSum+=(nums[i]%2);
            if(map.containsKey(currSum-k)){
                count+=map.get(currSum-k);
            }
            map.put(currSum,map.getOrDefault(currSum,0)+1);
        }
        
        return count;
    }
}