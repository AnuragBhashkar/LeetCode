class Solution {
    public int compress(char[] ch) {
        String ans="";
        int i=0;
        int j=0;
        while(j<ch.length){
            if(ch[i]==ch[j]) j++;
            else{
                ans+=ch[i];
                if(j-i>1) ans+=(j-i);
                i=j;
            }
        }
        ans+=ch[i];
        if(j-i>1) ans+=(j-i);
        for(int k=0;k<ans.length();k++){
            ch[k]=ans.charAt(k);
        }
        return ans.length();
    }
}