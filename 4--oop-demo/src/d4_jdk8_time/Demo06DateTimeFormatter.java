package d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**

 DateTimeFormatter:
 1.在JDK8中，引入了一个全新的日期与时间格式器DateTimeFormatter
 2.正反都能调用format方法。

 LocalDateTime ldt = LocalDateTime.now();
 System.out.println(ldt); // 2021-03-01T15:09:17.444190900

 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
 String ldtStr = ldt.format(dtf);
 System.out.println(ldtStr); // 2021-03-01 15:09:17

 String ldtStr1 = ldf.format(ldt);
 System.out.println(ldtStr1); // 2021-03-01 15:09:17

 */

public class Demo06DateTimeFormatter {
    public static void main(String[] args) {
        // 本地此刻  日期时间 对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 解析/格式化器
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");
        // 正向格式化
        System.out.println(dtf.format(ldt));
        // 逆向格式化
        System.out.println(ldt.format(dtf));

        // 解析字符串时间
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // 解析当前字符串时间成为本地日期时间对象
        LocalDateTime ldt1 = LocalDateTime.parse("2019-11-11 11:11:11",dtf1);
        System.out.println(ldt1);
        System.out.println(ldt1.getDayOfYear());
    }
}
