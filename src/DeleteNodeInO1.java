/**
 * Created by yichunli on 2017/7/4.
 */
public class DeleteNodeInO1 {

    public static void deleteNode(ListNode head, ListNode deListNode){
        if(deListNode == null || head == null){
            return;
        }
        //删除头结点
        if(head == deListNode){
            head = null;
        } else{
            //删除尾节点
            if(deListNode.next == null){
                ListNode pointListNode = head;
                while(pointListNode.next.next != null){
                    pointListNode = pointListNode.next;
                }
                pointListNode.next = null;
            } else{
                deListNode.data = deListNode.next.data;
                deListNode.next = deListNode.next.next;
            }
        }
    }

    public static void main(String[] args){
        ListNode head=new ListNode();
        ListNode second=new ListNode();
        ListNode third=new ListNode();
        head.next = second;
        second.next=third; head.data=1; second.data=2; third.data=3;
        DeleteNodeInO1 deleteNodeInO1=new DeleteNodeInO1();
        deleteNodeInO1.deleteNode(head, second);
        System.out.println(head.next.data);
    }
}
