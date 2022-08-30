package d4_byte_stream;

import java.io.*;

/**
      字节流的拷贝:
      字节输入输出流比较适合做一切文件数据的拷贝，因为任何文件(文本/视频/音频/...)的底层都是字节，
      拷贝是一字不漏的转移字节，只要前后文件格式，编码一致没有任何问题
 */
public class CopyDemo05 {
    public static void main(String[] args) {
        try {
            // 1. 创建一个字节输入流管道与原文本文件接通
            InputStream is1 = new FileInputStream("9--oop-demo/src/out04.txt");

            // 2. 创建一个字节输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("9--oop-demo/src/out05.txt");

            // 3. 定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数
            while((len = is1.read(buffer)) != -1){
                os.write(buffer , 0 , len);
            }
            System.out.println("复制完成了！");

            // 4. 关闭流
            os.close();
            is1.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
