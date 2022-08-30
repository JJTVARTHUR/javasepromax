package d4_jdk8_time;

import java.time.LocalDate;
import java.time.Period;

/**

 1.Duration: 用于计算两个时间间隔
 2.Period： 用于计算两个日期间隔

 Period:
 1. 在java8中，我们可以使用以下类来计算日期间隔差异：java.time.Period
 2. 主要是Period类方法 getYears()，getMonths()和 getDays()来计算，只能精确到年月日
 3. 用于LocalDate之间的比较

 LocalDate today = LocalDate.now();
 System.out.println(today);                     // 2022-04-17
 LocalDate birthDate = LocalDate.of(2003,4,3);
 System.out.println(birthDate);                 // 2003-04-03
 Period period = Period.between(birthDate,today);
 System.out.println("年龄 ：%d 年 %d 月 %d 日",period.getYears(),period.getMonths(),period.getDays());

 */

public class Demo07Period {
    public static void main(String[] args) {
        // 当地本地 年月日
        LocalDate today = LocalDate.now();
        System.out.println(today); // 2022-04-17

        // 生日的 年月日
        LocalDate birthDate = LocalDate.of(2003,04,03);
        System.out.println(birthDate);

        Period period = Period.between(birthDate,today); // 第二个参数减第一个参数

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
    }
}
