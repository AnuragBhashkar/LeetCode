class Solution {
    public int minSteps(String s, String t) {
        int count1=0,count2=0;
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)-1);
        }
        
        int count=0;
        for(int val:map.values()) count+=Math.abs(val);
        return count;
    }
}