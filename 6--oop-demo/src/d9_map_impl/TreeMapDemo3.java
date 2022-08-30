package d9_map_impl;

import d1_collection_set.Apple;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
      Map集合体系:
                        Map
           /             |            \
        HashMap        HashTable        ...
        /                 |               \
      LinkedHashMap    properties        TreeMap

      说明:
      1. 使用最多的Map集合是HashMap
      2. 重点掌握HashMap，linkedHashMap，TreeMap。其他的后续理解。

      TreeMap集合概述和特点:
      1. 由键决定特性：不重复 无索引 可排序
      2. 可排序：按照键数据的大小默认升序(从小到大)排序。只能对键排序
      3. 注意：TreeMap集合是一定要排序的，可以默认排序，也可以将键按照指定的规则进行排序
      4. TreeMap跟TreeSet一样，底层原理是一样的

      TreeMap集合自定义排序规则有两种：
      1. 类实现Comparable接口，重写比较规则。
      2. 集合自定义Comparator比较器对象，重写比较规则。
 */
public class TreeMapDemo3 {
    public static void main(String[] args) {
        Map<Integer, String> maps1 = new TreeMap<>();
        maps1.put(13 , "王麻子");
        maps1.put(1 , "张三");
        maps1.put(3 , "县长");
        System.out.println(maps1);

        // TreeMap集合自带排序。  可排序 不重复（只要大小规则一样就认为重复）  无索引
        Map<Apple, String> maps2 = new TreeMap<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o2.getPrice() , o1.getPrice()); // 按照价格降序排序！
            }
        });
        maps2.put(new Apple("红富士", "红色", 9.9, 500), "山东" );
        maps2.put(new Apple("青苹果", "绿色", 15.9, 300), "广州");
        maps2.put(new Apple("绿苹果", "青色", 29.9, 400), "江西");
        maps2.put(new Apple("黄苹果", "黄色", 9.8, 500), "湖北");

        System.out.println(maps2);
    }
}
