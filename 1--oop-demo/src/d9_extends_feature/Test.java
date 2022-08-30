package d9_extends_feature;

/**

 继承的特点：
 1.子类可以继承父类的属性和行为，但是子类不能继承父类的的构造器
 2.java是单继承模式：一个类只能继承一个父类
 3.java不支持多继承，但是支持多层继承
 4.java中所有的类都是Object类的子类

 5.子类可以继承父类的私有成员，只是不能直接访问
 6.子类不可以继承父类的静态成员，只是共享的

 */

public class Test {
    public static void main(String[] args) {
        // 理解继承的特点：
        // 1. 子类不能继承父类的构造器
        // 2. 子类可以继承父类的私有成员，只是不能直接访问
        Tiger t = new Tiger();
        // t.eat();
        // 3. 子类不可以继承父类的静态成员，只是共享的
        System.out.println(Tiger.location);
    }
}

class Animal{
    private void eat(){
        System.out.println("动物要吃东西");
    }
    public static String location = "长隆动物园";
}

class Tiger extends Animal{

}

