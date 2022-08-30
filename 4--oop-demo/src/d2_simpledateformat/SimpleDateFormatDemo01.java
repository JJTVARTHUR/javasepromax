package d2_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**

 SimpleDateFormat 类作用:
 1.可以对Date对象或时间毫秒值格式化成我们喜欢的时间形式
 2.也可以把字符串的时间形式解析成日期对象。

 格式化：
        Date对象   ----------------->    2099年 11月11日 11:11
        时间毫秒值  ----------------->    2099年 11月11日 11:11

 解析：
        2099年 11月11日 11：11：11  ----------------->    Date对象

 SimpleDateFormat的构造器：
                构造器                                        说明
 public SimpleDateFormat()                       构造一个SimpleDateFormat，使用默认格式
 public SimpleDateFormat(String pattern)         构造一个SimpleDateFormat，使用指定的格式

 SimpleDateFormat的格式化方法：
                构造器方法                                      说明
 public final String(Date date)                  将日期格式化成日期/时间字符串
 public final String(Object time)                将时间毫秒值化成日期/时间字符串


 格式化的时间形式的常用的模式对应关系如下：
 1. y 年
 2. M 月             2020-11-11 13:27:06  -------------- yyyy-MM-dd HH:mm:ss
 3. d 日
 4. H 时
 5. m 分             2020年11月11日 13:27:06 ------------ yyyy年MM月dd日 HH:mm:ss
 6. s 秒
 7. EEE 星期几
 8. a 上下午

 */

public class SimpleDateFormatDemo01 {
    /**
     SimpleDateFormat简单日期格式化类的使用
     1.格式化时间
     2.解析时间
     */
    public static void main(String[] args) {
        // 1. 日期对象
        Date d = new Date();
        System.out.println(d);

        // 2. 格式化这个日期对象 (指定最终格式化的形式)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");
        // 3. 开始格式化日期对象成为喜欢的字符串形式
        String rs = sdf.format(d);
        System.out.println(rs);

        System.out.println("--------------------------------");

        // 4.格式化时间毫秒值
        // 需求：请问121秒后的时间是多少
        long time1 = System.currentTimeMillis();
        long time2 = time1+121*1000;
        String rs2 = sdf.format(time2);
        System.out.println(rs2);

        System.out.println("--------------解析字符串时间，下个代码 SimpleDateFormatDemo2 ------------------");
    }
}
