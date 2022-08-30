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

public class StaticDemo2 {

    private String name;

    public StaticDemo2(){
        System.out.println("===无参构造器被触发执行===");
    }

    /**
     构造代码块：无static修饰，属于对象，每次构建对象时，都会触发一次执行
     初始化实例资源
     */
    {
        name = "张三";
        System.out.println("===构造代码块被触发执行===");
    }

    public static void main(String[] args) {
        // 理解构造代码块
        StaticDemo2 s1 = new StaticDemo2();
        System.out.println(s1.name);

        StaticDemo2 s2 = new StaticDemo2();
        System.out.println(s2.name);
    }
}
