package d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
      Map集合的遍历方式有：3种
      方式一: 键找值的方式遍历：先获取Map集合全部的键，再根据遍历键找值
      方式二: 键值对的方式遍历，把 "键值对" 看成一个整体，难度大
      方式三: JDK1.8开始之后的新技术：Lambda表达式

      Map集合的遍历方式三: Lambda
      1. 得益于JDK 8开始的新技术Lambda表达式，提供了一种更简单，更直接的遍历集合的方式。

      Map结合Lambda遍历的API:
        - default void forEach(BiConsumer<? super K, ? syper V> action): 结合Lambda遍历Map集合

      maps = {huawei=1000,手表=10,生活用品=10,iphoneX=100};
      maps.forEach((k,v)){
         System.out.println(k + "--->" + v);
      });
 */
public class MapDemo03 {
    public static void main(String[] args) {
        Map<String , Integer> maps = new HashMap<>();
        // 1.添加元素: 无序，不重复，无索引。
        maps.put("娃娃",30);
        maps.put("iphoneX",100);//  Map集合后面重复的键对应的元素会覆盖前面重复的整个元素！
        maps.put("huawei",1000);
        maps.put("生活用品",10);
        maps.put("手表",10);
        System.out.println(maps);

        //  maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=30}

        // maps.forEach(new BiConsumer<String, Integer>() {
        //     @Override
        //     public void accept(String key, Integer value) {
        //         System.out.println(key + "--->" + value);
        //     }
        // });

        maps.forEach((k,v) ->{
                System.out.println(k + "--->" + v);
        });
    }
}
