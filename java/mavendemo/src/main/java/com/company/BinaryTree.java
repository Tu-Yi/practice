package com.company;

/**
 * 二叉树处理
 * @author yuankun
 */
public class BinaryTree {
    public TreeNode root = null;
    public BinaryTree() {
        root = new TreeNode<String>(1, "A");
    }
    public void createBinaryTree() {
        TreeNode nodeB = new TreeNode<String>(1, "B");
        TreeNode nodeC = new TreeNode<String>(1, "C");
        TreeNode nodeD = new TreeNode<String>(1, "D");
        TreeNode nodeE = new TreeNode<String>(1, "E");
        TreeNode nodeF = new TreeNode<String>(1, "F");
        TreeNode nodeG = new TreeNode<String>(1, "G");
        root.setLeftChild(nodeB);
        root.setRightChild(nodeC);
        nodeB.setLeftChild(nodeD);
        nodeB.setRightChild(nodeE);
        nodeC.setLeftChild(nodeF);
        nodeC.setRightChild(nodeG);
    }
    public int getHeight() {
        return getHeight(root);
    }
    public int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.getLeftChild());
        int rightHeight = getHeight(node.getRightChild());
        return leftHeight > rightHeight ? (leftHeight + 1) : (rightHeight + 1);
    }
    public int getSize() {
        return getSize(root);
    }
    public int getSize(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftSize = getSize(node.getLeftChild());
        int rightSize = getSize(node.getRightChild());
        return leftSize + rightSize + 1;
    }
    public void beforeOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getData() + " ");
        beforeOrder(node.getLeftChild());
        beforeOrder(node.getRightChild());
    }
    public void midOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        midOrder(node.getLeftChild());
        System.out.print(node.getData() + " ");
        midOrder(node.getRightChild());
    }
    public void afterOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        afterOrder(node.getLeftChild());
        afterOrder(node.getRightChild());
        System.out.print(node.getData() + " ");
    }
}
