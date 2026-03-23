class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum=0;
        for(int i=0;i<nums.length;i++){
            elementSum+=nums[i];
            digitSum+=sumOfDigits(nums[i]);
        }
        return Math.abs(elementSum-digitSum);
    }
    public int sumOfDigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}