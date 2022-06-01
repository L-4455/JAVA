package pers.array.work.d1;

/**
 * @Author LiZiHao
 * @Date 2022/5/29/15:06
 */
public class MyStack {
    Object[] objects;

    //    栈帧的初始值应该为-1;如果为0的话,那么就表示即使栈中没有元素,栈帧也会指向栈顶元素.
//    我们要表达式的是:当栈中没有元素时,栈帧不指向任何元素.
    int index = -1;

    public MyStack() {
        objects = new Object[10];
    }

    public void push(Object a) {
        if (index >= objects.length - 1) {
            System.out.println("栈已满,压栈失败");
            return;
        }
        index++;
        objects[index] = a;
        System.out.println("压" + "\"" + a + "\"" + "元素成功,栈帧指向" + index);
    }

    public void pop() {
        if (index < 0) {
            System.out.println("弹栈失败,栈空");
            return;
        }
        System.out.print("弹" + "\"" + objects[index] + "\"" + "元素成功");
        index--;
        System.out.println("栈帧指向" + index);

    }
}