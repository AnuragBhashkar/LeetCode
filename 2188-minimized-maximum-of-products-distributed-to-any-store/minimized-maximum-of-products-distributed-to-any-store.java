class Solution {
    public boolean isPossible(int[] arr,int n,int maxC){
        int store=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%maxC==0){
                store+=arr[i]/maxC;
            }    
            else{
                store+=arr[i]/maxC+1;
            }
        }
        if(store>n) return false;
        else return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int m=quantities.length;
        int low=1;
        int high=0;
        int minV=0;
        for(int i=0;i<m;i++){
            high=Math.max(quantities[i],high);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(quantities,n,mid)==true){
                minV=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return minV;
    }
}