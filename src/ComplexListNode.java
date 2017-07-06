/**
 * Created by yichunli on 2017/7/6.
 */
public class ComplexListNode {
    int data;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ComplexListNode getNext() {
        return next;
    }

    public void setNext(ComplexListNode next) {
        this.next = next;
    }

    public ComplexListNode getSibling() {
        return sibling;
    }

    public void setSibling(ComplexListNode sibling) {
        this.sibling = sibling;
    }

    ComplexListNode next;
    ComplexListNode sibling;

    public ComplexListNode(){

    }

    public ComplexListNode(int data){
        this.data = data;
        this.next = null;
        this.sibling = null;
    }
}
