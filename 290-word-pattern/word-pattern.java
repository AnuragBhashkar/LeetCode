class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map=new HashMap<>();

        String[] str=s.split(" ");
        if(pattern.length() != str.length) return false;

        for(int i=0;i<str.length;i++){
            char key=pattern.charAt(i);
            String val=str[i];
            if(map.containsKey(key)){
                if(!map.get(key).equals(val)) return false;
            }
            else if(map.containsValue(val)) return false;
            else map.put(key,val);
        }
        return true;
    }
}