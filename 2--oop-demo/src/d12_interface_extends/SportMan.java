package d12_interface_extends;

/**
 接口可以多继承：一个接口可以同时继承多个接口。
 */

public interface SportMan extends People,Law{
    void run();
    void competition();
}
