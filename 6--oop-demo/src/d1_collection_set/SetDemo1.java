package d1_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
       Set系列集合特点:
       1. 无序：存取顺序不一致
       2. 不重复：可以去除重复
       3. 无索引：没有带索引的方法，所以不能使用普通for循环遍历，也不能通过索引来获取元素

       Set集合实现类特点:
       1. HashSet：无序 不重复 无索引
       2. LinkedHashSet：有序 不重复 无索引
       3. TreeSet：排序 不重复 无索引

       Set集合的功能上基本上与Collection的API一致
 */

public class SetDemo1 {
    public static void main(String[] args) {
        // 看看Set系列集合的特点:  HashSet LinkedHashSet TreeSet

        Set<String> sets = new HashSet<>(); // 一行经典代码 无序 不重复 无索引
        // Set<String> sets = new LinkedHashSet<>(); // 有序 不重复 无索引
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
