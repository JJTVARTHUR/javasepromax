package d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest03 {
    public static void main(String[] args) throws ParseException {
        // 1、开始 和 结束时间
        String startTime = "2020-11-11 00:00:00";
        String endTime = "2020-11-11 00:10:00";
        // 2、小贾 小皮
        String xiaojia = "2020-11-11 00:03:47";
        String xiaopi = "2020-11-11 00:10:11";

        // 3、解析他们的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1 = sdf.parse(startTime);
        Date d2 = sdf.parse(endTime);
        Date d3 = sdf.parse(xiaojia);
        Date d4 = sdf.parse(xiaopi);

        if(d3.after(d1) && d3.before(d2)){
            System.out.println("小贾秒杀成功！");
        }else{
            System.out.println("小贾秒杀失败！");
        }

        if(d4.after(d1) && d4.before(d2)){
            System.out.println("小皮秒杀成功！");
        }else{
            System.out.println("小皮秒杀失败！");
        }
    }
}