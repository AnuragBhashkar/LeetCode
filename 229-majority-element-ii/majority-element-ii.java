class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele:nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
            if(map.get(ele)==nums.length/3+1){
                list.add(ele);
            }
        }
        return list;
    }
}