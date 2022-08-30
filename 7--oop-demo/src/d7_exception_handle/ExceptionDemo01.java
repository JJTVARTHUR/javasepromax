package d7_exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
      异常处理方式 1 - throws
      1. throws: 用在方法上，可以将方法内部出现的异常抛出去给本方法的调用者处理
      2. 这种方式并不好，发生异常的方法自己不处理异常，如果异常最终抛出去给虚拟机将引起程序死亡
      3. 在出现编译时异常的地方层层把异常抛出去给调用者，调用者最终抛出给JVM虚拟机。JVM虚拟机输出异常信息，直接干掉程序，
         这种方式与默认方式是一样的。虽然可以解决代码编译时的错误，但是一旦运行时真的出现异常，程序还是会立即死亡！这种方式并不好!

      抛出异常格式:
                 方法 throws 异常1 异常2 异常3....{
                 }
      规范做法:
                 方法 throws Exception{
                 }
 */
public class ExceptionDemo01 {

//    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        System.out.println("程序开始。。。。。");
//        parseTime("2011-11-11 11:11:11");
//        System.out.println("程序结束。。。。。");
//    }
//
//    public static void parseTime(String date) throws ParseException, FileNotFoundException {
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
//        Date d = sdf.parse(date);
//        System.out.println(d);
//
//        InputStream is = new FileInputStream("E:/meinv.jpg");
//    }

    public static void main(String[] args) throws Exception {
        System.out.println("程序开始。。。。。");
        parseTime("2011-11-11 11:11:11");
        System.out.println("程序结束。。。。。");
    }

    public static void parseTime(String date) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(date);
        System.out.println(d);

        InputStream is = new FileInputStream("E:/meinv.jpg");
    }

}
