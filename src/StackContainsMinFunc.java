import java.util.Stack;

/**
 * Created by yichunli on 2017/7/6.
 */
public class StackContainsMinFunc{
    private Stack<Integer> minStack = new Stack<Integer>();
    private Stack<Integer> dataStack = new Stack<Integer>();
    public void push(Integer item){
        dataStack.push(item);
        if(minStack.size() == 0 || item <= minStack.peek()){
            minStack.push(item);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public Integer pop(){
        if(dataStack.size() == 0 || minStack.size() == 0){
            return null;
        }
        minStack.pop();
        return dataStack.pop();
    }

    public Integer min(){
        if(minStack.size() == 0)
            return null;
        return minStack.peek();
    }

    public static void main(String[] args){
        StackContainsMinFunc test = new StackContainsMinFunc();
        test.push(3);
        test.push(2);
        test.push(8);
        test.push(4);
        test.push(1);
        System.out.println(test.min());
    }
}
