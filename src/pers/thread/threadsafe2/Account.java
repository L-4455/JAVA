package pers.thread.threadsafe2;

/**
 * @Author LiZiHao
 * @Date 2022/07/12/16:31
 */
public class Account {
    Object obj = new Object(); // 这是一个实例变量,在Account中只有一份.
    /*
        使用同步机制,保证线程一次执行完代码再让其他线程进来.
     */
    private String actNo;
    private int actBalance;

    public Account() {
    }

    public Account(String actNo, int actBalance) {
        this.actNo = actNo;
        this.actBalance = actBalance;
    }

    public String getActNo() {
        return actNo;
    }

    public void setActNo(String actNo) {
        this.actNo = actNo;
    }

    public int getActBalance() {
        return actBalance;
    }

    public void setActBalance(int actBalance) {
        this.actBalance = actBalance;
    }

    public void Pick(int money) {
//        使用同步机制
//        语法:synchronized(){
//               同步代码块.
//          }
        /*
            其中这个关键值的参数非常重要
            参数填写的是线程共享的哪个数据,比如线程T1和线程T2共享的数据
            共享数据为Account,那么这里就填写Account,这样一来T1和T2就得排队执行
            比如:a1 a2 a3 a4 a5五个线程,想要a1 a2 a3排队执行,a4 a5并发执行
            那么只需要填写a1 a2 a3共享的数据即可.

            Account就是当前对象,可以用this
            这样一来T1和T2就得排队执行

         */
        /*
            这个括号中的参数是很重要的,具体要写什么要看需要同步的线程共享了哪些数据
            java中每个对象都有一把锁,这个锁就是一个标记.
            synchronized执行原理:
                1.假设T1和T2共享了this,this表示当前对象.
                2.假设T1线程进来执行了,看到synchronized后面的共享对象的参数,会去找这个共享对象的共享锁,
                    找到之后T1把这个锁占用了,此时T2进来想要执行代码,也看到了synchronized后也会去找共享对象的共享锁
                    找到之后发现已经被占用了,那么T2就会在同步代码块外面等待这个锁不被占用,才可以进去执行代码
                3.总的来说就是,谁先进来占用了锁,谁就可以执行代码,在代码没有执行完期间谁也无法再次占用这个锁,占用不了对象锁,就无法进入
                    同步代码块执行代码,这样就造成了线程排队的问题.保证了数据的安全.

         */
//        Object obj1 = new Object();
//        synchronized(this){
//        synchronized(obj){ // 这样写也可以,因为obj是个实例变量,在Account中只有一份.所以T1线程占用这obj,T2线程就无法再次占用了
//        synchronized("abc"){ // 也可以这样写,"abc"在字符串常量池中,所有java对象都可以共享.但是这样造成了不论是谁来取钱都要等待,
//                              如果一个人来对另外一个账户进行取款,那么也需要等待,因为这个账户共享了"abc",发生了同步机制.但这不是不应该的
//        synchronized(obj1){  这个不行,obj是一个局部变量,T1进来会new一个,T2进来也会new一个,相当于有了两把锁,这样就没有触发同步机制.
//
//        Object obj2 = null;
//        synchronized(obj2){ 报错:空指针异常
//        synchronized(null){ 不行,没有这种语法

//        最好的还是采用这种方式.
        synchronized (this) {
            System.out.println("账户编号:" + this.getActNo() + "余额:" + this.getActBalance());
            int forwardPick = this.getActBalance();
            int lastPick = forwardPick - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setActBalance(lastPick);
            System.out.println(Thread.currentThread().getName() + "取款" + money + "元:" +
                    "余额:" + this.getActBalance());
        }
    }
}
