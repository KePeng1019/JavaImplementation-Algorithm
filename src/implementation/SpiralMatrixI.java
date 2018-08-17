package implementation;

/**
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 *
 * 示例:
 *
 * 输入: 3
 * 输出:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 */
public class SpiralMatrixI {
    public int[][] generateMatrix(int n) {
        int x = 0;
        int y = 0;
        int index = 1;
        int[][] result = new int[n][n];
        while (x <= (n - 1) / 2 && y <= (n - 1) / 2) {
            for (int i = x; i < n - x; i++) {
                result[y][i] = index++;
            }

            for (int i = y + 1; i < n - y && n - y - 1 > y; i++) {
                result[i][n - x - 1] = index++;
            }

            for (int i = n - x - 2; i >= x; i--) {
                result[n - y - 1][i] = index++;
            }

            for (int i = n - y - 2; i > y && n - y - 2 > y; i--) {
                result[i][x] = index++;
            }
            x++;
            y++;
        }
        return result;
    }
}
