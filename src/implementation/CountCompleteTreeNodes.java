package implementation;


// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

/**
 * 给出一个完全二叉树，求出该树的节点个数。
 * <p>
 * 说明：
 * <p>
 * 完全二叉树的定义如下：在完全二叉树中，除了最底层节点可能没填满外，其余每层节点数都达到最大值，并且最下面一层的节点都集中在该层最左边的若干位置。若最底层为第 h 层，则该层包含 1~ 2h 个节点。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * 1
 * / \
 * 2   3
 * / \  /
 * 4  5 6
 * <p>
 * 输出: 6
 */

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int lDeepth = deepth(root.left);
        int rDeepth = deepth(root.right);
        if (lDeepth == rDeepth) {
            return (1 << lDeepth) + countNodes(root.right);
        } else {
            return (1 << rDeepth) + countNodes(root.left);
        }
    }

    private int deepth(TreeNode root) {
        int deepth = 0;
        while (null != root) {
            deepth++;
            root = root.left;
        }
        return deepth;
    }
}
