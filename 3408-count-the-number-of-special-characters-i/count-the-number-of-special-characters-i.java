class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> lower=new HashSet<>();
        Set<Character> upper=new HashSet<>();
        int count=0;
        for(char ch:word.toCharArray()){
            if(Character.isLowerCase(ch)) lower.add(ch);
            else upper.add(ch);
        }
        for(char ch ='a'; ch<='z';ch++){
            if(lower.contains(ch) && upper.contains(Character.toUpperCase(ch))) count++;
        }
        return count;
    }
}