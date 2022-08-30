package d6_static_singleinstance;

public class Test2 {
    public static void main(String[] args) {
        // 懒汉单例的设计思想
        SingleInstance2 s1 = SingleInstance2.getInstance();
        SingleInstance2 s2 = SingleInstance2.getInstance();
        System.out.println(s1 == s2);
    }
}
