package d11_api_stringbuilder;

/**

 StringBuilder概述：
 1.StringBuilder是一个可变的字符串类，我们可以把它看成是一个对象容器
 2.作用：提高字符串的操作效率，如拼接，修改等。

 StringBuilder构造器：
             名称                             说明
 public StringBuilder()                创建一个空白的可变的字符串对象，不包含任何内容
 public StringBuilder(String str)      创建一个指定字符串内容的可变字符串对象

 StringBuilder常用方法：
               方法名称                                  说明
 public StringBuilder append(任意类型)          添加数据并返回StringBuilder对象本身
 public StringBuilder reverse()                将对象的内容反转
 public int length()                           返回对象内容长度
 public String toString()                      通过toString就可以实现把StringBuilder转换为String

 String 和 StringBuilder的使用特点：
 1.String: 内容是不可变的，拼接字符串性能差
 2.StringBuilder： 内容是可变的，拼接字符串性能好，代码优雅。

 3.定义字符串使用String
 4.拼接，修改等操作字符串使用StringBuilder

 */

public class StringBuilderDemo1 {
    /**
     学会使用StringBuilder操作字符串，最终还需要知道它性能好的原因
     */
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(); // ""
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append(1);
        sb.append(false);
        sb.append(3.3);
        sb.append("abc");
        sb.append(sb);

        StringBuilder sb1 = new StringBuilder();
        // 支持链式编程
        sb1.append("a").append("b").append("c").append("我爱你中国");
        System.out.println(sb1);

        // 反转
        sb1.reverse().append("110");
        System.out.println(sb1);

        System.out.println(sb1.length());

        // 注意：StringBuilder只是拼接字符串的手段：效率好。
        // 最终的目的还是要恢复成String类型。
        StringBuilder sb2 = new StringBuilder();
        sb2.append("123").append("456");
        // 恢复成String类型
        String rs = sb2.toString();
        check(rs);

    }

    public static void check(String data){
        System.out.println(data);
    }
}
