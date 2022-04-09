package pers.luochen.student;

import pers.luochen.printf.Au;

/**
 * @author: LiZhiHao
 * @Date: 2021-05-27 21:55:56
 * @LastEditTime: 2022-03-27 23:15:37
 */
public class Test003 {
    public static void main(String[] args) {
        Customer w = new Customer();
        Au.q(w.id);
        //w = null;
        Au.q(w.id);
    }
}
