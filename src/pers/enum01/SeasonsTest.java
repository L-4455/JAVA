package pers.enum01;

/**
 * @Author LiZiHao
 * @Date 2022/6/17/8:59
 */
public class SeasonsTest {
    public static void main(String[] args) {
        four(Seasons.SPRING);
        four(Seasons.SUMMER);
        four(Seasons.AUTUMN);
        four(Seasons.WINTER);
    }

    public static Seasons four(Seasons a) {
        try {
//            if(a == Seasons.SPRING){
//                System.out.println("春天");
//            }
            switch (a) {
                case SPRING: {
                    System.out.println("春天");
                    break;
                }
                case SUMMER: {
                    System.out.println("夏天");
                    break;
                }
                case AUTUMN: {
                    System.out.println("秋天");
                    break;
                }
                case WINTER: {
                    System.out.println("冬天");
                    break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return Seasons.SUMMER;
    }
}
