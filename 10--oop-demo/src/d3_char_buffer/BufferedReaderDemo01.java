package d3_char_buffer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

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

       字符缓冲输入流:
       1. 字符缓冲输入流：BufferedReader
       2. 作用：提高字符输入流读取数据的性能，除此之外多了按照行读取数据的功能
       -- 构造器：
       public BufferedReader(Reader r): 可以把低级的字符输入流包装成一个高级的缓冲字符输入流管道，
                                        从而提高字符输入流读数据的性能
       -- 字符缓冲输入流新增功能：
       public String readLine(): 读取一行数据返回，如果读取没有完毕，无行可读返回null
 */

public class BufferedReaderDemo01 {
    public static void main(String[] args) {
        try(
                // 1. 创建一个文件字符输入流与源文件接通
                Reader fr = new FileReader("10--oop-demo/src/data01.txt");
                // a. 把低级的字符输入流包装成高级的缓冲流字符输入流
                BufferedReader br = new BufferedReader(fr);
                ){

            // 2、用循环，每次读取一个字符数组的数据。  1024 + 1024 + 8
//            char[] buffer = new char[1024]; // 1K字符
//            int len;
//            while ((len = br.read(buffer)) != -1) {
//                String rs = new String(buffer, 0, len);
//                System.out.print(rs);
//            }

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
