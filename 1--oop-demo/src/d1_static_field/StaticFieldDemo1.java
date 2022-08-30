package d1_static_field;

/**

 static
 1.static是静态的意思，可以修改成员变量和成员方法。
 2.static修饰成员变量表示该成员变量只在内存中只存储一份，可以被共享访问，修改

 成员变量可以分为2类：
 类名.静态成员变量(推荐)
 对象.静态成员变量(不推荐)

 */

public class StaticFieldDemo1 {
    public static void main(String[] args) {
        // static修饰成员变量的作用和访问特点。
        // 1.类名.静态成员变量
        System.out.println(User.onlineNumber);

        // 2.对象.静态成员变量
        User u = new User();
        u.onlineNumber++; // 新来了一个人
        System.out.println(u.onlineNumber);
    }
}
