class Solution {
    public int findKthPositive(int[] arr, int k) {
        int number=1;
        int[] arr2=new int[2000];
        int i=0,j=0;
        while(j<arr2.length){
            if(i<arr.length && arr[i]==number) i++;
            else{
                arr2[j]=number;
                j++;
            }
            number++;
        }
        return arr2[k-1];
    }
}