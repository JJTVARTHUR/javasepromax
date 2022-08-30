package d7_innerclass;

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

 局部内部类：
 1.局部内部类放在方法，代码块，构造器等执行体中。
 2.局部内部类的类文件名为：外部类 内部类.class

 */

public class Test {
    /**
     目标：了解局部内部类的语法
     */
    static {
        class Dog{

        }

        abstract class Animal{

        }

        interface SportManInter{

        }
    }

    public static void main(String[] args) {
        class Cat{
            private String name;

            public static int onLineNumber = 100;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        interface SportManInter{

        }

        Cat c = new Cat();
        c.setName("叮当猫~");
        System.out.println(c.getName());
    }
}

