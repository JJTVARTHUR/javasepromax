package d6_static_singleinstance;

/**

 饿汉单例设计模式：

 在用类获取对象的时候，对象已经提前为你创建好了。

 设计步骤：
 1. 定义一个类，把构造器私有。
 2. 定义一个静态变量存储一个对象。

 */

public class SingleInstance1 {

    /**

     2. 饿汉单例是在获取对象前，对象已经提前准备好了一个。
     这个对象只能是一个，所以定义静态成员变量记住。

     */

    public static SingleInstance1 instance = new SingleInstance1();

    /**

     1. 必须把构造器私有化.

     */

    private SingleInstance1(){

    }
}
