package d6_regex;

/**

 正则表达式初体验


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

public class RegexDemo01 {
    public static void main(String[] args) {
        // 需求：校验qq号码，必须全部数字 6 - 20位
        System.out.println(checkQQ1("256465456"));
        System.out.println(checkQQ1("2465456a54654"));
        System.out.println(checkQQ1(null));
        System.out.println(checkQQ1("1254"));

        System.out.println("------------------------------");
        // 正则表达式的初体验
        System.out.println(checkQQ1("256465456"));
        System.out.println(checkQQ1("2465456a54654"));
        System.out.println(checkQQ1(null));
        System.out.println(checkQQ1("1254"));
    }

    public static boolean checkQQ2(String qq){
        return  qq != null && qq.matches("\\d{6,20}");
    }

    public static boolean checkQQ1(String qq){
        // 1. 判断qq号码的长度是否满足要求
        if(qq == null || qq.length()<6 || qq.length()>20){
            return false;
        }

        // 2. 判断qq中是否全部是数字，不是返回false
        //   251425a87
        for (int i = 0; i < qq.length(); i++) {
            // 获取每位字符
            char ch = qq.charAt(i);
            // 判断这个字符是否不是数字，不是数字直接返回false
            if(ch < '0' || ch > '9'){
                return false;
            }
        }

        return true; // 肯定合法了！
    }
}

