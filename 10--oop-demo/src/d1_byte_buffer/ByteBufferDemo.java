package d1_byte_buffer;

import java.io.*;

/**
       缓冲流概述:
       1. 缓冲流也称为高效流，或者高级流。之前学习的字节流可以称为原始流
       2. 作用：缓冲流自带缓冲区，可以提高原始字节流，字符流读写数据的性能
       3. 字节缓冲输入流自带了8KB缓冲池，以后我们之间从缓冲池读取数据，所以性能较好
       4. 字节缓冲输出流自带了8KB缓冲池，数据就直接写入到缓冲池中去，写数据性能极高了

       IO流的体系:
                                         字节流                                   字符流
                           字节输入流            字节输出流               字符输入流        字符输出流
       (抽象类)             InputStream          OutputStream           Reader           Writer
       (实现类，可以使用的)   FileInputStream      FileOutputStream       FileReader       FileWriter
       (实现类，可以使用的)   BufferedInputStream  BufferedOutputStream   BufferedReader   BufferedWriter
                                  |                     |                    |                 |
                           字节缓冲输入流            字节缓冲输出流         字符缓冲输入流       字符缓冲输出流

       字节缓冲流:
       1. 字节缓冲输入流：BufferedInputStream，提高字节输入流读取数据的性能，读写功能上并无变化
       2. 字节缓冲输出流：BufferedOutputStream，提高字节输出流读取数据的性能，读写功能上并无变化
         -- 构造器：
            public BufferedInputStream(InputStream is): 可以把低级的字节输入流包装成一个高级的缓冲字节输入流管道，
                                                        从而提高字节输入流读数据的性能
            public BufferedOutputStream(OutputStream os): 可以把低级的字节输出流包装成一个高级的缓冲字节输出流，
                                                          从而提高写数据的性能
 */
public class ByteBufferDemo {
    public static void main(String[] args) {
        try (
                // 1. 创建一个字节输入流管道与原文本文件接通
                InputStream is = new FileInputStream("10--oop-demo/src/out01.txt");
                // a. 把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);
                // 2. 创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("10--oop-demo/src/out02.txt");
                // b. 把字节输出流管道包装成高级的缓冲字节输出流管道
                OutputStream bos = new BufferedOutputStream(os);
        ) {
            // 3. 定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成了！");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
