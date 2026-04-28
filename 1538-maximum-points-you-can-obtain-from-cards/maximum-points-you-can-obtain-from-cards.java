class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int n = cardPoints.length; 
       int currentSum = 0;

       for (int i = 0; i < k; i++) {
            currentSum += cardPoints[i];
       }

       int maxSum = currentSum;
       int leftIdx = k - 1;
       int rightIdx = n - 1;

       while (leftIdx >= 0) {
            currentSum -= cardPoints[leftIdx];
            currentSum += cardPoints[rightIdx];

            maxSum = Math.max(maxSum, currentSum);

            leftIdx--;
            rightIdx--;
       }

       return maxSum;
    }
}