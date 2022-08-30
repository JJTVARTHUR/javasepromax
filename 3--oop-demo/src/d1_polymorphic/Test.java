package d1_polymorphic;

/**

 多态：
 1.同类型的对象，执行同一行为，会表现出不同的行为特征。

 多态的常见形式：
 1. 父类类型 对象名称 = new 子类构造器;
 2. 接口 对象名称 = new 实现类构造器;

 多态中成员访问特点：
 1.方法调用：编译看左边，运行看右边。
 2.变量调用：编译看左边，运行也看左边。(多态侧重行为多态)

 多态的前提：
 1.有继承 / 实现关系；有父类引用指向子类对象；有方法重写。

 */

public class Test {
    public static void main(String[] args) {
        // 1. 多态的形式:  父类类型 对象名称 = new 子类构造器;
        Animal a = new Dog();
        a.run(); // 方法：编译看左边，运行看右边
        System.out.println(a.name); // 对于变量的调用：编译看左，运行也看左

        Animal a2 = new Tortoise();
        a2.run(); // 编译看左边，运行看右边
        System.out.println(a2.name);
    }
}
