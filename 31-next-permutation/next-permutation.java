class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int gola_idx=-1;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                gola_idx=i-1;
                break;
            }
        }

        if(gola_idx!=-1){
            int swap_idx=gola_idx;
            for(int i=n-1;i>=gola_idx+1;i--){
                if(nums[i]>nums[gola_idx]){
                    swap_idx=i;
                    break;
                }
            }
            swap(nums,gola_idx,swap_idx);
        }
        
        reverse(nums,gola_idx+1,n-1);
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    public void reverse(int[] nums, int i, int j){
        while(i<=j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}