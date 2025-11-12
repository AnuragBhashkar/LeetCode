class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        else if(s.length()==0 || t.length()==0) return false;
        char[] a=s.toCharArray();
        Arrays.sort(a);
        char[] b=t.toCharArray();
        Arrays.sort(b);
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            if(a[i]!=b[i]){
                flag=false;
                break;
            } 
        }
        if(flag==false) return false;
        else return true;
    }
}