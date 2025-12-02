class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int max=0,sum=0;
        for(int i=0;i<weights.length;i++){
            max=Math.max(max,weights[i]);
            sum+=weights[i];
        }
        int low=max,high=sum,minC=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(weights,mid,days)==true){
                high=mid-1;
                minC=mid;
            }
            else low=mid+1;
        }
        return minC;
    }

    public static boolean isPossible(int[] arr,int minC,int days){
        int load=0,D=1;
        for(int i=0;i<arr.length;i++){
            if(load+arr[i]<=minC){
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
}