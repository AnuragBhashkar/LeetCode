class Solution {
    public int characterReplacement(String s, int k) {
        int i=0,j=0,ans=0,mxFreq=0;
        int[] freq=new int[26];
        while(j<s.length()){
            freq[s.charAt(j)-'A']++;
            mxFreq=Math.max(mxFreq,freq[s.charAt(j)-'A']);
            if(j-i+1-mxFreq<=k){
                ans=Math.max(ans,j-i+1);
            }
            else{
                freq[s.charAt(i)-'A']--;
                i++;
            }
            j++;
        }
        return ans;
    }
}