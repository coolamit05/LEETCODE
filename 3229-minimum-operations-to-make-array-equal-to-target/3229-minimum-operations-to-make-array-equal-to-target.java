class Solution {
    public long minimumOperations(int[] nums, int[] target) {
        int n = nums.length;
        long totalOperations = 0;
        int currentSegmentDiff = 0;

        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = target[i] - nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (i == 0 || (diff[i - 1] > 0 && diff[i] > 0) || (diff[i - 1] < 0 && diff[i] < 0)) {
                int additionalOperations = Math.abs(diff[i]) - Math.abs(currentSegmentDiff);
                if (additionalOperations > 0) {
                    totalOperations += additionalOperations;
                }
                currentSegmentDiff = diff[i];
            } else {
                totalOperations += Math.abs(diff[i]);
                currentSegmentDiff = diff[i];
            }
        }

        return totalOperations;
    }
}