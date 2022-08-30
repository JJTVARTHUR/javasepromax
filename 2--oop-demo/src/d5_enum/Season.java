package d5_enum;

/**

 枚举类：
 1.枚举是java中的一种特殊类型
 2.枚举的作用：“是为了做信息的标志和信息的分类”。

 定义枚举类的格式：

 修饰符 enum 枚举名称{
       第一行都是罗列枚举类实例的名称。
 }

 enum Season{
   SPRING,SUMMER,AUTUMN,WINTER;
 }

 枚举的特征：
 1.枚举类都是继承了枚举类型：java.lang.Enum
 2.枚举都是最终类，不可以被继承
 3.枚举类的构造器都是私有的，枚举对外不能创建对象
 4.枚举类的第一行默认都是罗列枚举对象的名称的
 5.枚举类相当于是多例模式

 */
public enum Season {
    // 枚举的第一行必须罗列枚举类的对象名称，建议全部大写。
    SPRING,SUMMER,AUTUMN,WINTER;
}
