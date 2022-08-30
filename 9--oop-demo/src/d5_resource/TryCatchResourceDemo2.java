package d5_resource;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
      JDK7改进方案:

      try(定义流对象){
           可能出现异常的代码;
      } catch (异常类名 变量名){
           异常的处理代码;
      }

      资源用完最终自动释放

      注意:
      1. JDK7 以及 JDK9的()中只能放置资源对象，否则报错
      2. 资源都是实现了Closeable/AutoCloseable接口的类对象
        - public abstract class InputStream implements Closeable{}
        - public abstract class OutputStream implements Closeable,Flushable{}
 */

public class TryCatchResourceDemo2 {
    public static void main(String[] args) {
        try (
                // 这里面只能放置资源对象，用完会自动关闭：自动调用资源对象的close方法关闭资源(即使出现异常也会做关闭操作)
                // 1. 创建一个字节输入流管道与原文本文件接通
                InputStream is = new FileInputStream("9--oop-demo/src/out04.txt");
                // 2. 创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("9--oop-demo/src/out05.txt");

                // int age = 23; // 这里只能放资源

                MyConnection connection = new MyConnection(); // 最终会自动调用资源的close方法

        ) {
            // 3. 定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成了！");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    class MyConnection implements AutoCloseable{
        @Override
        public void close() throws Exception {
            System.out.println("连接资源被成功释放了！");
        }
    }

