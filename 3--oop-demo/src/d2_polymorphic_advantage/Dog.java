package d2_polymorphic_advantage;

public class Dog extends Animal {
    public String name = "狗名跑的真快";
    @Override
    public void run() {
        System.out.println("狗跑的真快");
    }

    /**
     独有功能
     */
    public void lookDoor(){
        System.out.println("狗再看门");
    }
}
