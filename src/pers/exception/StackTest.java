package pers.exception;

/**
 * @Author LiZiHao
 * @Date 2022/6/25/16:27
 */
public class StackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        try {
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
//            发生异常,栈已满,压栈失败,抛出异常
            myStack.push(new Object());
        } catch (StackException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }

        try {
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
            myStack.pop();
//            异常,栈已空,弹栈失败.抛出异常
            myStack.pop();
        } catch (StackException e) {
//            throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }
    }
}
