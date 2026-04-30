class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int maxFreq=0;
        int maxLen=0;
        int i=0,j=0;
        Map<Character,Integer> map=new HashMap<>();
        while(j<n){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxFreq=Math.max(maxFreq,map.get(ch));
            while((j-i+1)-maxFreq>k){
                char left=s.charAt(i);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0) map.remove(left);
                i++;
            }
            maxLen=Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}