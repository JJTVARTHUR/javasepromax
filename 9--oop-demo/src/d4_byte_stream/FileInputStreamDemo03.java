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


       目标：使用文件字节输入流一次读完文件的全部字节。可以解决乱码问题。
       方式一：自己定义一个字节数组与文件大小一样大，然后使用读取字节数组的方法，一次性读取完成
          - public int read(byte[] buffer): 每次读取一个字节数组返回，如果字节已经没有可读的返回-1

       方式二：官方为字节输入流InputStream提供了如下API可以直接把文件的全部数据读取到一个字节数组中
          - public byte[] readAllBytes() throws IOException: 直接将当前字节输入流对应的文件对象的字节数据装到
                                                             一个字节数组返回
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个文件字节输入流管道与源文件接通
        File f = new File("9--oop-demo/src/data03.txt");
        InputStream is = new FileInputStream(f);

        // 方式一：自己定义一个字节数组与文件大小一样大，然后使用读取字节数组的方法，一次性读取完成
        // 2. 定义一个字节数组与文件的大小刚刚一样大
//        byte[] buffer = new byte[(int) f.length()];
//        int len = is.read(buffer);
//        System.out.println("读取了多少个字节：" + len);
//        System.out.println("文件大小：" + f.length());
//        System.out.println(new String(buffer));

        // 方式二：官方为字节输入流InputStream提供了如下API可以直接把文件的全部数据读取到一个字节数组中
        // 读取全部字节数组
        byte[] buffer = is.readAllBytes();
        System.out.println(new String(buffer));
    }
}
