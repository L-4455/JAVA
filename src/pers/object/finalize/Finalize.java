package pers.object.finalize;

/**
 * @Author LiZiHao
 * @Date 2022/5/15/22:07
 */
public class Finalize {
    /*
            finalize方法的使用
         finalize是protected修饰的.
         finalize不需要手动调用,只需要重写就行.
         finalize是JVM中的GC机制调用的,这个调用有个时机:垃圾回收时机
         在垃圾回收时机可以执行一段代码.
         finalize是object提供的一个方法,该方法是垃圾回收器来调用的.源码:
            protected void finalize() throws Throwable { }

         GC不是在JVM启动时启动,GC在启动时一般是垃圾太多,或则某种时间到了.
     */
    public static void main(String[] args) {
        /*使用for循环制造更多的垃圾让GC启动
        for(int i = 0; i < 1000000000; i++){
            User user = new User();
            user = null;
        }*/
//      使用System.gc();
        User user = new User();
        user = null;
//        建议垃圾回收器启动,在JDK11中好像是百分之百启动,在其他版本中则不一定.
        System.gc();
    }
}

class User {
    protected void finalize() {
        System.out.println("被销毁了");
    }

}

