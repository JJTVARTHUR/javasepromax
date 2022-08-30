package d6_regex;

/**

 正则表达式规则：

 字符类(默认匹配一个字符):

 [abc]                 只能是a,b,或c
 [^abc]                除了a,b,c之外的任何字符
 [a-zA-Z]              a到z A到Z, 包括(范围)
 [a-d[m-p]]            a到d,或m通过p: ([a-dm-p]联合)
 [a-z&&[def]]          d,e,或f(交集)
 [a-z&&[^bc]]          a到z,除了b和c: ([ad-z]减法)
 [a-z&&[^m-p]          a到z,除了m到p: ([a-lq-z]减法)

 预定义的字符类(默认匹配一个字符):

 .                     任何字符
 \d                    一个数字: [0-9]
 \D                    非数字: [^0-9]
 \s                    一个空白字符：[\t\n\x0B\f\r]
 \S                    非空白字符: [^\s]
 \w                    [a-zA-Z_0-9] 英文,数字,下划线
 \W                    [^\w] 一个非单词字符

 贪婪的量词(配合匹配多个字符):

 X?                    X,一次或根本不
 X*                    X,零次或多次
 X+                    X,一次或多次
 X{n}                  X,正好n次
 X{n,}                 X,至少n次
 X{n,m}                X,至少n次但不超过m次

 字符串对象提供了匹配正则表达式规则的API:

 public boolean matches(String regex): 判断是否匹配正则表达式,匹配返回true,不匹配返回false。

 System.out.println("a".matches("[abc]")); // true
 System.out.println("z".matches("[abc]")); // false
 System.out.println("ab".matches("[abc]")); // false
 System.out.println("ab".matches("[abc]+")); // true

 */

public class RegexDemo02 {
    public static void main(String[] args) {
        //public boolean matches(String regex):判断是否与正则表达式匹配，匹配返回true
        // 只能是 a  b  c
        System.out.println("a".matches("[abc]")); // true
        System.out.println("z".matches("[abc]")); // false

        // 不能出现a  b  c
        System.out.println("a".matches("[^abc]")); // false
        System.out.println("z".matches("[^abc]")); // true

        System.out.println("a".matches("\\d")); // false
        System.out.println("3".matches("\\d")); // true
        System.out.println("333".matches("\\d")); // false
        System.out.println("z".matches("\\w")); // true
        System.out.println("2".matches("\\w")); // true
        System.out.println("21".matches("\\w")); // false
        System.out.println("你".matches("\\w")); //false
        System.out.println("你".matches("\\W")); // true
        System.out.println("---------------------------------");
        //  以上正则匹配只能校验单个字符。

        // 校验密码
        // 必须是数字 字母 下划线 至少 6位
        System.out.println("2442fsfsf".matches("\\w{6,}")); // true
        System.out.println("244f".matches("\\w{6,}")); // false

        // 验证码 必须是数字和字符  必须是4位
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}")); // true
        System.out.println("23_F".matches("[a-zA-Z0-9]{4}")); // false
        System.out.println("23dF".matches("[\\w&&[^_]]{4}")); // true
        System.out.println("23_F".matches("[\\w&&[^_]]{4}")); // false

    }
}
