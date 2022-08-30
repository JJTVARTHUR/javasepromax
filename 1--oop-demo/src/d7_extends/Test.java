package d7_extends;

/**

 继承：
 1. java中提供一个关键字extends，用这个关键字，我们可以让一个类和另一个类建立起父子关系。

 public class Student extends People{}

 2. Student称为子类(派生类),People称为父类(基类 或超类).
 3. 作用：当子类继承父类后，就可以直接使用父类公共的属性和方法了

 */

public class Test {
    public static void main(String[] args) {
        // 创建子类对象，看是否可以使用父类的属性和行为
        Student s = new Student();
        Teacher t = new Teacher();
        s.setName("西门"); //父类的
        s.setAge(25); // 父类的
        System.out.println(s.getName()); // 父类的
        System.out.println(s.getAge()); // 父类的
        s.study(); // 子类的
        t.teach(); // 子类的
    }
}
