package d6_static_singleinstance;

public class Test1 {
    public static void main(String[] args) {
        // 饿汉单例的设计步骤
        SingleInstance1 s1 = SingleInstance1.instance;
        SingleInstance1 s2 = SingleInstance1.instance;
        System.out.println(s1 == s2);
    }
}
