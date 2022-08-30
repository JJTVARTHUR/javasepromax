package d1_file;

import java.io.File;
import java.text.SimpleDateFormat;

/**
      File类的判断文件类型，获取文件信息功能:
        - public boolean isDirectory(): 测试此抽象路径名表示的File是否为文件夹
        - public boolean isFile(): 测试此抽象路径名表示的File是否为文件
        - public boolean exists(): 测试此抽象路径名表示的File是否存在
        - public String getAbsolutePath(): 返回此抽象路径名的绝对路径名字符串
        - public String getPath(): 将此抽象路径名转换为路径名字符串
        - public String getName(): 返回由此抽象路径名表示的文件或文件夹的名称
        - public long lastModified(): 返回文件最后修改的时间毫秒值
 */
public class FileDemo02 {
    public static void main(String[] args) {
        // 1. 绝对路径创建一个文件对象
        File f1 = new File("E:\\Java\\code\\javasepromax\\preview.jpg");
        // a. 获取它的绝对路径
        System.out.println(f1.getAbsolutePath());
        // b. 获取文件定义的时候使用的路径
        System.out.println(f1.getPath());
        // c. 获取文件的名称：带后缀
        System.out.println(f1.getName());
        // d. 获取文件的大小：字节个数
        System.out.println(f1.length()); // 字节大小
        // e. 获取文件的最后修改时间
        long time = f1.lastModified();
        System.out.println("最后修改时间：" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
        // f. 判断文件是文件还是文件夹
        System.out.println(f1.isFile()); // true
        System.out.println(f1.isDirectory()); // false

        System.out.println("--------------------------");

        File f2 = new File("9--oop-demo\\src\\data.txt");
        // a. 获取它的绝对路径
        System.out.println(f2.getAbsolutePath());
        // b. 获取文件定义的时候使用的路径
        System.out.println(f2.getPath());
        // c. 获取文件的名称：带后缀
        System.out.println(f2.getName());
        // d. 获取文件的大小：字节个数
        System.out.println(f2.length()); // 字节大小
        // e. 获取文件的最后修改时间
        long time1 = f2.lastModified();
        System.out.println("最后修改时间：" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time1));
        // f. 判断文件是文件还是文件夹
        System.out.println(f2.isFile()); // true
        System.out.println(f2.isDirectory()); // false
        System.out.println(f2.exists()); // true

        File file = new File("D:/");
        System.out.println(file.isFile()); // false
        System.out.println(file.isDirectory()); // true
        System.out.println(file.exists()); // true

        File file1 = new File("D://aaa");
        System.out.println(file1.isFile()); // false
        System.out.println(file1.isDirectory()); // false
        System.out.println(file1.exists()); // false
    }
}
