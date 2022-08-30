package d4_jdk8_time;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

/**

 Instant时间戳：
 1.JDK8获取时间戳特别简单，且功能丰富。Instant类由一个静态的工厂方法now()可以返回当前时间戳。
 Instant instant = Instant.now();
 System.out.println("当前时间戳是:" + instant);

 Date date = Date.from(instant);
 System.out.println("当前时间戳是:" + date);

 instant = date.toInstant();
 System.out.println(instant);

 2.时间戳是包含日期和时间的，与java.util.Date很类似，事实上Instant就是类似JDK8以前的Date。
 3.Instant和Date这这两个类可以进行转换。

 */

public class Demo05Instant {
    public static void main(String[] args) {
        // 1. 得到一个Instant时间戳对象
        Instant instant = Instant.now();
        System.out.println(instant);

        // 2. 系统此刻的时间戳怎么办？
        Instant instant1 = Instant.now();
        System.out.println(instant1.atZone(ZoneId.systemDefault()));

        // 3. 如何去返回Date对象
        Date date = Date.from(instant);
        System.out.println(date);

        Instant i2 = date.toInstant();
        System.out.println(i2);
    }
}
