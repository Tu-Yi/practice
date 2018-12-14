package com.company;

/**
 * 二叉树
 * @param <T>
 */
public class TreeNode<T> {
    private int index;
    private T data;
    private TreeNode leftChild;
    private TreeNode rightChild;
    public TreeNode(int index, T data) {
        this.index = index;
        this.data = data;
        this.leftChild = null;
        this.rightChild = null;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
