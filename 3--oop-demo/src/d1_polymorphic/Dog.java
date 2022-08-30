package d1_polymorphic;

public class Dog extends Animal{
    public String name = "狗名跑的真快";
    @Override
    public void run() {
        System.out.println("狗跑的真快");
    }
}
