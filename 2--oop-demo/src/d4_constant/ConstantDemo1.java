package d4_constant;

/**

 常量：
 1.常量是使用了public static final修饰的成员变量，必须有初始化值，而且执行的过程中其值不能被改变。
 2.常量的作用和好处：可以用于做系统的配置信息，方便程序的维护，同时也能提高可读性。

 常量命名规范：英文单词全部大写，多个单词下划线连接起来。 SCHOOL_NAME  LOGIN_NAME;

 常量的执行原理
 1.在编译阶段会进行"宏替换"，把使用常量的地方全部替换成真实的字面量。
 2.这样做的好处是让使用常量的程序的执行性能与直接使用字面量是一样的。

 */

public class ConstantDemo1 {

    public static final String SCHOOL_NAME = "传智集团";
    public static final String USER_NAME = "admin";
    public static final String PASS_WORD = "123456";

    public static void main(String[] args) {
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);
        System.out.println(SCHOOL_NAME);

        if(USER_NAME.equals("")){

        }
    }
}
