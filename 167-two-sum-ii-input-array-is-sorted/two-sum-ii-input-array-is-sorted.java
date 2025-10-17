class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int index1=0;
        int index2=0;
        int sum=0;
        while(i<j){
            sum=numbers[i]+numbers[j];
            if(sum==target){
                index1=i+1;
                index2=j+1;
                break;
            }
            else if(sum>target) {
                j--;
                
            }
            else{
            
                i++;
            }
        }
        return new int[]{index1,index2};
    }
}