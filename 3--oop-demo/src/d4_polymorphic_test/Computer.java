package d4_polymorphic_test;

public class Computer {
    private String name;

    public void start(){
        System.out.println(name + "正在开机");
    }

    /**
     提供一个安装的入口：行为。
     */

    public void installUSB(USB u){
        start();
        u.connect();
        if(u instanceof KeyBoard){
            KeyBoard k = (KeyBoard) u;
            k.keyDown();
        }else if(u instanceof Mouse){
            Mouse m = (Mouse) u;
            m.dbClick();
        }
        u.unConnect();
    }


    public Computer(){
    }

    public Computer(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
