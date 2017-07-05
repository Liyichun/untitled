/**
 * Created by yichunli on 2017/7/5.
 */
public class BIsSubTreeOfA {
    public boolean hasSubTree(BinaryTreeNode root1, BinaryTreeNode root2){
        boolean result = false;
        if(root1 != null && root2 != null) {
            if(root1.value == root2.value){
                result = doesTree1HasTree2(root1, root2);
                if(!result)
                    result = hasSubTree(root1.left, root2);
                if(!result)
                    result = hasSubTree(root1.right, root2);
            }
        }
        return result;
    }

    private boolean doesTree1HasTree2(BinaryTreeNode root1, BinaryTreeNode root2){
        if(root2 == null)
            return true;
        else if(root1 == null)
            return false;
        if(root1.value != root2.value)
            return false;
        return doesTree1HasTree2(root1.left, root2.left) &&
                doesTree1HasTree2(root2.right, root2.right);
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
        BinaryTreeNode root2 = new BinaryTreeNode();
        BinaryTreeNode a = new BinaryTreeNode();
        BinaryTreeNode b = new BinaryTreeNode();
        root2.left = a;
        root2.right = b;
        root2.value = 8;
        a.value = 9;
        b.value = 2;
        BIsSubTreeOfA x = new BIsSubTreeOfA();
        System.out.print(x.hasSubTree(root1, root2));
    }
}
