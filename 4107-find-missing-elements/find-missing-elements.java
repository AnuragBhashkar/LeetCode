class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int min=nums[0],max=nums[0];
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            max=Math.max(max,nums[i]);
            set.add(nums[i]);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}