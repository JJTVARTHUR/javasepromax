package d1_package;

// 导包。
import d1_package.it.Student;
import java.util.Scanner;

/**

 包：
 1.包是用来分门别类的管理各种不同的类，类似于文件夹，建包利于程序的管理和维护。
 2.建包的语法格式：package公司域名倒写.技术名称。报名建议全部英文小写，且具备意义。
 3.建包语句必须在第一行，一般IDEA工具会帮助创建

 导包：
 1.相同包下的类可以直接访问，不同包下的类必须导包，才可以使用！ 导包格式：import 包名.类名
 2.假如一个类中需要用到不同类，而这两个类的名称是一样的，那么默认只能导入一个类，另一个类要带包名访问。

 */

public class Test {
    public static void main(String[] args) {
        // 理解以下两点：
        // 1.同一个包下的类，互相可以直接访问
        System.out.println(User.onlineNumber);

        // 2.不同包下的类，必须先导包才可以访问
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        // 3.如果这个类中使用不同包下的相同的类名，
        // 此时默认只能导入一个类的包，另一个类要使用全名访问.
        d1_package.it2.Student s2 = new d1_package.it2.Student();
    }
}
