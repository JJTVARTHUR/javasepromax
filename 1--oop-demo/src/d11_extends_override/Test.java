package d11_extends_override;

/**

 方法重写：
 在继承体系中，子类出现了和父类中一模一样的方法声明，我们就称子类这个方法是重写的方法

 @Override 重写注释
 1.@Override是放在重写后的方法上，作为重写是否正确的校验注解
 2.加上该注释后如果重写错误，编译阶段会出现错误提示
 3.建议重写方法都加@Override注解，代码安全，优雅！

 方法重写注意事项和要求
 1.重写方法的名称，形参列表必须与被重写方法的名称和参数列表一致
 2.私有方法不能被重写
 3.子类重写父类方法时，访问权限必须大于或者等于父类 (暂时了解：缺省 < protected < public )
 4.子类不能重写父类的静态方法，如果重写会报错的

 */

public class Test {
    public static void main(String[] args) {
        // 方法重写
        NewPhone hw = new NewPhone();
        hw.call();
        hw.sendMsg();
    }
}

/**
 新手机：子类
 */

class NewPhone extends Phone{
    // 重写的方法
    // 1. 重写校验注释，加上之后，这个方法必须是正确重写的，这样更安全 2. 提高程序的可读性，代码优雅
    // 注意：重写方法的名词和形参列表必须与被重写的方法一模一样
    @Override
    public void call(){
        super.call(); // 先用它爸爸的基本功能
        System.out.println("开始视频通话");
    }
    // 重写的方法
    @Override
    public void sendMsg(){
        super.sendMsg(); // 先用它爸爸的基本功能
        System.out.println("发送有趣的图片");
    }

    // 注意：静态方法不能被重写
//    @Override
//    public static void test(){
//
//    }
}

/**
 旧手机: 父类
 */

class Phone{
    public void call(){
        System.out.println("打电话~");
    }

    public void sendMsg(){
        System.out.println("发短信~");
    }

    public static void test(){

    }
}


