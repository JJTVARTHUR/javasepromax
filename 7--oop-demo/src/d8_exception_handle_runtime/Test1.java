package d8_exception_handle_runtime;

/**
      运行时异常的处理形式:
      1. 运行时异常编译阶段不会出错，是运行时才可能出错的，所以编译阶段不处理也可以
      2. 按照规范建议还是处理: 建议在最外层调用处集中捕获处理即可
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。。。。。。。");
        try {
            chu(10,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束。。。。。。。。。。");
    }

    // 运行异常不用向外抛异常，系统会自动抛异常
    public static void chu(int a , int b) { // throws RuntimeException{
        System.out.println(a);
        System.out.println(b);
        int c = a / b;
        System.out.println(c);
    }
}
