package d7_genericity;

import java.util.ArrayList;
import java.util.List;

/**
      泛型概述:

      泛型的格式：<数据类型>
      泛型可以在编译阶段约束只能操作某种数据类型。

       注意：
       JDK 1.7开始之后后面的泛型申明可以省略不写

       泛型的注意事项:
         1. 泛型就是一个标签
         2. 泛型可以在编译阶段约束只能操作某种数据类型
         3. 泛型只能支持引用数据类型
         4. 集合体系的全部接口和实现类都是支持泛型的使用的

       泛型可以在很多地方进行定义:
       类后面   ------- 泛型类
       方法申明上 ------ 泛型方法
       接口后面 ------- 泛型接口
 */
public class GenericityDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java2");
        // list.add(23);

        List<String> list1 = new ArrayList<>();
        list1.add("Java");
        // list1.add(23.3);
        // list1.add(false);
        list1.add("String");

        // for (Object o : list1){
        //    String ele = (String) o;
        //    System.out.println(ele);
        // }

        for (String s : list1) {
            System.out.println(s);
        }

        System.out.println("----------------------");
        // 存储任意类型的元素
        List<Object> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(23.3);
        list2.add("Java");

        // List<int> list3 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
    }
}
