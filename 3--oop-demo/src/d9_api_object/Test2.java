package d9_api_object;

import java.util.Objects;

/**

 Object类的作用：
 1.一个类要么默认继承了Object类，要么间接继承了Object类，Object类是java中的祖宗类。
 2.Object类的方法是一切子类都可以直接使用的，所以我们要学习Object类的方法。

 Object类的常用方法：
        方法名：                                说明：
 public String toString()           默认是返回当前对象在堆内存中的地址信息：类的全限名@内存地址
 public Boolean equals(Object o)    默认是比较当前对象与另一个对象的地址是否相同，相同返回true，不同返回false

 Object的equals方法：
 public Boolean equals(Object o)    默认是比较当前对象与另一个对象的地址是否相同，相同返回true，不同返回false

 问题思考：
 1.直接比较两个对象的地址是否相同完全可以用 "==" 代替equals。

 equals存在的意义：
 1.父类equals方法存在的意义就是为了被子类重写，以便子类自己来定制比较规则。

 */

public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("周雄",'男',19);
        Student s2 = new Student("周雄",'男',19);
        // equals默认是比较两个对象的地址是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println(Objects.equals(s1,s2));
    }
}
