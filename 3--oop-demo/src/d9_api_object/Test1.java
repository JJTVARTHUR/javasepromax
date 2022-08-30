package d9_api_object;

/**

 Object类的作用：
 1.一个类要么默认继承了Object类，要么间接继承了Object类，Object类是java中的祖宗类。
 2.Object类的方法是一切子类都可以直接使用的，所以我们要学习Object类的方法。

 Object类的常用方法：
       方法名：                                说明：
 public String toString()           默认是返回当前对象在堆内存中的地址信息：类的全限名@内存地址
 public Boolean equals(Object o)    默认是比较当前对象与另一个对象的地址是否相同，相同返回true，不同返回false

 Object的toString方法：
       方法名：                                说明：
 public String toString()           默认是返回当前对象在堆内存中的地址信息：类的全限名@内存地址

 问题引出：
 1.开发中直接输出对象，默认输出对象的地址其实是毫无意义的。
 2.开发中输出对象变量，更多的时候是希望看到对象的内容数据而不是对象的地址信息

 toString的意义：
 1.父类toString()方法存在的意义就是为了被子类重写，以便返回对象的内容信息，而不是地址信息！！

 */

public class Test1 {
    /**
     掌握Object类中toString方法的使用。
     */
    public static void main(String[] args) {
        Student s = new Student("周雄",'男',19);
        // String rs = s.toString();
        // System.out.println(rs);

        System.out.println(s.toString());

        // 直接输出对象变量，默认可以省略toString调用不写的
        System.out.println(s);
    }
}
