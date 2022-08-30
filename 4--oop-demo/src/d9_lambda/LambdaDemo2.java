package d9_lambda;

/**

 Lambda概述：
 1. Lambda表达式是 JDK8 开始后的一种新语法形式。
 2. 作用：简化匿名内部类的代码写法

 Lambda表达式的简化格式:

 (匿名内部类被重写方法的形参列表) -> {
    被重写方法的方法体代码
 }

 注: -> 是语法形式,无实际含义
 注意: Lambda表达式只能简化函数式接口的匿名内部类的写法形式

 函数式接口:
 1. 首先必须是接口，其次接口中有且仅有一个抽象方法的形式
 2. 通常我们会在接口加上一个@FunctionalInterface注解,标记该接口必须是满足函数式接口。

 Lambda表达式:

         Swimming s1 = new Swimming() {                     Swimming s1 = () -> {
             @Override                                          System.out.println("老师游泳贼快！");
             public void swim() {                           };
                 System.out.println("老师游泳贼快！");
             }
         };

 */

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 学会使用Lambda的标准格式简化匿名内部类的代码形式
        // Lambda只能简化接口中只有一个抽象方法的匿名内部类形式
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("老师游泳贼快！");
//            }
//        };

        Swimming s1 = () -> {
            System.out.println("老师游泳贼快！");
        };
        go(s1);

        System.out.println("---------------");
//        go(new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("学生游泳很开心！");
//            }
//        });

//        go(() ->{
//                System.out.println("学生游泳很开心~~~");
//        });

        go(() -> System.out.println("学生游泳很开心~~~"));

    }

    public static void go(Swimming s){
        System.out.println("开始...");
        s.swim();
        System.out.println("结束...");
    }
}

@FunctionalInterface // 一旦加上这个注解必须是函数式接口，里面只能有一个抽象方法
interface Swimming{
    void swim();
}
