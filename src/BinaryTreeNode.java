/**
 * Created by yichunli on 2017/7/4.
 */
public class BinaryTreeNode {
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(){

    }

    public BinaryTreeNode(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }
}
