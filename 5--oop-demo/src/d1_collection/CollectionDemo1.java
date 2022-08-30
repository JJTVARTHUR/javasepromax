package d1_collection;

/**

 数组和集合的区别:
 1. 数组可以存储基本类型和引用类型的数据，数组定义后类型确定，长度固定。
 2. 集合只能存储引用数据类型的数据，集合类型可以不固定，大小是可变的。

 Collection:
 1. Collection单列集合，每个元素(数据)只包含一个值

 Collection集合特点:
 1.List系列集合: 添加的元素是 有序，可重复，有索引
       ArrayList LinkedList : 有序，可重复，有索引
 2.Set系列集合: 添加的元素是 无序，不重复，无索引
       HashSet : 无序，不重复，无索引
       LinkedHashSet : 有序，不重复，无索引
       TreeSet : 按照大小默认升序排序，不重复，无索引

 注意:
 1. 集合都是支持泛型的，可以在编译阶段约束集合只能操作某种数据类型。
 2. 集合和泛型都只能支持引用数据类型，不支持基本数据类型，所以集合中存储的元素都认为是对象。

 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionDemo1 {
    /**
     明确 Collection 集合体系的特点
     */
    public static void main(String[] args) {
        // 有序 可重复 有索引
        Collection list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add("Mybatis");
        list.add(23);
        list.add(23);
        list.add(false);
        list.add(false);
        System.out.println(list);

        // 无序 不重复 无索引
        Collection list1 = new HashSet();
        list1.add("Java");
        list1.add("Java");
        list1.add("Mybatis");
        list1.add(23);
        list1.add(23);
        list1.add(false);
        list1.add(false);
        System.out.println(list1);

        System.out.println("----------------------------------");
        // Collection<String> list2 = new ArrayList<String>();
        Collection<String> list2 = new ArrayList<>(); // JDK 7 开始之后后面类型申明可以不写
        list2.add("Java");
        // list2.add(23);
        list2.add("黑马");

        // 集合和泛型不支持基本数据类型，只能支持引用数据类型
        // Collection<int> list3 = new ArrayList<>();
        Collection<Integer> list3 = new ArrayList<>();
        list3.add(23);
        list3.add(233);
        list3.add(2333);

        Collection<Double> list4 = new ArrayList<>();
        list4.add(23.4);
        list4.add(233.0);
        list4.add(233.3);
    }
}
