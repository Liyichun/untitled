import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by yichunli on 2017/7/6.
 */
public class PrintBinaryTreeFromTopToBottom {
    public void printFromTopToBottom(BinaryTreeNode root){
        if(root == null)
            return;
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryTreeNode node = queue.poll();
            System.out.print(node.value);
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
        }
    }

    public static void main(String args[]) {
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
        PrintBinaryTreeFromTopToBottom test = new PrintBinaryTreeFromTopToBottom();
        test.printFromTopToBottom(root1);
    }
}
