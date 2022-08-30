package d3_static_attention;

/**

 static访问注意事项：
 1.静态方法只能访问静态的成员，不可以直接访问实例成员变量和方法。
 2.实例方法可以访问静态的成员，也可以访问实例成员。
 3.静态方法中是不可以出现this关键字的。

 */
public class Test {

    /**
     静态成员
     */
    public static int onlineNumber = 10;
    public static void test2(){
        System.out.println("==test2==");
    }

    /**
     实例成员
     */
    private String name;
    public void run(){
        System.out.println(name + "跑得快~~");
    }

    // 3. 静态方法中不可以出现this关键字
    public static void test3(){
        // System.out.println(this); // this只能代表当前对象！！
    }

    // 2. 实例方法可以访问静态成员，也可以访问实例成员
    public void go(){
        System.out.println(Test.onlineNumber);
        System.out.println(onlineNumber);
        test2();
        System.out.println(name);
        System.out.println(this);
        run();
    }

    // 1. 静态方法只能访问静态成员，不能“直接”访问实例成员变量和方法
    public static void test1(){
        System.out.println(Test.onlineNumber);
        System.out.println(onlineNumber);
        test2();
        // System.out.println(name); // 不能直接访问实例成员变量
        // run(); // 不能直接访问实例成员方法
    }

    public static void main(String[] args) {

    }
}
