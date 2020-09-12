package cn.lbl.face.tree;

public class TreeTraversal {

    public static void preOrder(TreeNode root){
        if (root==null){
            return;
        }
        System.out.print(root.getValue());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    public static void inOrder(TreeNode root){
        if (root==null){
            return;
        }
        inOrder(root.getLeft());
        System.out.print(root.getValue());
        inOrder(root.getRight());
    }
    public static void postOrder(TreeNode root){
        if (root==null){
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.print(root.getValue());
    }

    public static void main(String[] args) {
        TreeCreator treeCreator = new TreeCreator();
        TreeNode treeNode = treeCreator.treeCreator();
        preOrder(treeNode);
        System.out.println();
        inOrder(treeNode);
        System.out.println();
        postOrder(treeNode);
    }
}
