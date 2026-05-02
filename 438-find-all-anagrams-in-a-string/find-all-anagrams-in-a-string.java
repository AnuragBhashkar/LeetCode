class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        List<Integer> ans=new ArrayList<>();
        if (s.length()<p.length()) return ans;
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<p.length();i++){
            freq1[p.charAt(i)-'a']++;
        }
        for(int i=0;i<p.length();i++){
            freq2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)) ans.add(0);
        int i=1,j=p.length();
        while(j<n){
            freq2[s.charAt(i-1)-'a']--;
            freq2[s.charAt(j)-'a']++;
            if(Arrays.equals(freq1,freq2)) ans.add(i);
            i++;
            j++;
        }
        return ans;
    }
}