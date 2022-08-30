package d2_static_method;

/**

 成员方法的分类：
 1.静态成员方法(有static修饰，归属于类),建议用类名访问,也可以用对象访问。
 2.实例成员方法(无static修饰，归属于对象)，只能用对象触发访问。

 使用场景：
 1.表示对象自己的行为的，且方法中需要访问实例成员的，则该方法必须申明成实例方法。
 2.如果该方法是以执行一个共用功能为目的，则可以申明成静态方法

 */

public class Student {
    /**
     实例成员变量：无static修饰，属于对象
     */
    private String name;

    /**
     静态成员方法：有static修饰，归属于类，可以被共享访问，用类名或者对象名都可以访问
     */
    public static int getMax(int age1,int age2){
        return age1 > age2 ? age1 : age2;
    }

    /**
     实例成员方法：属于对象的，只能用对象触发访问
     */
    public void study(){
        System.out.println(name + "在好好学习，天天向上");
    }

    public static void main(String[] args) {
        // 1. 类名.静态成员变量
        System.out.println(Student.getMax(10,3));
        // 注意：同一个类中，访问静态方法，类名可以省略不写。
        System.out.println(getMax(10,32));

        // study(); // 报错了
        // 2. 对象.实例方法
        Student s = new Student();
        s.name = "猪八戒";
        s.study();

        // 3. 对象.静态方法(语法是可行，但是不推荐)
        System.out.println(s.getMax(12,34));
    }
}
