class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";

        Map<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        int i=0,j=0;
        int minWindowSize=Integer.MAX_VALUE;
        int requiredCount=t.length();
        int start_i=0;

        while(j<s.length()){
            char ch = s.charAt(j);
            if (map.containsKey(ch) && map.get(ch) > 0) requiredCount--;
            map.put(ch, map.getOrDefault(ch, 0) - 1);
            while (requiredCount == 0) {
                int currWindowSize = (j-i+1);
                if (minWindowSize > currWindowSize) {
                    minWindowSize = currWindowSize;
                    start_i = i;
                }
                char startChar = s.charAt(i);
                map.put(startChar, map.getOrDefault(startChar, 0) + 1);
                if (map.containsKey(startChar) && map.get(startChar) > 0) {
                    requiredCount++;
                }
                i++;
            }
            j++;
        }
        return minWindowSize==Integer.MAX_VALUE? "" :s.substring(start_i,start_i+minWindowSize);
    }
}