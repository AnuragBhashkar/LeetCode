class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int d=m;
        if(m==0) {
                for(int j=0;j<n;j++){
                    nums1[j]=nums2[j];
                }
                return;
            }
        for(int i=0;i<n;i++){    
            nums1[d]=nums2[i];
            d++;
        }

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums1[i]<nums1[j]){
                    int temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
    }
}