class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        boolean flag=false;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<target) low=mid+1;
            else if(nums[mid]>target) high=mid-1;
            else if(nums[mid]==target){
                target=mid;
                flag=true;
                break;
            }   
        }
        if(flag) return target;
        else return -1;
    }
}