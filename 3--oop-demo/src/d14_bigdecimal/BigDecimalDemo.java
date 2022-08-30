package d14_bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**

 BigDecimal作用：
 1.用于解决浮点型运算精度失真的问题

 BigDecimal使用步骤：
 1.创建对象BigDecimal封装浮点型数据 (最好的方式是调用方法)
 public static BigDecimal valueOf(double val):  包装浮点数成为BigDecimal对象。

 BigDecimal具体使用方法：
 1. BigDecimal recommand1 = new BigDecimal("0.1");
 2. BigDecimal recommand2 = BigDecimal.valueOf(0.1);

 BigDecimal常用API：
                   方法名                                          说明
 public BigDecimal add(BigDecimal b)                              加法
 public BigDecimal subtract(BigDecimal b)                         减法
 public BigDecimal multiply(BigDecimal b)                         乘法
 public BigDecimal divide(BigDecimal b)                           除法
 public BigDecimal divide(另一个BigDecimal对象，精确几位，舍入模式)    除法

 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        // 浮点型运算的时候直接 + - * / 可能会出现数据失真（精度问题）
        System.out.println(0.09 + 0.01); // 0.09999999999999999
        System.out.println(1.0 - 0.32); // 0.6799999999999999
        System.out.println(1.015 * 100); // 101.49999999999999
        System.out.println(1.301 / 100); // 0.013009999999999999

        System.out.println("------------------------");
        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c); // 0.30000000000000004
        System.out.println("-------------------------");

        // 包装浮点型数据成为大数据对象 BigDecimal
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal a2 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        BigDecimal c1 = a1.add(b1); // 加法
        BigDecimal c2 = a1.subtract(b1); // 减法
        BigDecimal c3 = a1.multiply(b1); // 乘法
        BigDecimal c4 = a1.divide(b1); // 除法
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println("-------------------------");

        // 目的：double
        double rs = c1.doubleValue();
        System.out.println(rs);

        // 注意事项：BigDecimal是一定要精度运算的
        BigDecimal a11 = BigDecimal.valueOf(10.0);
        BigDecimal b11 = BigDecimal.valueOf(3.0);
        /**
          参数一：除数  参数二：保留小数位数  参数三：舍入模式
         */
        BigDecimal c11 = a11.divide(b11,2, RoundingMode.HALF_UP); // 3.33
        System.out.println(c11);

    }
}
