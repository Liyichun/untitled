import java.util.Stack;

/**
 * Created by yichunli on 2017/7/6.
 */
public class SumOfPathInBinaryTree {

    private void findPath(BinaryTreeNode root, int sum, Stack<Integer> stack, int currentSum){
        if(root == null)
            return;
        currentSum += root.value;
        stack.push(root.value);
        if(root.left == null && root.right == null){
            if(currentSum == sum){
                System.out.println("found a path");
                for(int path : stack) {
                    System.out.print(path + " ");
                }
                System.out.println();
            }
        }
        if(root.left != null)
            findPath(root.left, sum, stack, currentSum);
        if(root.right != null)
            findPath(root.right, sum, stack, currentSum);
        stack.pop();
    }

    public void findPath(BinaryTreeNode root, int sum) {
        if (root == null)
            return;
        Stack<Integer> stack = new Stack<Integer>();
        int currentSum = 0;
        findPath(root, sum, stack, currentSum);
    }

    public static void main(String[] args){
        BinaryTreeNode root1=new BinaryTreeNode();
        BinaryTreeNode node1=new BinaryTreeNode();
        BinaryTreeNode node2=new BinaryTreeNode();
        BinaryTreeNode node3=new BinaryTreeNode();
        BinaryTreeNode node4=new BinaryTreeNode();
        root1.left=node1;
        root1.right=node2;
        node1.left=node3;
        node1.right=node4;
        root1.value=10;
        node1.value=5;
        node2.value=12;
        node3.value=4;
        node4.value=7;
        SumOfPathInBinaryTree testFindPath=new SumOfPathInBinaryTree();
        testFindPath.findPath(root1, 22);
    }
}
