package d1_unchange_collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
      不可变集合:
      1. 不可变集合，就是不可被修改的集合
      2. 集合的数据项在创建的时候提供，并且在整个生命周期中都不可改变。否则报错
      3. 如果某个数据不能被修改，把它防御性地拷贝到不可变集合中是个很好的实践
      4. 或者当集合对象被不可信的库调用时，不可变形式是安全的

      不可变集合的创建:
      1. 在 List Set Map接口中，都存在of方法，可以创建一个不可变的集合
         - public static<E> List<E> of(E...elements): 创建一个具有指定元素的List集合对象
         - public static<E> Set<E> of(E...elements): 创建一个具有指定元素的Set集合对象
         - public static<K,V> Map<K,V> of(E...elements): 创建一个具有指定元素的Map集合对象
      这个集合不能添加，不能删除，不能修改
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // 1、不可变的List集合
        List<Double> lists = List.of(569.5, 700.5, 523.0,  570.5);
        // lists.add(689.0);
        // lists.set(2, 698.5);
        // System.out.println(lists);
        double score = lists.get(1);
        System.out.println(score);

        // 2、不可变的Set集合
        Set<String> names = Set.of("迪丽热巴", "迪丽热九", "马尔扎哈", "卡尔眨巴" );
        // names.add("三少爷");
        System.out.println(names);

        // 3、不可变的Map集合
        Map<String, Integer> maps = Map.of("huawei",2, "Java开发", 1 , "手表", 1);
        // maps.put("衣服", 3);
        System.out.println(maps);
    }
}
