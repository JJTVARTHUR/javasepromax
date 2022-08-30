package d4_polymorphic_test;

/**
 实现类（子类）
 */

public class KeyBoard implements USB{
    private String name;

    public KeyBoard() {
    }

    public KeyBoard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     独有方法
     */
    public void keyDown(){
        System.out.println(name + "正在输入");
    }

    @Override
    public void connect() {
        System.out.println(name + "成功的接入了设备了~~~");
    }

    @Override
    public void unConnect() {
        System.out.println(name + "成功的从设备弹出了~~~");
    }
}
