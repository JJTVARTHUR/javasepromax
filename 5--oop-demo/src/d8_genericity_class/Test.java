package d8_genericity_class;

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

public class Test {
    public static void main(String[] args) {
        // 模拟ArrayList定义一个MyArrayList，关注泛型设计
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.remove("MySQL");
        System.out.println(list);

        MyArrayList<Integer> list2 = new MyArrayList<>();
        list2.add(23);
        list2.add(24);
        list2.add(25);
        list2.remove(25);
        System.out.println(list2);
    }
}
