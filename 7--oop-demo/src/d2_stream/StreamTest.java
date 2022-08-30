package d2_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
      Stream流:
      1. 在Java8 中，得益于Lambda所带来的函数式编程，引入了一个全新的Stream流概念
      2. Stream流用于简化集合和数组操作的API

      Stream流式思想的核心:
      1. 先得到集合或者数组的Stream流
      2. 把元素放上去
      3. 然后就用这个Stream流简化的API来方便的操作元素
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰","张无忌","周芷若","赵敏","张强");
        System.out.println(names);

//        // 1. 从集合中找出姓张的放到新集合
//        List<String> zhangList = new ArrayList<>();
//        for (String name: names) {
//            if(name.startsWith("张")){
//                zhangList.add(name);
//            }
//        }
//        System.out.println(zhangList);

//        // 2. 找名称长度是3的姓名
//        List<String> zhangThreeList = new ArrayList<>();
//        for (String name: zhangList) {
//            if(name.length() == 3){
//                zhangThreeList.add(name);
//            }
//        }
//        System.out.println(zhangThreeList);

        // 3. 使用Stream流实现的
        names.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
    }
}
