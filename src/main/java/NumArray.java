class NumArray {

    private long[] sum;

    public NumArray(int[] nums) {
        sum = new long[nums.length];
        sum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) return (int)sum[right];

        return (int)(sum[right] - sum[left - 1]);
    }
}
