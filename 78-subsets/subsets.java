class Solution {
    List<List<Integer>> arr=new ArrayList<>();;
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        helper(0,nums,ans);
        return arr;
    }
    public void helper(int i,int[] nums,ArrayList<Integer> ans){
        if(i==nums.length){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
            }  
            arr.add(list);
            return;
        }
        helper(i+1,nums,ans);//not take
        ans.add(nums[i]);
        helper(i+1,nums,ans);//take
        ans.remove(ans.size()-1);
    }
}