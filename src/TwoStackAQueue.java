import java.util.Stack;

/**
 * Created by yichunli on 2017/7/4.
 */
public class TwoStackAQueue<T> {
    private Stack<T> stack1 = new Stack<T>();
    private Stack<T> stack2 = new Stack<T>();

    public void appendTail(T t){
        stack1.push(t);
    }

    public T deleteHead() throws Exception{
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.isEmpty()){
            throw new Exception("队列为空，不能删除");
        }
        return stack2.pop();
    }

    public static void main(String args[]) throws Exception{
        TwoStackAQueue<String> twoStackAQueue = new TwoStackAQueue<>();
        twoStackAQueue.appendTail("1");
        twoStackAQueue.appendTail("2");
        twoStackAQueue.appendTail("3");
        twoStackAQueue.deleteHead();

    }
}
