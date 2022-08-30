package d1_file;

import java.io.File;

/**
      File类概述:
      1. File类在包java.io.File下，代表操作系统的文件对象(文件，文件夹)
      2. File类提供了诸如：定位文件，获取文件本身的信息，删除文件，创建文件(文件夹)等功能，但不能读写文件内容

      File类创建对象:
        - public File(String pathname): 根据文件路径创建文件对象
        - public File(String parent , String child): 从父路径名字符串和子路径名字符串创建文件对象
        - public File(File parent , String child): 根据父路径对应文件对象和子路径名字符串创建文件对象

      1. File对象可以定位文件和文件夹
      2. File封装的对象仅仅是一个路径名，这个路径可以是存在的，也可以是不存在的

      绝对路径和相对路径:
      1. 绝对路径：从盘符开始
        - File file1 = new File("D:\\itheima\\a.txt");
      2. 相对路径：不带盘符，默认直接到当前工程下的目录寻找文件
        - File file2 = new File("模块名\\a.txt")
 */
public class FileDemo01 {
    public static void main(String[] args) {
        // 1. 创建File对象(指定了文件的路径)
        // 路径写法： D:\resources\xueshan.jpeg
        //           D:/resources/xueshan.jpeg
        //           File.separator
        // File f = new File("E:\\Java\\code\\javasepromax\\preview.jpg");
        // File f = new File("E:/Java/code/javasepromax/preview.jpg");
        File f = new File("E:" + File.separator + "Java" + File.separator + "code"
        + File.separator + "javasepromax" + File.separator + "preview.jpg");
        long size = f.length(); // 是文件的字节大小
        System.out.println(size);

        // 2. File创建对象，支持绝对路径 支持相对路径(重点)
        File f1 = new File("E:\\Java\\code\\javasepromax\\preview.jpg"); // 绝对路径
        System.out.println(f1.length());

        // 相对路径：一般定位模块中的文件中。 相对到工程下！！！
        File f2 = new File("9--oop-demo/src/data.txt");
        System.out.println(f2.length());

        // 3. File创建对象，也可以是文件也可以是文件夹
        File f3 = new File("E:\\Java\\code");
        System.out.println(f3.exists()); // 判断这个路径是否存在，这个文件夹是否存在
    }
}
