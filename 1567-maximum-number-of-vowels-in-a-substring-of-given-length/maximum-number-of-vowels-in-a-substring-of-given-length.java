class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int maxCount=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') count++;
        }
        maxCount=Math.max(maxCount,count);
        int i=0,j=k;
        while(j<s.length()){
            char ch1=s.charAt(i);
            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') count--;
            char ch2=s.charAt(j);
            if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u') count++;
            maxCount=Math.max(maxCount,count);
            i++;
            j++;
        }
        return maxCount;
    }
}