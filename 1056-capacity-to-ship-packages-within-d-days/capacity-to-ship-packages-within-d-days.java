class Solution {
    public static boolean isPossible(int[] arr,int days,int mid){
        int load=0;
        int D=1;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]<=mid){
                load+=arr[i];
            }
            else{
                load=arr[i];
                D++;
            } 
        }
        if(D>days) return false;
        else return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int max=0;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int low=max,high=sum,minC=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(weights,days,mid)==true){
                minC=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return minC;
    }
}