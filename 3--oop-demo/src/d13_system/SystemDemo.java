package d13_system;

import java.util.Arrays;

/**

 System类：
 1.System的功能是通用的，都是直接用类名调用即可，所以System不能被实例化。

 System类的常用方法：
                  方法名                                        说明
 public static void exit(int status)                终止当前运行的java虚拟机，非零表示异常终止
 public static long currentTimeMillis()             返回当前系统的时间毫秒值形式
 public static void arraycopy                       数组拷贝
 (数组源数组，起始索引，目的地数组，起始索引，拷贝个数)

 */

public class SystemDemo {
    public static void main(String[] args) {
        System.out.println("程序开始...");

        // System.exit(0); // JVM终止！ java虚拟机直接终止

        // 2. 计算机认为时间有起源：返回1970-1-1 00：00：00 走到此刻的总的毫秒值：时间毫秒值。
        long time = System.currentTimeMillis();
        System.out.println(time);

        // 进行时间的运算：性能分析
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
        }
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime)/1000.0 + "s");

        // 3. 做数组拷贝（了解）

        /**

         arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
         参数一： 被拷贝的数组
         参数二： 从哪个索引位置开始拷贝
         参数三： 复制的目标数组
         参数四： 粘贴位置
         参数五： 拷贝元素的个数

         */

        int[] arr1 = {10,20,30,40,50,60,70};
        int[] arr2 = new int[6]; // [0,0,0,0,0,0] ==> [0,0,40,50,60,0]
        System.arraycopy(arr1,3,arr2,2,3);
        System.out.println(Arrays.toString(arr2));

        System.out.println("程序结束...");

    }
}
