package d11_interface_implements;

/**

 接口

 接口的用法：
 接口是用来被类实现(implements)的，实现接口的类称为实现类。实现类可以理解成所谓的子类。

 修饰符 class 实现类 implements 接口1,接口2,接口3,...{

 }
 实现的关键字：implements

 从上面可以看出，接口可以被类单实现，也可以被类多实现。

 接口实现的注意事项：
 1.一个类实现接口，必须重写完全部接口的全部抽象方法，否则这个类需要定义成抽象类。

 */

public class Test {
    public static void main(String[] args) {
        // 理解接口的基本使用，被类实现
        PingPongMan p = new PingPongMan("张继科");
        p.run();
        p.competition();
        p.rule();
    }
}
