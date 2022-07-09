package pers.io.print;

/**
 * @Author LiZiHao
 * @Date 2022/07/08/15:41
 */
public class LogUtilTest {
    public static void main(String[] args) {
        LogUtil logUtil = new LogUtil();
        logUtil.record("我今天吃了大龙虾");
        logUtil.record("今天天气晴,我心情很好.");
    }
}
