class Solution {
    public int bestClosingTime(String s) {
        int n=s.length();
        //Step-1(prefix arrayfor 'N'):--
        int[] prefix=new int[n+1];
        for(int i=1;i<=n;i++){
            prefix[i]+=prefix[i-1];
            if(s.charAt(i-1)=='N') prefix[i]+=1;
        }

        //Step-2(Suffix array for 'Y'):--
        int[] suffix=new int[n+1];
        for(int i=n-1;i>=0;i--){
            suffix[i]+=suffix[i+1];
            if(s.charAt(i)=='Y') suffix[i]+=1;
        }

        //Step-3(Add both):--
        int[] penalty=new int[n+1];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n+1;i++){
            penalty[i]=prefix[i]+suffix[i];
            min=Math.min(min,penalty[i]);
        }

        //First Min:--
        for(int i=0;i<n+1;i++){
            if(penalty[i]==min) return i;
        }
        return -1;
    }
}