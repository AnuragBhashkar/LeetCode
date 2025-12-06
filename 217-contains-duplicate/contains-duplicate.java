class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> ans=new HashSet<>();
        for(int ele:nums){
            if(ans.contains(ele)) return true;
            ans.add(ele);
        }
        return false;
    }
}