package pers.array.work.d1;

/**
 * @Author LiZiHao
 * @Date 2022/5/29/15:15
 */
public class Test {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
//        String[] array = {"w"};
        for (int i = 0; i <= 10; i++) {
            myStack.push(new Object());
        }

        for (int i = 0; i <= 10; i++) {
            myStack.pop();
        }
    }
}

