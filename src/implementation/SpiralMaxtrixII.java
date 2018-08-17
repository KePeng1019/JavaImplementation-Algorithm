package implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 *
 * 示例 1:
 *
 * 输入:
 * [
 *  [ 1, 2, 3 ],
 *  [ 4, 5, 6 ],
 *  [ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 * 示例 2:
 *
 * 输入:
 * [
 *   [1, 2, 3, 4],
 *   [5, 6, 7, 8],
 *   [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 */
public class SpiralMaxtrixII {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (null == matrix || matrix.length == 0) {
            return new ArrayList<>();
        }
        int x = 0;
        int y = 0;
        int w = matrix[0].length;
        int h = matrix.length;
        List<Integer> result = new ArrayList<>(w * h);
        while (x <= (w - 1) / 2 && y <= (h - 1) / 2) {
            for (int i = x; i < w - x; i++) {
                result.add(matrix[y][i]);
            }

            for (int i = y + 1; i < h - y; i++) {
                result.add(matrix[i][w - x - 1]);
            }

            for (int i = w - x - 2; i >= x && h - y - 1 > y; i--) {
                result.add(matrix[h - y - 1][i]);
            }

            for (int i = h - y - 2; i > y && w - x - 1 > x; i--) {
                result.add(matrix[i][x]);
            }
            x++;
            y++;
        }
        return result;
    }
}
