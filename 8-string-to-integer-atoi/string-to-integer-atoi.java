class Solution {
    public int myAtoi(String s) {
        s=s.stripLeading(); //faster than s.trim()
        int sign=1,i=0;
        long ans=0;

        if(s.isEmpty()) return 0;
        if(s.charAt(0)=='-'){
            sign=-1;
            i++;
        }
        else if(s.charAt(0)=='+') i++;
        while(i<s.length()){
            char ch=s.charAt(i);
            if(!Character.isDigit(ch)) break;
            ans=ans*10+(ch-'0');
            if (Integer.MAX_VALUE<sign*ans) return Integer.MAX_VALUE;
            if (Integer.MIN_VALUE>sign*ans) return Integer.MIN_VALUE;
            i++;
        }

        return (int)(ans*sign);
    }
}