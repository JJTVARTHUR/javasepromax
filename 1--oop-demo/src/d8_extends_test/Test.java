package d8_extends_test;

import com.sun.security.jgss.GSSUtil;

public class Test {
    public static void main(String[] args) {
        // 理解继承的设计思想
        Student s = new Student();
        Teacher t = new Teacher();
        s.setName("张三"); // 父类的
        s.setAge(15); // 父类的
        System.out.println(s.getName()); // 父类的
        System.out.println(s.getAge()); // 父类的
        s.queryCourse(); // 父类的
        s.setClassName("5"); // 子类的
        System.out.println(s.getClassName()); // 子类的
        s.writeInfo();  // 子类的

        t.setName("李四"); // 父类的
        t.setAge(42); // 父类的
        System.out.println(t.getName()); // 父类的
        System.out.println(t.getAge()); // 父类的
        t.findClass(); // 子类的
        t.queryCourse(); // 父类的
    }
}
