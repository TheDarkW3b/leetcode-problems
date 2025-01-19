class Solution {
    public static int subarraySum(int[] nums) {
        int totalSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            int start = Math.max(0, i - nums[i]);

            for (int j = start; j <= i; j++) {
                sum += nums[j];
            }

            totalSum += sum;
        }

        return totalSum;
    }
}
