class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char ch=magazine.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=ransomNote.length();
        for(int i=0;i<ransomNote.length();i++){
            char ch=ransomNote.charAt(i);
            if(map.containsKey(ch)){
                count--;
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0) map.remove(ch);
            }
        }
        if(count==0) return true;
        return false;
    }
}