package implementation;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。
 *
 * 示例:
 *
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 * 进阶:
 *
 * 如果你已经完成了O(n * n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 */
public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        if (sum < s) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        int head = 0;
        int tail = 0;
        sum = 0;
        while (tail < nums.length) {
            sum += nums[tail];
            while (sum >= s) {
                if (tail - head + 1 < min) {
                    min = tail - head + 1;
                }
                sum -= nums[head];
                head++;
            }
            tail++;
        }
        return min;
    }
}
