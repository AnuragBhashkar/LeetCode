class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean[] visited=new boolean[nums.length+1];
        for(int num:nums){
            if (num > 0 && num <= nums.length) {
                visited[num] = true;
            }
        }
        for(int i=1;i<=nums.length;i++){
            if(!visited[i]) return i;
        }
        return nums.length+1;
    }
}