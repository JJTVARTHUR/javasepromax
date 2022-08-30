package d3_charset;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
      字符集:
      1. 计算机底层可以表示十进制编号。计算机可以给人类字符进行编号存储，这套编号规则就是字符集
      2. 字符底层的英文和数字等在任何国家的字符集中都占一个字节
      3. 在GBK字符中一个中文字符占两个字节
      4. 在UTF-8编码中一个中文字符一般占三个字节
      5. 编码前的字符集和编码后的字符集必须一致，否则会出现中文字符乱码
      6. 编码前的字符集和编码后的字符集中的英文和数字在任何国家的编码中都不会乱码

      字符集API:

      String编码:
         - public byte[] getBytes(): 使用平台的默认字符集将该String编码为一系列字节，将结果存储到新的字节数组中
         - public byte[] getBytes(String charsetName): 使用指定的字符串将该String编码为一系列字节，将结果存储到新的字节数组中

      String编码:
         - public String(byte[] bytes): 通过使用平台的默认字符集解码指定的字节数组来构造新的String
         - String (byte[] bytes , String charsetName): 通过指定的字符集解码指定的字节数组来构造新的String
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 1. 编码：把文字转换成字节 (使用指定的编码)
        String name = "abc我爱你中国";
        // byte[] bytes = name.getBytes(StandardCharsets.UTF_8); // 以当前代码默认字符集进行编码 (UTF-8)
        byte[] bytes = name.getBytes("GBK"); // 指定编码 (GBK)
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        // 2. 解码：把字节转换成对应的中文形式 (编码前 和 编码后的字符集必须一致，否则乱码)
        // String rs = new String(bytes); // 默认的UTF-8
        String rs = new String(bytes , "GBK"); // 指定GBK解码
        System.out.println(rs);
    }
}
