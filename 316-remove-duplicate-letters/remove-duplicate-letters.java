class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        int[] lastIdx=new int[26];
        for(int i=0;i<n;i++){
            lastIdx[s.charAt(i)-'a']=i;
        }

        boolean[] seen=new boolean[26];
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int idx=ch-'a';
            if(seen[ch-'a']) continue;
            while(ans.length()>0 && ch<ans.charAt(ans.length()-1) && lastIdx[ans.charAt(ans.length()-1)-'a']>i){
                seen[ans.charAt(ans.length()-1)-'a'] = false;
                ans.deleteCharAt(ans.length() - 1);
            }
            ans.append(ch);
            seen[idx]=true;
        }
        return ans.toString();
    }
}