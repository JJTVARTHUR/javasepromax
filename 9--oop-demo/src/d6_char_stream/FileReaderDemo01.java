package d6_char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/**
       字符输入流:

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

        FileReader:文件字符输入流。
           -- 作用：以内存为基准，把磁盘文件中的数据以字符的形式读取到内存中去。
                   简单来说，读取文本文件内容到内存中去。

           -- 构造器：
              public FileReader(File file): 创建一个字符输入流与源文件对象接通。
              public FileReader(String filePath): 创建一个字符输入流与源文件路径接通。

           -- 方法：
              public int read(): 每次读取一个字符返回，如果字符已经没有可读的返回-1
              public int read(char[] buffer): 每次读取一个字符数组，返回读取的字符个数，如果字符已经没有可读的返回-1
        小结：
              字符流一个一个字符的读取文本内容输出，可以解决中文读取输出乱码的问题。(前提是文件编码要一致)
              字符流很适合操作文本文件内容。
              但是：一个一个字符的读取文本内容性能较差！！
 */
public class FileReaderDemo01 {
    public static void main(String[] args) throws Exception {
        // 目标：每次读取一个字符
        // 1. 创建一个字符输入流管道与源文件接通
        Reader fr = new FileReader("9--oop-demo/src/data06.txt");

        // 2. 读取一个字符返回，没有可读的字符了返回-1
//        int code = fr.read();
//        System.out.print((char)code);
//
//        int code1 = fr.read();
//        System.out.print((char)code1);

        // 3. 使用循环读取字符
        int code;
        while((code = fr.read()) != -1){
            System.out.print((char) code);
        }
    }
}
