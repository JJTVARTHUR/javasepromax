package d6_char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
      字符输出流:

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

      FileWriter文件字符输出流的使用。
          -- 作用：以内存为基准，把内存中的数据按照字符的形式写出到磁盘文件中去。
                  简单来说，就是把内存的数据以字符写出到文件中去。
          -- 构造器：
             public FileWriter(File file): 创建字符输出流管道与源文件对象接通
             public FileWriter(String filePath): 创建字符输出流管道与源文件路径接通
             public FileWriter(File file,boolean append): 创建字符输出流管道与源文件对象接通，可追加数据
             public FileWriter(String filePath,boolean append): 创建字符输出流管道与源文件路径接通，可追加数据
          -- 方法：
             public void write(int c): 写一个字符
             public void write(String c): 写一个字符串
             public void write(char[] buffer): 写一个字符数组
             public void write(String c ,int pos ,int len): 写字符串的一部分
             public void write(char[] buffer ,int pos ,int len): 写字符数组的一部分
             flush(): 刷新流，还可以继续写数据
             close(): 关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据

      小结：
          字符输出流可以写字符数据出去，总共有5个方法写字符。
          覆盖管道：
                 Writer fw = new FileWriter("Day10Demo/src/dlei03.txt"); // 覆盖数据管道
          追加数据管道：
                 Writer fw = new FileWriter("Day10Demo/src/dlei03.txt",true); // 追加数据管道
          换行：
                 fw.write("\r\n"); // 换行
          结论：
          1. 字节流适合做一切文件数据的拷贝(音视频，文本)
          2. 字节流不适合读取中文内容输出
          3. 字符流适合做文本文件的操作(读，写)
 */
public class FileReaderDemo03 {
    public static void main(String[] args) throws Exception {
        // 1. 创建一个字符输出流管道与目标文件接通
        // Writer fw = new FileWriter("9--oop-demo/src/out08.txt"); // 覆盖管道，每次启动都会清空文件之前的数据
        Writer fw = new FileWriter("9--oop-demo/src/out08.txt" , true); // 追加管道，每次启动都不会清空原来的数据，会在原来的基础上追加数据

        // public void write(int c): 写一个字符
        fw.write(98);
        fw.write('a');
        fw.write('徐'); // 不会出问题了
        fw.write("\r\n"); //换行

        // public void write(String c): 写一个字符串出去
        fw.write("abc我是中国人");
        fw.write("\r\n"); // 换行

        // public void write(char[] buffer): 写一个字符数组
        char[] chars = "abc我是中国人".toCharArray();
        fw.write(chars);
        fw.write("\r\n"); // 换行

        // public void write(String c , int pos , int len): 字符串的一部分
        fw.write("abc我是中国人" , 0 ,5);
        fw.write("\r\n"); // 换行

        // public void write(char[] buffer , int pos , int len): 写字符数组的一部分
        fw.write(chars , 3 ,5);
        fw.write("\r\n"); // 换行

        fw.flush(); // 刷新后流可以继续使用
        fw.close(); // 关闭包含刷新，关闭后流不能使用
    }
}
