package pers.exception.work.d1;

/**
 * @Author LiZiHao
 * @Date 2022/6/25/17:00
 */
public class FinishRegister extends lengthException {
    public void register(String name, String password) throws lengthException {
        if (null == name || name.length() < 6 || name.length() > 14) {
            throw new lengthException("用户名不规范");
        }
        if (password.length() < 8 || password.length() > 16) {
            throw new lengthException("密码不规范");
        }
    }
}
