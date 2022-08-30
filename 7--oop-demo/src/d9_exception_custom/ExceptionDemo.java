package d9_exception_custom;

/**
       自定义异常:
       1. Java无法为这个世界上全部的问题提供异常类
       2. 如果企业想通过异常的方式来管理自己的某个业务问题，就需要自定义异常类了

       自定义异常的好处:
       1. 可以使用异常的机制管理业务问题，如提醒程序员注意
       2. 同时一旦出现bug，可以用异常的形式清晰的指出出错的地方

       自定义异常的分类:
       1. 定义一个异常类继承Exception
         - 定义一个异常类继承Exception
         - 重写构造器
         - 在出现异常的地方用throw new 自定义对象抛出
       作用: 编译时异常是编译阶段就报错，提醒更加强烈，一定需要处理。

       2. 自定义运行时异常
         - 定义一个异常类继承RuntimeException
         - 重写构造器
         - 在出现异常的地方用throw new 自定义对象抛出
       作用: 提醒不强烈，编译阶段不报错，运行时才可能出现。

 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            checkAge(-34);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }
        try {
            checkAge2(-23);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkAge2(int age){
        if(age < 0 || age > 200){
            // 抛出去一个异常对象给调用者
            // throw ：在方法内部直接创建一个异常对象，并从此点抛出
            // throws : 用在方法申明上的，抛出方法内部的异常
            throw new AgeIlleagalRuntimeException(age + " is illeagal!");
        }else{
            System.out.println("年龄合法：推荐商品给其购买~~");
        }
    }

    public static void checkAge(int age) throws AgeIllegalException {
        if(age < 0 || age > 200){
            // 抛出去一个异常对象给调用者
            // throw ：在方法内部直接创建一个异常对象，并从此点抛出
            // throws : 用在方法申明上的，抛出方法内部的异常
            throw new AgeIllegalException(age + " is illeagal!");
        }else{
            System.out.println("年龄合法：推荐商品给其购买~~");
        }
    }
}
