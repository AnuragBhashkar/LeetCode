class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++) set.add(nums[i]);
        int count=1,max=1;
        for(int num:set){
            if(!set.contains(num-1)){
                int curr=num;
                while(set.contains(curr+1)){
                    curr++;
                    count++;
                }
            }
            max=Math.max(max,count);
            count=1;
        }
        max=Math.max(max,count);
        return max;
    }
}