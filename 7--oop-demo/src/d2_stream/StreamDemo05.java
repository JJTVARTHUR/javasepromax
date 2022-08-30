package d2_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
       Stream流的收集操作:
       1. 收集Stream流的含义：就是把Stream流操作后的结果数据转回到集合或者数组中去
       2. Stream流：方便操作集合 / 数组的手段
       3. 集合 / 数组：才是开发中的目的

       Stream流的收集方法
         - R collect(Collect collector): 开始收集Stream流，指定收集器

       Collectors工具类提供了具体的收集方式
         - public static<T> Collector toList: 把元素收集到List集合中
         - public static<T> Collector toSet: 把元素收集到Set集合中
         - public static Collector toMap(Function keyMapper , Function valueMapper): 把元素收集到Map集合中
 */
public class StreamDemo05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        List<String> zhangList = s1.collect(Collectors.toList()); // 可变集合
        zhangList.add("java1");
        System.out.println(zhangList);

        // List<String> list1 = s1.toList(); // 得到不可变集合
        // list1.add("java");
        // System.out.println(list1);

        // 注意注意注意："流只能使用一次"
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("张"));
        Set<String> zhangSet = s2.collect(Collectors.toSet());
        System.out.println(zhangSet);

        Stream<String> s3 = list.stream().filter(s -> s.startsWith("张"));
        // Object[] arrs = s3.toArray();
        String[] arrs = s3.toArray(String[]::new);
        System.out.println("Arrays数组内容：" + Arrays.toString(arrs));
    }
}
