package pers.exception;

/*
暂时不需要
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
*/

/**
 * @Author LiZiHao
 * @Date 2022/6/24/17:13
 */
public class ExceptionTest07 {
    /*
        try...catch
        1.try...catch支持多重catch
        2.catch的语句块要按从上往下,从小到大的顺序.也就是说第一个catch语句块不能大于第二个(同一类或是父类)
        3.JDK8新特性:catch语句块支持"或"运算符
        4.catch语句块可以写确切的异常类,也可以写他的父类或父类的父类.但建议写确切的异常类,这样方便调试。

     */

    public static void main(String[] args) {
        /*
        多重catch
        try {
            FileInputStream abc = new FileInputStream("D:\\我的账户.txt");
            abc.read();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        }catch(IOException e){
            System.out.println("文件读取失败");
        }
        */
        /*
        catch后的语句块要按从上到下,从大到小的顺序.
        try {
            FileInputStream abc = new FileInputStream("D:\\我的账户.txt");
            abc.read();
        } catch (IOException e) {
            System.out.println("文件不存在");
//            异常“java.io.FileNotFoundException”已被捕获
        } catch(FileNotFoundException e) {
            System.out.println("文件读取失败");
        }
        */
        /*
        JDK8新特性:catch语句块支持"或"运算符
        try {
            System.out.println(100 / 0);
            FileInputStream abc = new FileInputStream("D:\\我的账户.txt");
            System.out.println("文件不存在");
        } catch(FileNotFoundException | ArithmeticException | NullPointerException e) {
            System.out.println("文件读取失败?算数失败? 空指针异常?");
        }
        */
        /*
        catch语句块可以写确切的异常类,也可以写他的父类或父类的父类.
        try{
            FileInputStream xyz = new FileInputStream("D:\\我的账户.txt");
        }catch(IOException e){
            System.out.println("文件读取失败");
        }catch(Exception e){
            System.out.println("文件读取失败");
        }
        */
    }
}
