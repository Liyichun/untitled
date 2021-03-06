import java.util.Arrays;

/**
 * Created by yichunli on 2017/7/4.
 */
public class RebuildBinaryTree {

    public static BinaryTreeNode constructCore(int[] preorder, int[] inorder) throws Exception{
        if(preorder == null || inorder == null){
            return null;
        }
        if(preorder.length != inorder.length) {
            throw new Exception("长度不一样，非法输入");
        }
        BinaryTreeNode root = new BinaryTreeNode();
        for(int i = 0; i < inorder.length; i++){
            if(preorder[0] == inorder[i]) {
                root.value = inorder[i];
                System.out.println(root.value);
                root.left = constructCore(Arrays.copyOfRange(preorder, 1, i + 1), Arrays.copyOfRange(inorder, 0, i));
                root.right = constructCore(Arrays.copyOfRange(preorder, i + 1, preorder.length), Arrays.copyOfRange(inorder, i + 1, inorder.length));
            }
        }
        return root;
    }

    public static void main(String[] args) throws Exception {
        int[] preSort = {1,2,4,7,3,5,6,8};
        int[] inSort = {4,7,2,1,5,3,8,6};

        BinaryTreeNode root = constructCore(preSort, inSort);
    }
}
