class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] ch=new int[128];
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(ch[ch1]==0){
                ch[ch1]=ch2;
            }
            else{
                if(ch[ch1]!=ch2) return false;
            }
        }
        for(int i=0;i<ch.length;i++){
            ch[i]=0;
        }
        for(int i=0;i<s.length();i++){
            char ch1=t.charAt(i);
            char ch2=s.charAt(i);
            if(ch[ch1]==0){
                ch[ch1]=ch2;
            }
            else{
                if(ch[ch1]!=ch2) return false;
            }
        }
        return true;
    }
}