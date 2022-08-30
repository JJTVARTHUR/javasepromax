package d6_innerclass;

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

 成员内部类：
 1.无static修饰，属于外部类的对象。
 2.JDK16之前，成员内部类中不能定义静态成员，JDK16开始也可以定义静态成员了。
 public class Outer{
 // 成员内部类
 public class inner{
 }
 }

 成员内部类创建对象的格式：
 格式：外部类名.内部类名 对象名 = new 外部类构造器.new 内部类构造器()；
 范例：Outer.Inner in = new Outer().new Inner();

 成员内部类的注意事项：
 1.成员内部类可以直接访问外部类的静态成员。
 2.成员内部类的实例方法可以直接访问外部类的实例成员，因为必须先有外部类对象，
 才能有成员内部类对象，所以可以直接访问外部类对象的实例成员。

 3.在成员内部类中访问所在外部类对象，格式：外部类名.this

 */


public class Test2 {
    public static void main(String[] args) {
        People.Heart heart = new People().new Heart();
        heart.show();
    }
}

class People{
    private int heartbeat = 150;

    /**
     成员内部类
     */
    public class Heart{
        private int heartbeat = 110;

        public void show(){
            int heartbeat = 78;
            System.out.println(heartbeat); // 78
            System.out.println(this.heartbeat); // 110
            System.out.println(People.this.heartbeat); // 150
        }
    }
}
