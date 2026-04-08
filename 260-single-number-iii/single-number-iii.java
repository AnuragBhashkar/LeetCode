class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int[] ans=new int[2];
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums) map.put(num,map.getOrDefault(num,0)+1);
        for(int num:nums){
            int freq=map.get(num);
            if(freq==1) list.add(num);
        }
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}