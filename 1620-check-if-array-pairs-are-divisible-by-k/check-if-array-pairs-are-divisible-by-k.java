class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] remFreq=new int[k];
        for (int num : arr) {
            int rem = (num % k + k) % k;  
            remFreq[rem]++;
        }

        if(remFreq[0]%2!=0) return false;

        for(int rem=1;rem<=k/2;rem++){
            int counterHalf=k-rem;
            if(remFreq[counterHalf]!=remFreq[rem]) return false;
        }
        return true;
    }
}