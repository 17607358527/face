package cn.lbl.face.tree;

public class TreeNode {
    private final char value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(char value) {
        this.value = value;
        left=null;
        right=null;
    }

    public char getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
