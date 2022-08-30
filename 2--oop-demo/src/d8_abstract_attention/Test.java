package d8_abstract_attention;

/**

 抽象类的特征和注意事项：
 1.类有的成员(成员变量，方法，构造器)，抽象类都具备。
 2.抽象类中不一定有抽象方法，有抽象方法的类一定是抽象类。
 3.一个类继承了抽象类必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类。
 4.不能用abstract修饰变量，代码块，构造器。
 5.最重要的特征：得到了抽象方法，失去了创建对象的能力

 final和 abstract的关系：
 1.互斥关系
 2.abstract定义的抽象类作为模板让子类继承，final定义的类不能被继承。
 3.抽象方法定义通用功能让子类重写，final定义的方法子类不能重写。

 */

public class Test {
    public static void main(String[] args) {
        // 理解抽象类的特征和注意事项：
        // 1.类有的东西，抽象类都有。
        // 2.抽象类中可以没有抽象方法，但是有抽象方法的必须是抽象类。
        // 3.一个类继承了抽象类，必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类。

        // 4.抽象类不能创建对象，为什么 ？？？

        // 反证法：假如抽象类可以创建对象。
        // Animal a = new Animal()；
        // a.run(); // run方法连方法体都没有！ 因此抽象类不能创建对象。
    }
}

abstract class Crad{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

abstract class Cat extends Animal{
    @Override
    public void run() {

    }
}

abstract class Animal{
    public abstract void run();
    public abstract void eat();
}
