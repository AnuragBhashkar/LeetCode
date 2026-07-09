class Solution {
    public int countVowelSubstrings(String word) {
        return sub(word,5)-sub(word,4);
    }
    private int sub(String word, int k){
        Map<Character,Integer> map=new HashMap<>();
        int i=0,j=0;
        int ans=0;
        while(j<word.length()){
            char ch=word.charAt(j);
            if(!isVowel(ch)){
                map.clear();
                i=j+1;
                j++;
                continue;
            }

            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.size()>k && i<word.length()){
                char left=word.charAt(i);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0) map.remove(left);
                i++;
            }
            ans+=(j-i+1);
            j++;
        }
        return ans;
    }
    private boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') return true;
        return false;
    }
}