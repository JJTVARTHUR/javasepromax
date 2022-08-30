package d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

/**

 1.Duration: 用于计算两个时间间隔
 2.Period： 用于计算两个日期间隔

 Duration:
 1.在java8中，我们可以使用以下类来计算时间间隔差异：java.time.Duration
 2.提供了使用基于时间的值测量时间量的方法
 3.用于LocalDateTime之间的比较。也可用于Instant之间的比较

 LocalDateTime today = LocalDateTime.mow();
 System.out.println(today);
 LocalDateTime birthDate = LocalDateTime.of(1990,12,1,10,50,30);
 System.out.println(birthDate);

 Duration duration = Duration.between( birthDate, today ); // 第二个参数减第一个参数
 System.out.println(duration.toDays()); // 两个时间差的天数
 System.out.println(duration.toHours()); // 两个时间差的小时数
 System.out.println(duration.toMinutes()); // 两个时间差的分钟数
 System.out.println(duration.toMillis()); // 两个时间差的毫秒数
 System.out.println(duration.toNanos()); // 两个时间差的纳秒数

 */

public class Demo08Duration {
    public static void main(String[] args) {
        // 本地日期时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // 出生的日期时间对象
        LocalDateTime birthDate = LocalDateTime.of(2003,4,03,01,00,00);

        System.out.println(birthDate);

        Duration duration = Duration.between(birthDate,today); // 第二个参数减第一个参数

        System.out.println(duration.toDays()); // 两个时间差的天数
        System.out.println(duration.toHours()); // 两个时间差的小时数
        System.out.println(duration.toMinutes()); // 两个时间差的分钟数
        System.out.println(duration.toMillis()); // 两个时间差的毫秒数
        System.out.println(duration.toNanos()); // 两个时间差的纳秒数
    }
}
