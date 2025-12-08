class Solution {
    static ArrayList<String> ans;
    public List<String> generateParenthesis(int n) {
        ans=new ArrayList<>();
        generate(0,0,"",n);
        return ans;
    }
    public void generate(int open,int close,String s,int n){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n) generate(open+1,close,s+'(',n);
        if(close<open) generate(open,close+1,s+')',n);
    }
}