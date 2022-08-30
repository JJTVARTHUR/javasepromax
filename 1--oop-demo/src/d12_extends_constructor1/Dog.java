package d12_extends_constructor1;

public class Dog extends Animal{
    public Dog(){
        super(); // 默认的，写不写都有，默认就是找父类无参数构造器
        System.out.println("子类Dog无参数构造器被执行");
    }

    public Dog(String name){
        super(); // 默认的，写不写都有，默认就是找父类无参数构造器
        System.out.println("子类Dog有参数构造器被执行");
    }
}
