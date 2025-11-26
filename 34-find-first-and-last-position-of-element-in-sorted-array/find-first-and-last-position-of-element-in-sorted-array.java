class Solution {
    public int[] searchRange(int[] arr, int target) {
        int fp=-1;
        int lp=-1;
        int low=0;
        int high=arr.length-1;
        //first occurence:---
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<target) low=mid+1;
            else if(arr[mid]>target) high=mid-1;
            else if(arr[mid]==target){
                if(mid>0 && arr[mid]==arr[mid-1]){
                    high=mid-1;
                }
                else{
                    fp=mid;
                    break;
                }
            }
        } 
        //last occurences:--
        low=0;
        high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<target) low=mid+1;
            else if(arr[mid]>target) high=mid-1;
            else if(arr[mid]==target){
                if(mid+1<arr.length && arr[mid]==arr[mid+1]){
                    low=mid+1;
                }
                else{
                    lp=mid;
                    break;
                }
            }
        } 

        return new int[]{fp,lp};
    }
}