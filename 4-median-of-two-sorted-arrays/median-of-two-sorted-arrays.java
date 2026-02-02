class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length,n=nums2.length;
        double[] result=new double[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]) result[k++]=nums1[i++];
            else result[k++]=nums2[j++];
        }
        while(i<m) result[k++]=nums1[i++];
        while(j<n) result[k++]=nums2[j++];
        
        // double median=0;
        return (result.length%2!=0) ? result[result.length/2] : (result[result.length/2]+result[result.length/2-1])/2;   
    }
}