package d7_exception_handle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
      异常处理方式 2 - try...catch...
      1. 监视捕获异常，用在方法内部，可以将方法内部出现的异常直接捕获处理
      2. 这种方式还可以让发生异常的方法自己独立完成异常的处理，程序可以继续往下执行
      3. 第二种方式，可以处理异常，并且出现异常后代码也不会死亡。这种方案还是可以的。
         但是从理论上来说，这种方式不是最好的，上层调用者不能直接知道底层的执行情况！

      格式:                               建议格式:
           try{                                   try{
             // 监视可能出现异常的代码                  // 监视可能出现异常的代码
           }catch(异常类型1 变量){                  }catch(Exception e){
             // 处理异常                              e.printStackTrace(); // 直接打印异常栈信息
           }catch(异常类型2 变量){                  }
             // 处理异常
           }...                                   Exception可以捕获处理一切异常类型

 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。");
        parseTime("2011-11-11 11:11:11");
        System.out.println("程序结束。。。。");
    }

    public static void parseTime(String date){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
            Date d = sdf.parse(date);
            System.out.println(d);

            InputStream is = new FileInputStream("E:/meinv.jpg");
        } catch (Exception e) {
            e.printStackTrace(); // 打印异常栈信息
        }
    }

//    public static void parseTime(String date) {
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
//            Date d = sdf.parse(date);
//            System.out.println(d);
//
//            InputStream is = new FileInputStream("E:/meinv.jpg");
//        } catch (FileNotFoundException|ParseException e) {
//            e.printStackTrace(); // 打印异常栈信息
//        }
//    }

//    public static void parseTime(String date) {
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
//            Date d = sdf.parse(date);
//            System.out.println(d);
//
//            InputStream is = new FileInputStream("E:/meinv.jpg");
//        } catch (FileNotFoundException e) {
//           e.printStackTrace(); // 打印异常栈信息
//        } catch (ParseException e) {
//           e.printStackTrace();
//        }
//    }

//    public static void parseTime(String date) {
//        try {
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
//            Date d = sdf.parse(date);
//            System.out.println(d);
//        } catch (ParseException e) {
//            // 解析出现问题
//            System.out.println("出现了解析时间异常哦，走点心！！");
//        }
//
//        try {
//            InputStream is = new FileInputStream("E:/meinv.jpg");
//        } catch (FileNotFoundException e) {
//            System.out.println("您的文件根本就没有啊，不要骗我哦！！");
//        }
//    }
}
