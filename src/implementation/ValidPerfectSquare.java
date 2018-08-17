package implementation;

/**
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 *
 * 注意：不要使用任何内置的库函数，如  sqrt。
 *
 * 示例 1：
 *
 * 输入： 16
 *
 * 输出： True
 *
 *
 * 示例 2：
 *
 * 输入： 14
 *
 * 输出： False
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // 可能会溢出，所以需要用long来记录乘积的结果
            long product = (long) mid * (long) mid;
            if (product == num) {
                return true;
            }
            if (product < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
