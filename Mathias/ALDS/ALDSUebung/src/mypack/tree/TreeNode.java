package mypack.tree;

public class TreeNode {
    private char key;

    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(char key, TreeNode leftChild, TreeNode rightChild) {
        this.key = key;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public TreeNode() {
        this('a', null, null);
    }

    public TreeNode(char leafOnly) {
        this(leafOnly, null, null);
    }

    public char getKey() {
        return key;
    }

    public void setKey(char key) {
        this.key = key;
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
