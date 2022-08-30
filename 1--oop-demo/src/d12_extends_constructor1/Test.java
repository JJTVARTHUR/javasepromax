package d12_extends_constructor1;

/**

 子类继承父类后构造器的特点：
 1.子类中所有的构造器默认都会先访问父类中无参的构造器，再执行自己。

 原因：
 1.子类在初始化的时候，有可能会使用到父类中的数据，如果父类没有完成初始化，子类将无法使用父类的数据。
 2.子类初始化之前，一定要调用父类构造器先完成父类数据空间的初始化。

 调用父类构造器：
 1.子类构造器的第一行语句默认都是：super()，不写也存在。

 */

public class Test {
    public static void main(String[] args) {
        // 继承后子类构造器的特点：
        // 特点：子类的全部构造器默认会先访问父类的无参数构造器再执行自己
        Dog d1 = new Dog();
        System.out.println(d1);

        System.out.println("------------------");

        Dog d2 = new Dog("金毛");
        System.out.println(d2);
    }
}
