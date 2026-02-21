class Solution {
    public String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) return "";
        StringBuilder sb=new StringBuilder(str[0]);
        for(String s:str){
            int i;
            int min=Math.min(s.length(),sb.length());
            for(i=0;i<min;i++){
                if(sb.charAt(i)!=s.charAt(i)) break;
            }
            sb.setLength(0);
            sb.append(s.substring(0,i));
        }
        return sb.toString();
    }
}