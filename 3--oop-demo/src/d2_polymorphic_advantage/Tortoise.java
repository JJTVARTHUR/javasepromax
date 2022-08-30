package d2_polymorphic_advantage;

public class Tortoise extends Animal {
    public String name = "乌龟名跑的真快";
    @Override
    public void run() {
        System.out.println("乌龟跑的真慢");
    }
}
