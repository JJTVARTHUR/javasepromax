package d13_interface_jdk8;

/**

 接口新增方法：(JDK 8开始后)
 1.默认方法：default修饰，实现类对象调用。
 2.静态方法：static修饰，必须用当前接口名调用。
 3.私有方法：private修饰，jdk 9开始才有的，只能在接口内部被调用。
 4.他们都会默认被public修饰。

 5.JDK8新增的3种方法我们自己在开发中很少使用，通常是java源码涉及到。
 现阶段需要理解，识别语法，明白调用关系即可。

 */

public interface SportManInter {

    /**
     1. JDk 8开始： 默认方法(实例方法)
       -- 必须default修饰，默认用public修饰
       -- 默认方法，接口不能创建对象，这个方法只能过继了实现类，由实现类的对象调用。
     */
    default void run(){
        go();
        System.out.println("跑得很快~~");
    }

    /**
     2. 静态方法
       必须使用static修饰，默认用public修饰
       -- 接口的静态方法，必须接口名自己调用。
     */
    static void inAddr(){
        System.out.println("我们都在学习java新增方法的语法，它是java源码自己会用到的~~~");
    }

    /**
     3. 私有方法(实例方法)
       -- JDk 1.9开始才支持的。
       -- 必须在接口内部才能被访问。
     */
    private void go(){
        System.out.println("开始跑~~~");
    }
}

class PingPongMan implements SportManInter{

}

class Test{
    public static void main(String[] args) {
        PingPongMan p = new PingPongMan();
        p.run();

        SportManInter.inAddr();
        // PingPongMan.inAddr();
    }
}
