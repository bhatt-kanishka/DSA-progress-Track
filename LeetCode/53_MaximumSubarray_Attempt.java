class Solution {
    public int maxSubArray(int[] nums) {
        int start = 0;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            start += nums[i];

            if (start > max) {
                max = start;
            }

            // Learning note: reset only when start becomes negative.
            if (start < 0) {
                start = 0;
            }
        }

        return max;
    }
}

