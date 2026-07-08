class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return sub(nums,k)-sub(nums,k-1);
    }
    private int sub(int[] nums,int k){
        int i=0,j=0;
        int count=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(j<nums.length){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(map.size()>k){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0) map.remove(nums[i]);
                i++;
            }
            count+=(j-i+1);
            j++;
        }
        return count;
    }
}