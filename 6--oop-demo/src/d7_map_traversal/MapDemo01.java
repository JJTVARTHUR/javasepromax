package d7_map_traversal;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
       Map集合的遍历方式有：3种
       方式一: 键找值的方式遍历：先获取Map集合全部的键，再根据遍历键找值
       方式二: 键值对的方式遍历，把 "键值对" 看成一个整体，难度大
       方式三: JDK1.8开始之后的新技术：Lambda表达式

       Map集合的遍历方式一: 键找值
       1. 先获取Map集合的全部键的Set集合
       2. 遍历键的Set集合，然后通过键提取对应值

       键找值涉及到的API:
         - public Set<K> keySet(): 获取Map集合中所有的键，存储到Set集合中
         - public V get(Object key): 根据指定的键，在Map集合中获取对应的值
 */
public class MapDemo01 {
    public static void main(String[] args) {
        Map<String,Integer> maps = new HashMap<>();
        // 1. 添加元素: 无序 不重复 无索引
        maps.put("娃娃",30);
        maps.put("iphoneX",100);
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);
        // maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=30}

        // 1、键找值：第一步：先拿到集合的全部键。
        Set<String> keys = maps.keySet();
        // 2、第二步：遍历每个键，根据键提取值
        for (String key: keys) {
            int value = maps.get(key);
            System.out.println(key + "-->" + value);
        }
    }
}
