class Solution {
    public int captureForts(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == -1) {
                int count = 0;
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == 0) count++;
                    else {
                        
                        if (nums[j] == -nums[i]) {
                            max = Math.max(max, count);
                        }
                        break;
                    }
                }
            }
        }
        return max;
    }
}