package d1_file;

import java.io.File;
import java.util.Arrays;

/**
      File类的遍历功能:
        - public String[] list(): 获取当前目录下所有的"一级文件名称"到一个字符串数组中去返回
        - public File[] listFiles() (常用): 获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回(重点)

      listFiles方法注意事项:
      1. 当调用者不存在时，返回null
      2. 当调用者是一个文件时，返回null
      3. 当调用者是一个空文件夹时，返回一个长度为0的数组
      4. 当调用者是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
      5. 当调用者是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏路径
      6. 当调用者是一个需要权限才能进入的文件夹时，返回null
 */
public class FileDemo04 {
    public static void main(String[] args) {
        // 1. 定位一个目录
        File f1 = new File("E:/Java");
        String[] names = f1.list();
        for (String name: names) {
            System.out.println(name);
        }

        // 2. 一级文件对象
        // 获取当前目录下所有的"一级文件对象"到一个文件对象数组中去返回(重点)
        File[] files = f1.listFiles();
        for (File f: files) {
            System.out.println(f.getAbsolutePath());
        }

        // 注意事项
        File dir = new File("D:/resources/ddd");
        File[] files1 = dir.listFiles();
        System.out.println(Arrays.toString(files1));
    }
}
