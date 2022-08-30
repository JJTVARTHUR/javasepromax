package d3_collections;

import java.util.*;

/**
      Collections排序相关API
      使用范围: 只能对于List集合的排序

      字符串按照首字符的编号升序排序！

      自定义类型的比较方法API:Collections
            - public static <T> void sort(List<T> list):
                  将集合中元素按照默认规则排序。
                  注意: 本方式不可以直接对自定义类型的List集合排序，除非自定义类型实现了比较规则Comparable接口

            - public static <T> void sort(List<T> list，Comparator<? super T> c):
                  将集合中元素按照指定规则排序,自带比较器
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(); // 可以重复！
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples.add(new Apple("绿苹果", "青色", 29.9, 400));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 500));

        // 方式一: 可以的，Apple类已经重写了CompareTo的比较规则
        // Collections.sort(apples);
        // System.out.println(apples);

        // 方式二: sort方法自带比较器对象
        // Collections.sort(apples, new Comparator<Apple>() {
        //    @Override
        //    public int compare(Apple o1, Apple o2) {
        //        return Double.compare(o1.getPrice() , o2.getPrice()); // 按照价格升序排列!!
        //    }
        //});

        Collections.sort(apples , (o1,o2) -> Double.compare(o1.getPrice(),o2.getPrice()));
        System.out.println(apples);
    }
}
