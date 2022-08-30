package d13_extends_constructor2;

public class Teacher extends People{
    public Teacher(){

    }

    public Teacher(String name,int age){
        // 调用父类的有参数构造器：初始化继承自父类的数据
        super(name,age);
    }
}
