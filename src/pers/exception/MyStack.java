package pers.exception;

/*
    使用自定义异常对这个程序进行改进.
 */
public class MyStack {
    Object[] objects;

    //    栈帧的初始值应该为-1;如果为0的话,那么就表示即使栈中没有元素,栈帧也会指向栈顶元素.
//    我们要表达式的是:当栈中没有元素时,栈帧不指向任何元素.
    int index = -1;

    public MyStack() {
        objects = new Object[10];
    }

    public void push(Object a) throws StackException {
        if (index >= objects.length - 1) {
            /*
            改良
            System.out.println("栈已满,压栈失败");
            return;
            */
            /*
            合并
            StackException stackException  = new StackException("栈已满,压栈失败");
//            对于自定义的异常,一般采用抛出的形式处理,使用捕捉就没意思了.自己定义自己捕捉(无意义).
            throw stackException;*/
            throw new StackException("栈已满,压栈失败");
        }
        index++;
        objects[index] = a;
        System.out.println("压" + "\"" + a + "\"" + "元素成功,栈帧指向" + index);
    }

    public void pop() throws StackException {
        if (index < 0) {
            /*
            改良
            System.out.println("弹栈失败,栈空");
            return;
            */
            throw new StackException("弹栈失败,栈空");
        }
        System.out.print("弹" + "\"" + objects[index] + "\"" + "元素成功");
        index--;
        System.out.println("栈帧指向" + index);

    }
}