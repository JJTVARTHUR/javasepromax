package d1_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
       LinkedHshSet集合概述和特点:
       1. 有序 不重复 无索引
       2. 这里的有序指的是保证存储和取出的元素顺序一致
       3. 原理: 底层数据结构依然是哈希表，只是每个元素又额外的多了一个双链表的机制记录存储的顺序

 */
public class SetDemo4 {
    public static void main(String[] args) {
        // 看看Set系列集合的特点： HashSet LinkedHashSet TreeSet
        Set<String> sets = new LinkedHashSet<>(); // 有序 不重复 无索引
        sets.add("MySQL");
        sets.add("MySQL");
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);
    }
}
