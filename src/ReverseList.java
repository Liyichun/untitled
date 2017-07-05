/**
 * Created by yichunli on 2017/7/5.
 */
public class ReverseList {
    //非递归
    public ListNode reverseList(ListNode head){
        if(head == null)
            return null;
        if(head.next == null)
            return head;
        ListNode preListNode = null;
        ListNode nowListNode = head;

        while(nowListNode.next != null){
            ListNode nextListNode = nowListNode.next;
            nowListNode.next = preListNode;
            preListNode = nowListNode;
            nowListNode = nextListNode;
        }
        return nowListNode;
    }

    //递归
    public ListNode reverseList2(ListNode head){
        if(head == null || head.next == null)
            return head;
        else{
            ListNode newHead = reverseList2(head.next);//先反转后面的链表
            head.next.next = head;//再将当前节点设置为其然来后面节点的后续节点
            head.next = null;
            return newHead;
        }
    }
    public static void main(String[] args) {
        ListNode head=new ListNode();
        ListNode second=new ListNode();
        ListNode third=new ListNode();
        ListNode forth=new ListNode();
        head.next=second;
        second.next=third;
        third.next=forth;
        head.data=1;
        second.data=2;
        third.data=3;
        forth.data=4;
        ReverseList test=new ReverseList();
        ListNode resultListNode=test.reverseList2(head);
        System.out.println(resultListNode.data);
    }
}
