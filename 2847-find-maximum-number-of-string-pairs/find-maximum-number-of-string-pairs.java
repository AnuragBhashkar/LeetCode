class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        Set<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            if(set.contains(reverse(words[i]))) count++;
            else set.add(words[i]);
        }
        return count;
    }
    public String reverse(String s){
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
}