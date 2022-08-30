package d13_extends_constructor2;

/**

 子类继承父类后构造器的特点：

 super调用父类有参数构造器的作用：
 1.初始化继承自父类的数据。

 如果父类中没有无参数构造器，只有有参构造器，会出现的现象：
 1.会报错.因为子类默认是调用父类无参构造器的。

 解决方案：
 子类构造器中可以通过书写super()，手动调用父类的有参数构造器。

 */


public class Test {
    public static void main(String[] args) {
        // 子类构造器如何去访问父类有参数构造器，并清楚其作用。
        Teacher t = new Teacher("dlei",18);
        System.out.println(t.getName());
        System.out.println(t.getAge());
    }
}
