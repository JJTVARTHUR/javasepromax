package d1_collection_set;

/**
        HashSet底层原理:
        1. HashSet底层原理采取哈希表存储的数据
        2. 哈希表是一种对于增删改查数据性能都较好的结构

        哈希表的组成:
        1. JDK8之前的，底层使用 数组 + 链表 组成
        2. JDK8开始后，底层采用 数组 + 链表 + 红黑树 组成

        哈希值:
        1. 是JDK根据对象的地址，按照某种规则算出来的int类型的数值

        Object类的API:
        1. public int hashCode(): 返回对象的哈希值

        对象的哈希值特点:
        1. 同一个对象多次调用hashCode()方法返回的哈希值是相同的
        2. 默认情况下，不同对象的哈希值是不同的
 */

public class SetDemo2 {
    public static void main(String[] args) {
        // 学会获取对象的哈希值
        String name = "itheima";
        System.out.println(name.hashCode());
        System.out.println(name.hashCode());

        String name1 = "itheima";
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());
    }
}
