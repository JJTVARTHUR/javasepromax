package d14_extends_this;

/**

 this和super详情：

 1.this：代表本类对象的引用。
 2.super：代表父类存储空间的标识。

 this() 访问本类构造器
 super() 访问父类构造器

 this() 和 super() 使用注意点：
 1.子类通过 this() 去调用本类的其他构造器，本类其他构造器会通过super()去手动调用父类的构造器，最终还是会调用父类构造器的。
 2.注意：this()，super() 都只能放在构造器的第一行，所以二者不能共存在同一个构造器中。

 */

public class Test {
    public static void main(String[] args) {
        // 理解this()的作用：本类构造器中访问本类兄弟构造器
        Student s1 = new Student("王亮","清华大学");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        /**
         如果学生不填写学校，默认这个对象的学校是黑马
         */
        Student s2 = new Student("王超");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());
    }
}
