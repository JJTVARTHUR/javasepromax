package d3_final;

/**

 final语法

 final作用：
 1.final关键字是最终的意思，可以修饰(类，方法，变量)
 2.修饰类：表明该类是最终类，不能被继承
 3.修饰方法：表明该方法是最终方法，不能被重写
 4.修饰变量：表示该变量第一次赋值后，不能再次被赋值(有且仅能被赋值一次)

 final修饰变量的注意：
 1.final修饰的变量是基本类型：那么变量存储的数据值不能发生改变
 2.final修饰的变量是引用类型：那么变量存储的地址值不能发生改变，但是地址指向的对象内容是可以发生变化的

 */

public class Test {
    public static void main(String[] args) {
        // 记住final的语法：
        // 1. final修饰类，类不能被继承。
        // 2. final修饰方法，方法不能被重写。
        // 3. final修饰变量，总规则：变量有且仅有被赋值一次。
    }
}

class Student extends People{
//    @Override
//    public void eat() {
//        System.out.println("学生吃的很多~~");
//    }
}
class People{
    public final void eat(){
        System.out.println("人都要吃东西~~");
    }
}
// class Wolf extends Animal{
//
// }
// final class Animal{
//
// }
