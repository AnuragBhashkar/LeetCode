class Solution {
    List<List<Integer>> arr=new ArrayList<>();;
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        helper(0,nums,ans);
        return arr;
    }
    public void helper(int i,int[] nums,ArrayList<Integer> ans){
        if(i==nums.length){
            arr.add(new ArrayList<>(ans));
            return;
        }
        helper(i+1,nums,ans);//not take
        ans.add(nums[i]);
        helper(i+1,nums,ans);//take
        ans.remove(ans.size()-1);
    }
}