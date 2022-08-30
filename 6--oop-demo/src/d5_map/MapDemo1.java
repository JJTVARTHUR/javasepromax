package d5_map;

import java.util.*;

/**
      Map集合概述和使用:
      1. Map集合是一种双列集合，每个元素包含两个数据
      2. Map集合的每个元素的格式：key=value(键值对元素)
      3. Map集合也被称为"键值对集合"

      Map集合整体格式:
      1. Collection集合的格式：[元素1,元素2,元素3...]
      2. Map集合的完整格式：{key1=value1,key2=value2,key3=value3,...}

      Map集合体系:
                             Map
               /              |               \
          HashMap         HashTable           ...
           /                  |                 \
       LinkedHashMap      properties           TreeMap

      说明: 使用最多的Map集合是HashMap

      Map集合体系特点:
      1. Map集合的特点都是由键决定的
      2. Map集合的键是 无序，不重复，无索引，值不做要求(可以重复)
      3. Map集合后面重复的键对应的值会覆盖前面重复键的值
      4. Map集合的键值对都可以为null

      Map集合实现类特点:
      1. HashMap: 元素按照键是 无序，不重复，无索引，值不做要求(与Map体系一致)
      2. LinkedHashMap: 元素按照键是 有序，不重复，无索引，值不做要求
      3. TreeMap: 元素按照键是 排序，不重复，无索引，值不做要求
 */
public class MapDemo1 {
    /**
     目标：认识Map体系的特点：按照键无序，不重复，无索引。值不做要求。
     */
    public static void main(String[] args) {
        // 1. 创建一个Map集合对象
        // Map<String,Integer> maps = new HashMap<>(); // 一行经典代码
        Map<String,Integer> maps = new LinkedHashMap<>();
        maps.put("鸿星尔克", 3);
        maps.put("Java", 1);
        maps.put("枸杞", 100);
        maps.put("Java", 100); // 覆盖前面的数据
        maps.put(null, null);
        System.out.println(maps);
    }
}
