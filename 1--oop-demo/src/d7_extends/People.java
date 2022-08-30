package d7_extends;

/**

 继承：
 1. java中提供一个关键字extends，用这个关键字，我们可以让一个类和另一个类建立起父子关系。

 public class Student extends People{}

 2. Student称为子类(派生类),People称为父类(基类 或超类).
 3. 作用：当子类继承父类后，就可以直接使用父类公共的属性和方法了

 */

public class People {
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
