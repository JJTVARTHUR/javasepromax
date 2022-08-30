package d2_simpledateformat;

/**

 SimpleDateFormat解析字符串时间成为日期对象：
                   解析方法                             说明
 1.public Date parse(String source)           从给定字符串的开始解析文本以生成日期

 总结：
 1. SimpleDateFormat可以格式化那些时间形式？
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          String rs1 = sdf.format(data);
          String rs2 = sdf.format(time);

 2.SimpleDateFormat如何进行字符串时间的解析的？
 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          Date d = sdf.parse(("2021-08-04 11:11:11"));

 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo02 {
    public static void main(String[] args) throws ParseException {
        // 目标: 学会使用SimpleDateFormat解析字符串时间成为日期对象。
        // 有一个时间 2021年08月06日 11:11:11 往后 2天 14小时 49分 06秒后的时间是多少。
        // 1、把字符串时间拿到程序中来
        String dateStr = "2021年08月06日 11:11:11";

        // 2. 把字符串时间解析成日期对象(本节的重点)：形式必须与被解析时间的形式完全一样，否则运行时解析报错！
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = sdf.parse(dateStr);

        // 3. 往后走 2天 14小时 49分 06秒
        long time = d.getTime() + (2L*24*60*60 + 14*60*60 + 49*60+6) *1000;

        // 4. 格式化这个时间毫秒值就是结束
        System.out.println(sdf.format(time));

    }
}
