class Solution {
    public int minSteps(String s, String t) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()) freq[ch-'a']++;
        for(char ch:t.toCharArray()) freq[ch-'a']--;
        int count=0;
        for(int i=0;i<26;i++){
            if(freq[i]>0) count+=freq[i];
        }
        return count;
    }
}