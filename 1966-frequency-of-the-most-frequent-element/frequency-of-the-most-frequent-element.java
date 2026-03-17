class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int result = 0;
        int l = 0;
        long currSum = 0;
        for (int r = 0; r < nums.length; r++) {
            currSum += nums[r];
            while ((long)nums[r] * (r - l + 1) - currSum > k) {
                currSum -= nums[l];
                l++;
            }
            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}