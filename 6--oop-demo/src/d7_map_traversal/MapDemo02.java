package d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
      Map集合的遍历方式有：3种
      方式一: 键找值的方式遍历：先获取Map集合全部的键，再根据遍历键找值
      方式二: 键值对的方式遍历，把 "键值对" 看成一个整体，难度大
      方式三: JDK1.8开始之后的新技术：Lambda表达式

      Map集合的遍历方式二: 键值对
      1. 先把Map集合转换成Set集合，Set集合中每个元素都是键值对实体类型了
      2. 遍历Set集合，然后提取键以及提取值

      键值对涉及到的API:
        - public Set<Map.Entry<K,V>> entrySet(): 获取所有键值对对象的集合
        - public K getKey(): 获得键
        - public V getValue(): 获取值
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        // 1. 添加元素: 无序 不重复 无索引
        // 1.添加元素: 无序，不重复，无索引。
        maps.put("娃娃",30);
        maps.put("iphoneX",100);
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);
        // maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=30}
        /**
             maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=30}
                  ?
             使用foreach遍历map集合.发现Map集合的键值对元素直接是没有类型的。所以不可以直接foreach遍历集合。
                  ?
             可以通过调用Map的方法 entrySet把Map集合转换成Set集合形式  maps.entrySet();
                  ?
             Set<Map.Entry<String,Integer>> entries =  maps.entrySet();
             [(huawei=1000), (手表=10), (生活用品=10), (iphoneX=100), (娃娃=30)]
                  ?
             此时可以使用foreach遍历
         */
        // 1、把Map集合转换成Set集合
        Set<Map.Entry<String,Integer>> entries= maps.entrySet();
        // 2、开始遍历
        for (Map.Entry<String,Integer> entry: entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "-->" + value);
        }

    }
}
