class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        Set<Integer> set=new HashSet<>();
        for(int val:map.values()){
            if(set.contains(val)) return false;
            set.add(val);
        }
        return true;
    }
}