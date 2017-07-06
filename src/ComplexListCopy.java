/**
 * Created by yichunli on 2017/7/6.
 */
public class ComplexListCopy {

    public ComplexListNode clone(ComplexListNode head){
        if(head == null) {
            return null;
        }
        cloneNodes(head);

        connectSiblingNodes(head);

        return reconnectNodes(head);
    }

    public void cloneNodes(ComplexListNode head){
        ComplexListNode node = head;
        while(node != null){
            ComplexListNode cloneNode = new ComplexListNode();
            cloneNode.data = node.data;
            cloneNode.next = node.next;
            cloneNode.sibling = null;
            node.next = cloneNode;
            node = cloneNode.next;
        }
    }

    public void connectSiblingNodes(ComplexListNode head){
        ComplexListNode node = head;
        while(node != null){
            ComplexListNode cloneNode = node.next;
            if(node.sibling != null){
                cloneNode.sibling = node.sibling.next;
            }
            node = cloneNode.next;
        }
    }

    public ComplexListNode reconnectNodes(ComplexListNode head){
        ComplexListNode node = head;
        ComplexListNode clonedHead = null;
        ComplexListNode clonedNode = null;
        if(node != null) {
            clonedNode = node.next;
            clonedHead = clonedNode;
            node.next = clonedNode.next;
            node = node.next;
        }
        while(node != null){
            clonedNode.next = node.next;
            clonedNode = clonedHead.next;
            node.next = clonedNode.next;
            node = node.next;
        }
        return clonedHead;

    }
}
