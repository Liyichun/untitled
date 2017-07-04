import java.util.Stack;

/**
 * Created by yichunli on 2017/7/4.
 */
public class PrintListReverse {
    //非递归
    public static void printListReverse(ListNode headNode){
        Stack<ListNode> stack = new Stack<>();
        while(headNode != null){
            stack.push(headNode);
            headNode = headNode.next;
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop().data);
        }
    }

    //递归
    public static void printListReverse2(ListNode headNode){
        if(headNode != null){
            if(headNode.next != null){
                printListReverse2(headNode.next);
            }
        }
        System.out.println(headNode.data);
    }

    public static void main(String args[]){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        PrintListReverse printListReverse = new PrintListReverse();
        printListReverse.printListReverse2(node1);

    }
}
