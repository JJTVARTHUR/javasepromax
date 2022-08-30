package d7_exception_handle;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
     异常处理方式 3 - 前两者结合
     1. 方法直接将异常通过throws抛出去给调用者
     2. 调用者收到异常后直接捕获处理
     3. 在出现异常的地方把异常一层一层的抛出给最外层调用者，最外层调用者集中捕获处理！！（规范做法）

     小结：
     1. 编译时异常的处理方式三：底层出现的异常抛出给最外层调用者集中捕获处理。
     2. 这种方案最外层调用者可以知道底层执行的情况，同时程序在出现异常后也不会立即死亡，这是理论上最好的方案。
     3. 虽然异常有三种处理方式，但是开发中只要能解决你的问题，每种方式都有可能用到!!
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        System.out.println("程序开始。。。");
        try {
            parseTime("2011-11-11 11:11:11");
            System.out.println("功能操作成功~~~");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("功能操作失败~~~");
        }
        System.out.println("程序结束。。。。");
    }

    public static void parseTime(String date) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy、MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);

        InputStream is = new FileInputStream("D:/meinv.jpg");
    }

}
