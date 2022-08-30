package d2_modifier;

/**

 权限修饰符：
 1.权限修饰符：是用来控制一个成员能够被访问的范围。
 2.可以修饰成员变量，方法，构造器，内部类，不同权限修饰符修饰的成员能够被访问的范围将受到限制。

 权限修饰符的分类和具体作用范围：
 权限修饰符：有四种作用范围由小到大 ( private > 缺省 > protected > public )

 */

public class Fu {

    /**
     1. 定义私有的成员： private 只能在本类中访问。
     */
    private void privateMethod(){
        System.out.println("---private---");
    }

    /**
     2. 定义缺省修饰的成员： 只能在本类中，同包下其他类访问 (包访问权限)
     */
    void method(){
        System.out.println("---缺省---");
    }

    /**
     3. protected修饰的方法：本类，同包的其他类中，其他包的子类中。
     */
    protected void protectedMethod(){
        System.out.println("---protected---");
    }

    /**
     4. public修饰的方法：本类，同包的其他类中，其他包的子类中，其他包的无关类中
     */
    public void publicMethod(){
        System.out.println("---public---");
    }

    public static void main(String[] args) {
        Fu f = new Fu();
        f.privateMethod();
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
