package d2_stream;

import java.util.*;
import java.util.stream.Stream;

/**
       Stream流的三类方法:
       1. 获取Stream流: 创建一条流水线，并把数据放到流水线上准备进行操作
       2. 中间方法: 流水线上的操作。一次操作完毕之后，还可以继续进行其他操作
       3. 终结方法: 一个Stream流只能有一个终结方法，是流水线上的最后一个操作

       Stream操作集合或者数组的第一步是先得到Stream流，然后才能使用流的功能
       集合获取Stream流的方式:
       1. 集合获取Stream的方式是通过调用Stream()方式实现的
          - default Stream<E> stream(): 获取当前集合对象的Stream流

       数组获取Stream流的方式:
          - public static<T> Stream<T> stream(T[] array): 获取当前数组的Stream流
          - public static<T> Stream<T> of(T... values): 获取当前数组 / 可变数据的Stream流
 */

public class StreamDemo02 {
    public static void main(String[] args) {
        /** --------------------Collection集合获取流-------------------------------   */
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();

        /** --------------------Map集合获取流-------------------------------   */
        Map<String,Integer> maps = new HashMap<>();
        // 键流
        Stream<String> keyStream = maps.keySet().stream();
        // 值流
        Stream<Integer> valueStream = maps.values().stream();
        // 键值对流 (拿整体)
        Stream<Map.Entry<String,Integer>> keyAndValueStream = maps.entrySet().stream();

        /** ---------------------数组获取流------------------------------   */
        String[] names = {"赵敏","小昭","灭绝","周芷若"};
        Stream<String> nameStream = Arrays.stream(names);
        Stream<String> nameStream2 = Stream.of(names);
    }
}
