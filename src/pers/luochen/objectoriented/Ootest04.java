/**
 * @author: LiZhiHao
 * @Date: 2022-03-26 19:24:00
 * @LastEditTime: 2022-03-27 22:20:51
 */

package pers.luochen.objectoriented;

public class Ootest04 {
    public static void main(String[] args) {
        /**
         * 创建丈夫和妻子类，并通过丈夫找到妻子，通过妻子找到丈夫。
         */
        Husband liSi = new Husband();
        Wife boBy = new Wife();
        liSi.name = "LiSi";
        boBy.name = "baBy";

        liSi.w = boBy;
        boBy.h = liSi;
        //System.out.println(LiSi.name + "的妻子名字叫：" + boBy.name);
        System.out.println(liSi.name + "的妻子名字叫：" + liSi.w.name);
        System.out.println(boBy.name + "的丈夫名字叫：" + boBy.h.name);
    }
    
}
