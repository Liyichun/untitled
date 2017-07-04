import java.util.List;

/**
 * Created by yichunli on 2017/7/4.
 */
public class ListNode {
    int data;
    ListNode next;
    ListNode prev;

    public ListNode(){

    }

    public ListNode(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
