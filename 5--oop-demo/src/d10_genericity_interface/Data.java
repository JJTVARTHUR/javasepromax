package d10_genericity_interface;

/**
       泛型接口的概述:
       1. 使用了泛型定义的接口就是泛型接口
       2. 泛型接口的格式: 修饰符 interface 接口名称 <泛型变量> {}
       范例: public interface Data<E>{}

       3. 作用: 泛型接口可以让实现类选择当前功能需要操作的数据类型

       泛型接口的原理:
       1. 实现类可以在实现接口的时候传入自己操作的引用数据类型，这样重写的方法都将是针对于该引用类型的操作

 */

public interface Data <E>{
    void add(E e);
    void delete(int id);
    void update(E e);
    E queryById(int id);
}
