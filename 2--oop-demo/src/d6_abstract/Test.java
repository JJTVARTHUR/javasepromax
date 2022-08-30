package d6_abstract;

/**

 抽象类：
 1.在java中abstract是抽象的意思，可以修饰类，成员方法。
 2.abstract修饰类，这个类就是抽象类；修饰方法，这个方法就是抽象方法。

 抽象类格式：

 修饰符 abstract class 类名{
         修饰符 abstract 返回值类型 方法名称(形参列表);
 }

 public abstract class Animal{
     public abstract void run()；
 }

 注意事项：
 1.抽象方法只能方法签名，不能声明方法体{}
 2.一个类中如果定义了抽象方法，这个类必须声明成抽象类，否则报错
 3.一个类如果继承了抽象类，那么这个类必须重写完抽象类的全部抽象方法，
 否则这个类也必须定义成抽象类。

 抽象类的使用场景：
 1.抽象类可以理解成不完整的设计图，一般作为父类，让子类来继承。
 2.当父类知道子类一定要完成某些行为，但是每个子类该行为的实现又不同，于是该父类就把该行为定义成抽象方法的形式，
 具体实现交给子类去完成。此时这个类就可以声明成抽象类。

 public abstract class Animal{
     public abstract void run();
 }

 */
public class Test {
    public static void main(String[] args) {
        // 先认识抽象类，再了解它的使用场景。
        Dog d = new Dog();
        d.run();
    }
}
