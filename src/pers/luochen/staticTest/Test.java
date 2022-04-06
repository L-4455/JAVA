package pers.luochen.staticTest;

/**
 * @author LiZhiHao
 * @date 2022/4/6 17:12
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("我是你爹");
    }

    class Student01 {
        private int no;
        private String name;

        public Student01(int no, String name) {
            this.no = no;
            this.name = name;
        }

        public int getNo() {
            return no;
        }

        public void setNo(int no) {
            this.no = no;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
