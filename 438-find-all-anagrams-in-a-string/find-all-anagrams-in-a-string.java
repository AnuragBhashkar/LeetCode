class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        if(s.length()<p.length()) return list;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(char ch:p.toCharArray()){
            freq1[ch-'a']++;
        }

        for(int i=0;i<p.length();i++){
            freq2[s.charAt(i)-'a']++;
        }
        boolean flag=true;
        for(int i=0;i<26;i++){
            if(freq1[i]!=freq2[i]){
                flag=false;
                break;
            }
        }
        if(flag) list.add(0);
        int i=1,j=p.length();
        while(j<s.length()){
            freq2[s.charAt(i-1)-'a']--;
            freq2[s.charAt(j)-'a']++;
            flag=true;
            for(int k=0;k<26;k++){
                if(freq1[k]!=freq2[k]){
                    flag=false;
                    break;
                }
            }
            if(flag) list.add(i);
            i++;
            j++;
        }
        return list;
    }
}