package d6_char_stream;

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
              字符流按照字符数组循环读取数据，可以解决中文读取输出乱码的问题，而且性能也较好！！
 */
public class FileReaderDemo02 {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个字符输入流管道与源文件接通
        Reader fr = new FileReader("9--oop-demo/src/data07.txt");

        // 2. 用循环，每次读取一个字符数组的数据。  1024 + 1024 + 8
        char[] buffer = new char[1024]; // 1K字符
        int len;
        while((len = fr.read(buffer)) != -1){
            String rs = new String(buffer , 0 , len);
            System.out.print(rs);
        }
    }
}
