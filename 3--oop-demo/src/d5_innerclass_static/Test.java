package d5_innerclass_static;

/**

 内部类：
 1.内部类就是定义在一个类里面的类，里面的类可以理解成(寄生),外部类可以理解成(宿主)。
 public class People{
      // 内部类
      public class Heart{
      }
 }

 内部类的使用场景，作用：
 1.当一个事物的内部，还有一个部分需要一个完整的结构进行描述，而这个内部的完整的结构又只为
 外部事物提供服务，那么整个内部的完整结构可以选择使用内部类来设计。
 2.内部类通常可以方便访问外部类的成员，包括私有的成员。
 3.内部类提供了更好的封装性，内部类本身就可以用private protected等修饰，封装性可以做更多控制。

 内部类的分类：
 1.静态内部类 (了解)
 2.成员内部类 (非静态内部类) (了解)
 3.局部内部类 (了解)
 4.匿名内部类 (重点)

 静态内部类：
 1.有static修饰，属于外部类本身。
 2.它的特点和使用与普通类是完全一样的，类有的成分它都有，只是位置在别人里面而已。
 public class Outer{
      // 静态成员内部类
      public static class Inner{
      }
 }

 静态内部类创建对象的格式：
 格式：外部类名.内部类名 对象名 = new 外部类名.内部类构造器;
 范例：Outer.Inner in = new Outer.Inner();

 静态内部类的注意事项：
 1.静态内部类可以直接访问外部类的静态成员
 2.静态内部类不可以直接访问外部类的实例成员，
   外部类的实例成员必须用外部类对象访问，及间接访问，在内部类实例化外部类的对象，才可以访问。

 */

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.setName("张三");
        in.show();
    }
}
