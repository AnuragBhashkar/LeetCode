class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        Map<Character,Integer> map=new HashMap<>();
        for(char ch:t.toCharArray()) map.put(ch,map.getOrDefault(ch,0)+1);

        int i=0,j=0,start=0;
        int count=t.length();
        int minLen=Integer.MAX_VALUE;
        while(j<s.length()){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                if(map.get(ch)>0) count--;
                map.put(ch,map.get(ch)-1);
            }
            while(count==0){
                if(j-i+1<minLen){
                    minLen=(j-i+1);
                    start=i;
                }

                char left=s.charAt(i);
                if(map.containsKey(left)){
                    map.put(left,map.get(left)+1);
                    if(map.get(left)>0) count++;
                }
                i++;
            }
            j++;
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}