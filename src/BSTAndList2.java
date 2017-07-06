import java.beans.BeanInfo;

/**
 * Created by yichunli on 2017/7/6.
 */
public class BSTAndList2 {

    public BinaryTreeNode convert(BinaryTreeNode root){
        BinaryTreeNode lastNodeList = null;
        convertNode(root, lastNodeList);
        while(lastNodeList != null && lastNodeList.left != null){
            lastNodeList = lastNodeList.left;
        }
        return lastNodeList;

    }

    private void convertNode(BinaryTreeNode root, BinaryTreeNode lastNodeList){
        if(root == null)
            return;
        BinaryTreeNode current = root;
        if(current.left != null){
            convertNode(current.left, lastNodeList);
        }
        current.left = lastNodeList;
        if(lastNodeList != null)
            lastNodeList.right = current;
        lastNodeList = current;
        if(current.right != null){
            convertNode(current.right, lastNodeList);
        }
    }
}
