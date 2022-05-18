package pers.array;

/**
 * @Author LiZiHao
 * @Date 2022/5/18/22:31
 */
public class ArrayTest06 {
    //    模拟一个系统,该系统需要用户输入账号和密码.不输入或输入错误则不能进入改系统.
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("你不能进入该系统");
            return;
        }
//        程序执行到这里,说明用户确实输入了账户和密码.假设账号为[admin],密码为123
//        取到账号
        String username = args[0];

//        username = null;
//        取到密码
        String password = args[1];
//        这样写不安全,当username为空时,会报空指针异常.
//        if(username.equals("admin") && password.equals("123")){

//        这样写更安全,不会出现空指针异常.这是编程中的经验.汲取别人的经验,体悟.
        if ("admin".equals(username) && "123".equals(password)) {
            System.out.println("欢迎[" + username + "]进入系统");
        } else {
            System.out.println("账号不存在或密码错误!");
        }
    }

}
