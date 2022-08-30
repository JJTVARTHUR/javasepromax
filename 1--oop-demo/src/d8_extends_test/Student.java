package d8_extends_test;

/**
 类 子类
 */

public class Student extends People{
    // 独有属性
    private String className;

    // 独有行为
    public void writeInfo(){
        System.out.println(getName() + "写下了：学习语法，好哈皮");
    }

    public String getClassName(){
        return className;
    }

    public void setClassName(String className){
        this.className = className;
    }
}
