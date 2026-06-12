class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen=0;
        int left=0,right=0;
        Map<Character,Integer> map=new HashMap<>();
        while(right<s.length()){
            char ch=s.charAt(right);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char ch2=s.charAt(left);
                map.put(ch2,map.get(ch2)-1);
                if(map.get(ch2)==0) map.remove(ch2);
                left++;
            }
            maxLen=Math.max(maxLen,right-left+1);
            right++;
        }
        return maxLen;
    }
}