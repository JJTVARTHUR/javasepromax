package d12_math;

/**

 Math类：
 1.包含执行基本数字运算的方法，Math类没有提供公开的构造器。
 2.如何使用类中的成员呢？看类的成员是否都是静态的，如果是，通过类名就可以直接调用

 Math类的常用方法：
               方法名                                  说明
 public static int abs(int a)                   获取参数绝对值
 public static double ceil(double a)            向上取整
 public static double floor(double a)           向下取整
 public static int round(float a)               四舍五入
 public static max(int a,int b)                 获取两个int值中的较大值
 public static double pow(double a,double b)    返回a的b次幂的值
 public static double random()                  返回值为double的随机值，范围 [0.0,1.0)

 */

public class MathDemo {
    public static void main(String[] args) {
        // 1. 取绝对值：返回正数。
        System.out.println(Math.abs(10)); // 10
        System.out.println(Math.abs(-10.3)); // 10.3

        // 2. 向上取整：5
        System.out.println(Math.ceil(4.000000001)); // 5.0
        System.out.println(Math.ceil(4.0)); // 4.0

        // 3. 向下取整：4
        System.out.println(Math.floor(4.99999999999)); // 4.0
        System.out.println(Math.floor(4.0)); // 4.0

        // 4. 四舍五入
        System.out.println(Math.round(4.49999999)); // 4
        System.out.println(Math.round(4.5000000001)); // 5

        // 5. 求最大值
        System.out.println(Math.max(4,5)); // 5
        System.out.println(Math.max(4.0,5.0)); // 5.0

        // 6. 求指数次方
        System.out.println(Math.pow(2,3)); // 2^3 = 8.0

        // 7. 求随机数
        System.out.println(Math.random()); // 0.0 - 1.0 (包前不包后)

        // 拓展： 3 - 9 之间的随机数  (0 - 6) + 3
        // [0 - 6] + 3
        int data = (int)(Math.random() * 7) + 3;
        System.out.println(data);

    }
}
