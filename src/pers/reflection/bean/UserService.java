package pers.reflection.bean;

/**
 * @Author LiZiHao
 * @Date 2022/07/18/11:02
 */
public class UserService {

    public String login(String name, String password) {
        if ("admin".equals(name) && "213".equals(password)) {
            return "登录成功";
        }
        return "登陆失败";
    }

    public void logout() {
        System.out.println("退出系统");
    }
}
