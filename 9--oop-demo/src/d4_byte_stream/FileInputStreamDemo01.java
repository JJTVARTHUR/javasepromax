package d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
       IO流概述:
       1. I表示input，是数据从硬盘文件读入到内存的过程，称之输入，负责读
       2. O表示output，是内存程序的数据从内存到写出到硬盘文件的过程，称之输出，负责写

       流的四大类:
       1. 字节输入流：以内存为基准，来自硬盘文件/网络中的数据以字节的形式读入到内存中去的流称为字节输入流
       2. 字节输出流：以内存为基准，把内存中的数据以字节写出到硬盘文件或者网络中去的流称为字节输出流
       3. 字符输入流：以内存为基准，来自硬盘文件/网络中的数据以字符的形式读入到内存中去的流称为字符输入流
       4. 字符输出流：以内存为基准，把内存中的数据以字符写出到硬盘文件或者网络介质中去的流称为字符输出流

       IO流的体系:
                                        字节流                                   字符流
                           字节输入流            字节输出流               字符输入流        字符输出流
       (抽象类)             InputStream          OutputStream           Reader           Writer
       (实现类，可以使用的)   FileInputStream      FileOutputStream       FileReader       FileWriter

       文件字节输入流: FileInputStream
          -- 作用：以内存为基准，把磁盘文件中的数据以字节的形式读取到内存中去。
                  按照字节读文件数据到内存中。
          -- 构造器：
             public FileInputStream(File file): 创建字节输入流管道与源文件对象接通
             public FileInputStream(String pathname): 创建字节输入流管道与源文件路径接通。
          -- 方法：
             public int read(): 每次读取一个字节返回，如果字节已经没有可读的返回-1
             public int read(byte[] buffer): 每次读取一个字节数组返回，如果字节已经没有可读的返回-1

       结论: 1. 每次读取一个字节性能较差
            2. 读取中文字符输出无法避免乱码问题
 */

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个文件字节输入流管道与源文件接通
        // InputStream is = new FileInputStream(new File("9--oop-demo/src/data.txt"));
        // 简化写法
        InputStream is = new FileInputStream("9--oop-demo/src/data.txt");

        // 2. 读取一个字节返回 (每次读取一滴水)
//        int b1 = is.read();
//        System.out.println((char)b1);
//
//        int b2 = is.read();
//        System.out.println((char)b2);
//
//        int b3 = is.read();
//        System.out.println((char)b3);
//
//        int b4 = is.read(); // 读取完毕返回-1
//        System.out.println(b4);

        // 3. 使用循环改进
        // 定义一个变量记录每次读取的字节    a  b  3   爱
        //                              o o  o   [ooo]
        int b;
        while((b = is.read()) != -1){
            System.out.print((char) b);
        }
    }
}
