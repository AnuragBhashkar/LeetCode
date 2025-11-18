class Solution {
    public int compress(char[] ch) {
        StringBuilder ans=new StringBuilder("");
        int i=0;
        int j=0;
        while(j<ch.length){
            if(ch[i]==ch[j]) j++;
            else{
                ans.append(ch[i]);
                if(j-i>1) ans.append(j-i);
                i=j;
            }
        }
        ans.append(ch[i]);
        if(j-i>1) ans.append(j-i);
        for(i=0;i<ans.length();i++){
            ch[i]=ans.charAt(i);
        }
        return ans.length();
    }
}