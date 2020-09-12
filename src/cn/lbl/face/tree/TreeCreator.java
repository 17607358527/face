package cn.lbl.face.tree;

public class TreeCreator {

    public TreeNode treeCreator(){
        TreeNode root = new TreeNode('A');
        root.setLeft(new TreeNode('B'));
        root.setRight(new TreeNode('C'));
        root.getLeft().setRight(new TreeNode('E'));
        root.getLeft().setLeft(new TreeNode('D'));
        root.getLeft().getRight().setLeft(new TreeNode('G'));
        root.getRight().setRight(new TreeNode('F'));
        return root;
    }
}
