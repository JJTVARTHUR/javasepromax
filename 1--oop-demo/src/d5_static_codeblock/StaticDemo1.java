package d5_static_codeblock;

/**

 代码块概述：
 在java类下，使用 {} 括起来的代码被称为代码块

 代码块分为
   静态代码块：
        格式：static{}
        特点：需要通过static关键字修饰，随着类的加载而加载，并且自动触发，只执行一次
        使用场景：在类加载的时候做一些静态数据初始化的操作，以便后续使用。

   构造代码块：
        格式：{}
        特点：每次创建对象，调用构造器执行时，都会执行该代码块中的代码，并且在构造器执行前执行
        使用场景：初始化实例资源

 */
public class StaticDemo1 {

    public static String schoolName;

    /**
     静态代码块：

     特点：与类一起加载，自动触发一次，优先执行
     作用：可以在程序加载时进行静态数据的初始化操作（准备内容）
     */
    static{
        System.out.println("==静态代码块被触发执行==");
        schoolName = "黑马";
    }

    public static void main(String[] args) {
        // 目标：学习静态代码块的特点、基本作用
        System.out.println("=========main方法被执行输出===========");
        System.out.println(schoolName);
    }
}
