package d5_integer;

/**

 包装类：
 1.其实就是8种基本数据类型对应的引用类型。

 基本数据类型：          引用数据类型：
    byte                 Byte
    short                Short
    int                  Integer
    long                 Long
    char                 Character
    float                Float
    double               Double
    boolean              Boolean

 包装类的作用：
 1.java为了实现一切皆对象，为8种基本类型提供了对应的引用类型。
 2.后面的集合和泛型其实也只能支持包装类型，不支持基本数据类型。

 自动装箱： 基本类型的数据和变量可以直接赋值给包装类型的变量。
 自动拆箱： 包装类型的变量可以直接赋值给基本数据类型的变量。

 包装类的特意功能：
 1.包装类的变量的默认值可以是null，容错率更高
 2.可以把基本类型的数据转换成字符串类型
   调用toString()方法得到字符串结果。
   调用Integer.toString(基本类型的数据)

 3.可以把字符串类型的数值转换成真实的数据类型
   Integer.parseInt("字符串类型的整数")
   Double.parseDouble("字符串类型的小数")

 */

public class Test {
    /**
     明白包装类的概念，并使用
     */
    public static void main(String[] args) {
        int a = 10;
        Integer a1 = 11;
        Integer a2 = a; // 自动装箱
        System.out.println(a);
        System.out.println(a1);

        Integer it = 100;
        int it1 = it; // 自动拆箱
        System.out.println(it1);

        double db = 99.5;
        Double db2 = db; // 自动装箱
        double db3 = db2; // 自动拆箱
        System.out.println(db3);

        // int age = null; // 报错了！
        Integer age1 = null;
        Integer age2 = 0;

        System.out.println("---------------------");
        // 1. 包装类可以把基本类型的数据转换成字符串形式。
        Integer i3 = 23;
        String rs = i3.toString(i3);
        System.out.println(rs + 1);

        String rs1 = Integer.toString(i3);
        System.out.println(rs1 + 1);

        // 可以之间+字符串得到字符串类型
        String rs2 = i3 + "";
        System.out.println(rs2 + 1);

        System.out.println("-------------------");

        String number = "23";
        // 转换成整数
        // int age = Integer.parseInt(number);
        int age = Integer.valueOf(number);
        System.out.println(age + 1);

        String number1 = "99.9";
        // 转换成小数
        // double score = Double.parseDouble(number1);
        double score = Double.valueOf(number1);
        System.out.println(score + 0.1);
    }
}
