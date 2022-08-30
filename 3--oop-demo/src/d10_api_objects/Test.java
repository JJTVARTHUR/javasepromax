package d10_api_objects;

/**

 Object类的概述：
 1.Objects类与Object还是继承关系，Objects类是从JDK 1.7开始之后才有的。
 2.Objects的equals方法比较的结果是一样的，但是更安全。

 Objects的常见方法：
                 方法名：                                              说明：
 public static boolean equals(Object a,Object b)       比较两个对象的，底层会先进行非空判断，从而可以
                                                       避免空指针异常。再进行equals比较
 public static boolean isNull(Object obj)              判断变量是否为null，为null返回true，反之返回false

 源码分析：
 public static boolean equals(Object a,Object b){
      return (a == b) || (a != null && a.equals(b));
 }
 */

import java.util.Objects;

public class Test {
    /**
     掌握objects类的常用方法：equals
     */
    public static void main(String[] args) {
        String s1 = null;
        String s2 = new String("itheima");

        // System.out.println(s1.equals(s2)); // 留下了隐患吗，可能出现空指针异常

        System.out.println(Objects.equals(s1,s2)); // 更安全 结果也是对的！

        /**
            public static boolean equals(Object a,Object b){
                    return (a == b) || (a != null && a.equals(b));
            }
         */

        System.out.println(Objects.isNull(s1)); // true
        System.out.println(s1 == null); // true

        System.out.println(Objects.isNull(s2)); // false
        System.out.println(s2 == null); // false

    }
}
