package d4_jdk8_time;

/**

 概述：
 从jdk8开始，java.time包提供了新的日期和时间API，主要涉及的类型有：

           1. LocalDate: 不包含具体时间的日期。
           2. LocalTime: 不含日期的时间。
           3. LocateDateTime: 包含了日期及时间
 新增日期类：4. Instant: 代表的是时间戳
           5. DateTimeFormatter: 用于做时间的格式化和解析的
           6. Duration: 用于计算两个 "时间" 间隔
           7. Period: 用于计算两个 "日期" 间隔

 1. 新增的API严格区分了时刻，本地日期，本地时间，并且，对日期和时间进行运算更加方便。
 2. 其次，新API的类型几乎全部是不变类型(和String的使用类似),可以放心使用不必担心被修改。

 LocalDate LocalTime LocalDateTime
 1. 他们分别代表日期，时间，日期时间对象，他们的类的实例是不可变的对象。
 2. 他们三者构建对象和API都是通用的。

 构建对象的方式如下：
                方法名                     说明
 public static Xxxx now();        静态方法，根据当前时间创建对象
 1. LocalDate localDate = LocalDate.now();
 2. LocalTime localTime = LocalTime.now();
 3. LocalDateTime localDateTime = LocalDateTime.now();

 public static Xxxx of();         静态方法，指定日期/时间创建对象
 1. LocalDate localDate1 = LocalDate.of(2099,11,11);
 2. LocalTime localTime1 = LocalTime.of(11,11,11);
 3. LocalDateTime localDateTime1 = LocalDateTime.of(2020,10,6,13,23,43);

 LocalDate LocalTime LocalDateTime获取信息的API：
              方法名                      说明
 public int getYear()                   获取年
 public int getMonthValue()             获取月份(1 - 12)
 public int getDayOfMonth()             获取月中第几天
 public int getDayOfMonth()             获取年中第几天
 public DayOfWeek getDayOfWeek()        获取星期

 修改相关的API：
 1.LocalDateTime综合了LocalDate和LocalTime里面的方法，所以下面只用 LocalDate 和 LocalTime 来举例。
 2.这些方法返回的是一个新的实例引用，因为LocalDateTime，LocalDate，LocalTime都是不可变的。
                 方法名                                      说明
 plusDays,plusWeeks,plusMonths,plusYears            向当前LocalDate对象添加几天，几周，几个月，几年
 minusDays,minusWeeks,minusMonths,minusYears        从当前LocalDate对象减去几天，几周，几个月，几年
 withDayOfMonth,withDayOfYear,withMonth,WithYear    将月份天数，年份天数，月份，年份，修改为指定的值并返回新的LocalDate对象
 isBefore，isAfter                                  比较两个LocalDate

 */

/**

 LocalDateTime的转换API：
            方法名                             说明
 public LocalDate toLocalDate()         转换为一个LocalDate对象
 public LocalTime toLocalTime()         转换成一个LocalTime对象

 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo03LocalDateTime {
    public static void main(String[] args) {
        // 日期 时间
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("今天是：" + nowDateTime); // 今天是：
        System.out.println(nowDateTime.getYear()); // 年
        System.out.println(nowDateTime.getMonthValue()); // 月
        System.out.println(nowDateTime.getDayOfMonth()); // 日
        System.out.println(nowDateTime.getHour()); // 时
        System.out.println(nowDateTime.getMinute()); // 分
        System.out.println(nowDateTime.getSecond()); // 秒
        System.out.println(nowDateTime.getNano()); // 纳秒
        // 日：当年的第几天
        System.out.println("dayOfYear:" + nowDateTime.getDayOfYear()); // dayOfYear
        // 星期
        System.out.println(nowDateTime.getDayOfWeek()); // 星期英文字母
        System.out.println(nowDateTime.getDayOfWeek().getValue()); // 星期阿拉伯数字
        // 月份
        System.out.println(nowDateTime.getMonth()); // 月份英文字母
        System.out.println(nowDateTime.getMonth().getValue()); // 月份阿拉伯数字

        LocalDate ld = nowDateTime.toLocalDate();
        System.out.println(ld);

        LocalTime lt = nowDateTime.toLocalTime();
        System.out.println(lt.getHour());
        System.out.println(lt.getMinute());
        System.out.println(lt.getSecond());
    }
}
