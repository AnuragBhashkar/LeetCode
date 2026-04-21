class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen=1;
        int maxFreq=0;
        int i=0,j=0;
        int[] freq=new int[26];
        while(j<s.length()){
            char right=s.charAt(j);
            freq[right-'A']++;
            maxFreq=Math.max(maxFreq,freq[right-'A']);
            if((j-i+1)-maxFreq>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}