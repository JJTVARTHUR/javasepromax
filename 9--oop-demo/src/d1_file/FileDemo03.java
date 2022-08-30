package d1_file;

import java.io.File;
import java.io.IOException;

/**
      File类创建文件的功能:
        - public boolean createNewFile(): 创建一个新的空的文件（几乎不用的，因为以后文件都是自动创建的！）
        - public boolean mkdir(): 只能创建一级文件夹（只能创建一级目录）
        - public boolean mkdirs(): 可以创建多级文件夹（建议使用的）

      File类删除文件的功能:
        - public boolean delete(): 删除由此抽象路径名表示的文件或空文件夹（只能删除空目录）

      注意事项:
      1. delete方法直接删除不走回收站；如果删除的是一个文件，无论文件有没有被占用直接删除
      2. delete方法默认只能删除空文件夹
 */
public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        File f = new File("9--oop-demo\\src\\data.txt");
        // a. 创建新文件，创建成功返回true，反之，返回false。很少用，以后文件写出去的时候都会自动创建
        System.out.println(f.createNewFile()); // false
        File f1 = new File("9--oop-demo\\src\\data02.txt");
        System.out.println(f1.createNewFile()); // (几乎不用的，因为以后文件都是自动创建的！)

        // b. mkdir创建一级目录
        File f2 = new File("D:/resources/aaa");
        System.out.println(f2.mkdir());

        // c. mkdirs创建多级目录(重点)
        File f3 = new File("D:/resources/ccc/ddd/eee/ffff");
        System.out.println(f3.mkdir());
        System.out.println(f3.mkdirs()); // 支持多级创建

        // d. 删除文件或者空文件夹
        System.out.println(f1.delete());
        File f4 = new File("D:/resources/data01.txt");
        System.out.println(f4.delete()); // 占用一样可以删除

        // 只能删除空文件夹，不能删除非空文件夹
        File f5 = new File("D:/resources/aaa");
        System.out.println(f5.delete());

    }
}
