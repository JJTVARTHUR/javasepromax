package d5_resource;

import java.io.*;

/**
       try-catch-finally 释放资源:
       1. finally：在异常处理时提供finally块来执行所有清除操作，比如说IO流中的释放资源
       2. 特点：被finally控制的语句最终一定会执行，除非JVM退出
       3. 异常处理标准格式：try...catch...finally
       4. 需要程序员手动释放资源

       try-catch-finally 格式:

       try{                                                              try{
            FileOutputStream fos = new FileOutputStream("a.txt");             可能出现异常的代码;
            fos.write(97);                                               } catch (异常类名 变量名){
            fos.close();                                                      异常的处理代码;
       } catch (IOException e){                                          } finally {
           e.printStackTrace();                                               执行所有资源释放操作;
       } finally{                                                        }

       }                                                                 手动释放资源
 */
public class TryCatchFinallyDemo1 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try{

            // System.out.println(10 / 0);

            // 1. 创建一个字节输入流管道与原视频接通
            is = new FileInputStream("9--oop-demo/src/out04.txt");

            // 2. 创建一个字节输出流管道与目标文件接通
            os = new FileOutputStream("9--oop-demo/src/out05.txt");

            // 3. 定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数
            while((len = is.read(buffer)) != -1){
                os.write(buffer , 0 , len);
            }
            System.out.println("复制完成了！");

            //   System.out.println( 10 / 0);

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            // 无论代码是正常结束，还是出现异常都要最后执行这里
            System.out.println("========finally=========");
            try {
                // 4. 关闭流
                if(os != null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try{
                if(is != null){
                    is.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        System.out.println(test(10 , 2));
    }

    public static int test(int a , int b){
        try{
            int c = a / b;
            return c;
        } catch (Exception e){
            e.printStackTrace();
            return -111111; // 计算出现bug
        } finally {
            System.out.println("--finally--");
            // 哪怕上面有return语句执行，也必须先执行完这里才可以！
            // 开发中不建议在这里加return，如果加了，返回的永远是这里的数据了，这样会出问题！
            return 100;
        }
    }
}
