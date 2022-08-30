package d1_date;

import java.util.Date;

/**

 Date类概述：
 1.Date类的对象在java中代表的是当前所在系统的此刻日期时间

 Date的构造器：
      名称                  说明
 public Date()       创建一个Date对象，代表的是系统当前此刻日期时间

 Date的常用方法：
      名称                      说明
 public long getTime()     获取时间对象的毫秒值

 Date的时间毫秒值 -> 日期对象:
             构造器                                说明
 public Date(long time)                 把时间毫秒值转换成Date日期对象

             Date方法                              说明
 public void setTime(long time)         设置日期对象的时间为当前时间毫秒值对应的时间

 */

public class DateDemo1 {
    /**
     使用Date类处理时间，获取时间的信息
     */
    public static void main(String[] args) {
        // 1. 创建一个Date类的对象：代表系统此刻日期时间对象
        Date d = new Date();
        System.out.println(d);

        // 2. 获取时间毫秒值
        long time = d.getTime();
        System.out.println(time);
        long time1 = System.currentTimeMillis();
        System.out.println(time1);

        System.out.println("-----------------------");
        // 1. 得到当前时间
        Date d1 = new Date();
        System.out.println(d1);

        // 2. 当前时间往后走 1小时 121s
        long time2 = System.currentTimeMillis();
        time2 += (60 * 60 +121) * 1000;

        // 3. 把时间毫秒值转换成对应的日期对象。
        Date d2 = new Date(time2);
        System.out.println(d2);

        Date d3 = new Date();
        d3.setTime(time2);
        System.out.println(d3);
    }
}
