package d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;

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
 public int getDayOfYear()              获取年中第几天
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

public class Demo04UpdateTime {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime); // 当前时间
        System.out.println(nowTime.minusHours(1)); // 一小时前
        System.out.println(nowTime.minusMinutes(1)); // 一分钟前
        System.out.println(nowTime.minusSeconds(1)); // 一秒前
        System.out.println(nowTime.minusNanos(1)); // 一纳秒前

        System.out.println("-------------------------------");

        System.out.println(nowTime.plusHours(1)); // 一小时后
        System.out.println(nowTime.plusMinutes(1)); // 一分钟后
        System.out.println(nowTime.plusSeconds(1)); // 一秒后
        System.out.println(nowTime.minusNanos(1)); // 一纳秒后

        System.out.println("---------------------");
        // 不可变对象，每次修改产生新对象！
        System.out.println(nowTime);

        System.out.println("----------------------");
        LocalDate myDate = LocalDate.of(2018,9,5);
        LocalDate nowDate = LocalDate.now();

        System.out.println("今天是2018-09-06吗？ " + nowDate.equals(myDate)); // 今天是2018-09-06吗? false
        System.out.println(myDate + "是否在" + nowDate + "之前? " + myDate.isBefore(nowDate)); // 2018-09-05是否在2018-09-06之前? true
        System.out.println(myDate + "是否在" + nowDate + "之后? " + myDate.isAfter(nowDate)); // 2018-09-05是否在2018-09-06之前? false

        System.out.println("----------------------");

        // 判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(2003,4,3);
        LocalDate nowDate1 = LocalDate.now();

        MonthDay birMd = MonthDay.of(birDate.getMonthValue(),birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);

        System.out.println("今天是你的生日吗？ " + birMd.equals(nowMd));//今天是你的生日吗？ false
    }
}
