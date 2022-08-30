package d3_polymorphic_convert;

public class Tortoise extends Animal {
    public String name = "乌龟名跑的真快";
    @Override
    public void run() {
        System.out.println("乌龟跑的真慢");
    }

    /**
     独有功能
     */
    public void layEggs(){
        System.out.println("🐢在下蛋~~~");
    }
}
