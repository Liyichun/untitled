import java.util.Stack;

/**
 * Created by yichunli on 2017/7/5.
 */
public class BinaryTreeMirror {
    //非递归
    public BinaryTreeNode mirrorBinaryTree(BinaryTreeNode root){
        if(root == null)
            return null;
        if(root.left == null && root.right == null)
            return null;
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();

        while(root != null || stack.isEmpty()){
            while(root != null){
                BinaryTreeNode temp = root.left;
                root.left = root.right;
                root.right = temp;
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }
        return root;
    }
    //递归
    public BinaryTreeNode mirrorBinaryTreeRecursively(BinaryTreeNode root){
        if(root == null)
            return null;
        if(root.left == null && root.right == null)
            return null;
        BinaryTreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        if(root.left != null)
            mirrorBinaryTreeRecursively(root.left);
        if(root.right != null)
            mirrorBinaryTreeRecursively(root.right);
        return root;
    }

    public static void main(String[] args) {
        BinaryTreeNode root1 = new BinaryTreeNode();
        BinaryTreeNode node1 = new BinaryTreeNode();
        BinaryTreeNode node2 = new BinaryTreeNode();
        BinaryTreeNode node3 = new BinaryTreeNode();
        BinaryTreeNode node4 = new BinaryTreeNode();
        BinaryTreeNode node5 = new BinaryTreeNode();
        BinaryTreeNode node6 = new BinaryTreeNode();
        root1.left = node1;
        root1.right = node2;
        node1.left = node3;
        node1.right = node4;
        node4.left = node5;
        node4.right = node6;
        root1.value = 8;
        node1.value = 8;
        node2.value = 7;
        node3.value = 9;
        node4.value = 2;
        node5.value = 4;
        node6.value = 7;
        BinaryTreeMirror test = new BinaryTreeMirror();
        BinaryTreeNode rootBinaryTreeNode = test.mirrorBinaryTreeRecursively(root1);
        System.out.println(root1.right.value);
    }
}
