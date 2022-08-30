package d2_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
       Stream流的常用API (中间操作方法)
          - Stream<T> filter(Predicate<? super T> predicate): 用于对流中的数据进行过滤
          - Stream<T> limit(long maxSize): 获取前几个元素
          - Stream<T> skip(long n): 跳过前几个元素
          - Stream<T> distinct(): 去除流中重复的元素。依赖(hashCode和equals方法)
          - Stream<T> Stream<T> concat(Stream a , Stream b): 合并a和b两个流为一个流

       注意:
       1. 中间方法也称为非终结方法，调用完成后返回新的Stream流可以继续使用，支持链式编程
       2. 在Stream流中无法直接修改集合，数组中的数据

       Stream流的常见终结操作方法:
          - void forEach(Consumer action): 对此流的每个元素执行遍历操作
          - long count(): 返回此流中的元素数

       注意:
       1. 终结操作方法，调用完成后流就无法继续使用了，原因是不会返回Stream了
 */

public class StreamDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        // Stream<T> filter(Predicate<? super T> predicate)
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

        long size = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(size);

        // list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println);

        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach(System.out::println);

        // map加工方法: 第一个参数是原材料 -> 第二个参数是加工后的结果
        // 给集合元素的前面都加上一个：黑马的
        list.stream().map(s -> "黑马的：" + s).forEach(a -> System.out.println(a));

        // 需求：把所有的名称 都加工成一个学生对象
        list.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));
        // list.stream().map(Student::new).forEach(System.out::println); // 构造器引用 方法引用

        // 合并流 去除流中重复的元素。依赖(hashCode和equals方法)
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("java1","java2");
        // public static<T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
        Stream<String> s3 = Stream.concat(s1,s2);
        s3.distinct().forEach(s -> System.out.println(s));
    }
}
