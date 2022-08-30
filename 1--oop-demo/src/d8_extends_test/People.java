package d8_extends_test;

/**
 类 父类
 */

public class People {
    private String name;
    private int age;

    /**
     共同行为
     */

    public void queryCourse(){
        System.out.println(this.name + "正在查看课表");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
