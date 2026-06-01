class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int maxLen=0;
        int i=0,j=0;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            else{
                set.add(ch);
                maxLen=Math.max(j-i+1,maxLen);
                j++;
            }
        }
        return maxLen;
    }
}