package d8_innerclass_anonymous;

/**

 内部类：
 1.内部类就是定义在一个类里面的类，里面的类可以理解成(寄生),外部类可以理解成(宿主)。
 public class People{
 // 内部类
 public class Heart{
 }
 }

 内部类的使用场景，作用：
 1.当一个事物的内部，还有一个部分需要一个完整的结构进行描述，而这个内部的完整的结构又只为
 外部事物提供服务，那么整个内部的完整结构可以选择使用内部类来设计。
 2.内部类通常可以方便访问外部类的成员，包括私有的成员。
 3.内部类提供了更好的封装性，内部类本身就可以用private protected等修饰，封装性可以做更多控制。

 内部类的分类：
 1.静态内部类 (了解)
 2.成员内部类 (非静态内部类) (了解)
 3.局部内部类 (了解)
 4.匿名内部类 (重点)

 匿名内部类：
 1.本质上是一个没有名字的局部内部类，定义在方法中，代码块中，等。
 2.作用：方便创建子类对象，最终目的为了简化代码编写。

 匿名内部类的格式：                     Employee a = new Employee() {
 new 类|抽象类名|或者接口名(){              public void work() {
     重写方法;                            }
 };                                  };
                                     a.work();

 匿名内部类的特点总结：
 1.匿名内部类是一个没有名字的内部类。
 2.匿名内部类写出来就会产生一个匿名内部类的对象
 3.匿名内部类的对象类型相当于是当前new的那个的类型的子类类型

 */

public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑得快！");
            }
        };
        a.run();
    }
}

//class Tiger extends Animal{
//    @Override
//    public void run() {
//        System.out.println("老虎跑得快！");
//    }
//}

abstract class Animal{
    public abstract void run();
}
