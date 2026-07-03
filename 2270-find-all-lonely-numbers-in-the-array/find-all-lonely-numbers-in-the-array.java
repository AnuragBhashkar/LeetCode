class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int n:nums) map.put(n,map.getOrDefault(n,0)+1);

        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]+1) || map.containsKey(nums[i]-1) || map.get(nums[i])>1) continue;
            else list.add(nums[i]);
        }
        return list;
    }
}