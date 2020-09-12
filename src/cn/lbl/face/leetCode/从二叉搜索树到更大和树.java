package cn.lbl.face.leetCode;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class 从二叉搜索树到更大和树 {
    static int sum = 0;

    public static TreeNode bstToGst(TreeNode root) {
        if (root != null) {
            bstToGst(root.right);
            sum = sum + root.val;
            root.val = sum;
            bstToGst(root.left);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode0 = new TreeNode(0);
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        TreeNode treeNode8 = new TreeNode(8);
        treeNode4.left = treeNode1;
        treeNode4.right = treeNode6;
        treeNode1.left = treeNode0;
        treeNode1.right = treeNode2;
        treeNode6.left = treeNode5;
        treeNode6.right = treeNode7;
        treeNode2.right = treeNode3;
        treeNode7.right = treeNode8;
        bstToGst(treeNode4);
    }
}
