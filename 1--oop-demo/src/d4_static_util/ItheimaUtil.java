package d4_static_util;

import java.util.Random;

/**

 工具类：
 类中都是一些静态方法，每个方法都是以完成一个共用的功能为目的，这个类用来给系统开发人员共同使用的。

 */

public class ItheimaUtil {

    /**
     注意：由于工具类无需创建对象，所以把其构造器私有化会显得很专业！
     */
    private ItheimaUtil(){

    }

    /**
     静态方法
     */
    public static String creativeVerifyCode(int n) {
        // 开发一个验证码：
        // 1. 定义一个变量记住验证码。
        String code = "";
        // 2. 定义一个变量记住全部验证码字符。
        String data = "abcdefghijklnmopqrstuvwxyzABCDEFGHIJKLNMOPQRSTUVWXYZ0123456789";
        // 3. 定义一个循环生成几个随机索引，去得到几个字符
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            // 4. 获取随机索引对应的字符。链接给code
            int index = r.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }
}
