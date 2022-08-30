package d4_polymorphic_test;

/**
 实现类（子类）
 */

public class Mouse implements USB{
    private String name;

    public Mouse(){
    }

    public Mouse(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    /**
    独有方法
     */
    public void dbClick(){
        System.out.println(name + "正在双击");
    }

    @Override
    public void connect(){
        System.out.println(name + "成功的接入了设备了~~~");
    }

    @Override
    public void unConnect(){
        System.out.println(name + "成功的从设备弹出了~~~");
    }
}
