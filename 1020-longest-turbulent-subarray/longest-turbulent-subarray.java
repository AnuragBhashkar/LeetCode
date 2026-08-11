class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n=arr.length;
        if(n==1) return 1;
        char[] comp=new char[n-1];
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]) comp[i]='<';
            else if(arr[i]>arr[i+1]) comp[i]='>';
            else comp[i]='=';
        }

        int ans=1,len=1;
        for(int i=0;i<n-1;i++){
            if(comp[i]=='=') len=1; // "< > =" --->>> 1 so we can reset;
            else if(i==0) len=2; // "comp=[>]" --->>> 2 because [9,4] is of len 2;
            else if(comp[i]!=comp[i-1]) len++; //if different operators then len++;
            else len=2; // "> >" --->>> 2 because [9.4.2] is of len 2;
            ans=Math.max(ans,len);
        }
        return ans;
    }
}