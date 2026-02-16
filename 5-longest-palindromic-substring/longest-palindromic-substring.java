/*
Logic:  1. Generate substring
        2. Check whether it is palindrome or not
        3. If palindrome then check whether it is >maxLen or not
        4. If >maxLen then replace maxLen with the longest one
*/

class Solution {
    public boolean isPalindrome(String s,int left,int right){
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<=1) return s;

        int start=0,maxLen=1;

        for(int i=0;i<s.length();i++){
            for(int j=i;j<n;j++){
                if(j-i+1>maxLen && isPalindrome(s,i,j)){
                    start=i;
                    maxLen=j-i+1;
                }
            }
        }

        return s.substring(start,start+maxLen);
        
    }
}