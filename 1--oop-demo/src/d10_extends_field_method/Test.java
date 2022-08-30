package d10_extends_field_method;

/**

 在子类方法中访问成员(成员变量，成员方法) 满足：就近原则
 1.先子类局部范围找
 2.然后子类成员范围找
 3.然后父类成员范围找，如果父类范围还没有找到则报错

 如果子父类中，出现了重名的成员，会优先使用子类的，如果一定要在子类中使用父类的
 可以通过super关键字，指定访问父类的成员

 格式：super.父类成员变量/父类成员方法

 */

public class Test {
    public static void main(String[] args) {
        // 继承后成员的访问特点：就近原则
        Dog d = new Dog();
        d.run(); // 子类的
        d.lookDoor(); // 子类的
        d.showName();
    }
}

class Animal{
    public String name = "动物名";

    public void run(){
        System.out.println("动物可以跑");
    }
}

class Dog extends Animal{
    public String name = "狗名";

    public void lookDoor(){
        System.out.println("狗可以看门");
    }

    public void showName(){
        String name = "局部名";
        System.out.println(name);
        System.out.println(this.name); // 当前子类对象的name
        System.out.println(super.name); // 当前父类对象的name

        super.run(); // 找父类的方法
        run(); // 子类的run
    }

    public void run(){
        System.out.println("狗跑的贼快");
    }
}
