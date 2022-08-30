package d3_polymorphic_convert;

/**

 多态形势下的类中转换机制:

 自动类型转换(从子到父)：
 1. 子类对象赋值给父类类型的变量指向。

 强制类型转换(从父到子)：
 1. 此时必须进行强制类型转换：子类 对象变量 = (子类)父类类型的变量。
 2. 作用：可以解决多态下的劣势，可以实现调用子类独有的功能。
 3. 注意：如果转型后的类型和对象真实类型不是同一种类型，那么在转换的时候就会出现 ClassCastException
 Animal t = new Tortoise();
 Dog d = (Dog)t; // 出现异常 ClassCastException

 4. 注意：有继承关系 / 实现的两个类型就可以进行强制转换，编译无问题。

 java建议强制转换前使用instanceof判断当前对象的真实类型，再进行强制转换
 变量名 instanceof 真实类型
 判断关键字左边的变量指向的对象的真实类型，是否是右边的类型或者是其子类类型，是则返回true，反之返回false。

 */

public class Test {
    public static void main(String[] args) {
        // 自动类型转换：
        Animal a = new Dog();
        a.run();

        // 强制类型转换：
        Animal a2 = new Tortoise();
        a2.run();

        // Dog d = (Dog) a2; // 强制类型转换：编译阶段不报错的(注意：有继承或者实现关系编译阶段可以强制，没有毛病)，运行时可能出错！
        if(a2 instanceof Tortoise){
            Tortoise t = (Tortoise) a2; // 从父类类型到子类类型：必须强制转换类型
            t.layEggs();
        }else if(a2 instanceof Dog){
            Dog d = new Dog();
            d.lookDoor();
        }

        System.out.println("-----------------------");
        go(new Dog());
        go(new Tortoise());
    }

    public static void go(Animal a){
        a.run();
        // a 到底是乌龟，还是狗
        if(a instanceof Tortoise){
            Tortoise t = (Tortoise) a; // 从父类类型到子类类型：必须强制转换类型
            t.layEggs();
        }else if(a instanceof Dog){
            Dog d = new Dog();
            d.lookDoor();
        }
    }
}
