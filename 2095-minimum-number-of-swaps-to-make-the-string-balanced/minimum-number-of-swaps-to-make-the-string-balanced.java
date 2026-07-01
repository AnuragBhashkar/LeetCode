class Solution {
    public int minSwaps(String s) {
        int open=0,unmatched=0;
        for(char ch:s.toCharArray()){
            if(ch=='[') open++;
            else{
                if(open>0) open--;
                else unmatched++;
            }
        }
        return (unmatched+1)/2;
    }
}