class Solution {
    public long countOfSubstrings(String s, int k) {
        long result=0;
        int consonants=0;
        int n=s.length();
        
        int[] nextCons = new int[n];
        int lastConsIdx = n;
        for (int i = n - 1; i >= 0; i--) {
            nextCons[i] = lastConsIdx;
            if (!isVowel(s.charAt(i))) {
                lastConsIdx = i;
            }
        }

        Map<Character,Integer> map=new HashMap<>();
        int i=0,j=0;
        while(j<n){
            char ch=s.charAt(j);
            if(isVowel(ch)){
                map.put(ch,map.getOrDefault(ch,0)+1);
            }
            else consonants++;
            while(consonants>k){
                if(isVowel(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0) map.remove(s.charAt(i));
                }
                else{
                    consonants--;
                }
                i++;
            }
            while (i < n && map.size() == 5 && consonants == k) {
                int idx = nextCons[j];
                result+=(idx - j);
                char ci=s.charAt(i);
                if (isVowel(ci)) {
                    map.put(ci, map.get(ci) - 1);
                    if (map.get(ci) == 0) map.remove(ci);
                } else {
                    consonants--;
                }
                i++;
            }
            j++;
        }
        return result;
    }

    private boolean isVowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
}