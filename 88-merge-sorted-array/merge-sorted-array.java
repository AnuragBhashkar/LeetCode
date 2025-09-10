class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res=new int[nums1.length];
        int i=0,j=0,k=0;
        if(m==0){
            for(int a=0;a<n;a++){
                nums1[a]=nums2[a];
            }
            return;
        }
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                res[k++]=nums1[i++];
            }
            else{
                res[k++]=nums2[j++];
            }
        }

        while(i<m){
            res[k++]=nums1[i++];
        }

        while(j<nums2.length){
            res[k++]=nums2[j++];
        }

        for(i=0;i<nums1.length;i++){
            nums1[i]=res[i];
        }
    }
}