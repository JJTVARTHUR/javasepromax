package d8_genericity_class;

import java.util.ArrayList;

/**
     泛型类的概述:
     1. 定义类时同时定义了泛型的类就是泛型类
     2. 泛型类的格式: 修饰符 class 类名 <泛型变量>{}
     范例: public class MyArrayList<T>{}

     3. 此处泛型变量T可以随便写为任意标识，常见的如 E,T,K,V
     4. 作用: 编译阶段可以指定引用数据类型，类似于集合的作用

     泛型类的原理:
     1. 把出现泛型变量的地方全部替换成传输的引用数据类型
 */

public class MyArrayList<E> {
    private ArrayList lists = new ArrayList();

    public void add(E e){
        lists.add(e);
    }

    public void remove(E e){
        lists.remove(e);
    }

    @Override
    public String toString() {
        return lists.toString();
    }
}
