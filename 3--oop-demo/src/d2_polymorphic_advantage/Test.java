package d2_polymorphic_advantage;

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

 多态的优势：
 1.在多态形式下，右边对象可以实现解耦合，便于拓展和维护。
 Animal a = new Dog();
 a.run();  // 后续业务行为随对象而变，后续代码无需修改。
 2.定义方法的时候，使用父类型作为参数，该方法就可以接收这父类的一切子类对象，体现出多态的扩展性与便利。

 多态下会产生的一个问题：
 1.多态下不能使用子类的独有功能

 */

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        go(a);
        // a.lookDoor(); // 多态下不能访问子类独有功能

        Animal a2 = new Tortoise();
        go(a2);
    }

    /**
     要求：所以的动物都可以进来比赛
     */
    public static void go(Animal a){
        System.out.println("开始...");
        a.run();
        System.out.println("结束...");
    }
}
