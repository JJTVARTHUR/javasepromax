package d1_collection_set;

public class Apple implements Comparable<Apple>{
    private String name;
    private String color;
    private double price;
    private int weight;

    public Apple() {
    }

    public Apple(String name, String color, double price, int weight) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }

    //       方式一
    //       1. 让自定义的类(如学生类)，实现Comparable接口重写里面的compareTo方法来定制比较规则
    //
    //       两种方式中，关于返回值的规则:
    //       1. 如果认为第一个元素大于第二个元素返回正整数即可
    //       2. 如果认为第一个元素小于第二个元素返回负整数即可
    //       3. 如果认为第一个元素等于第二个元素返回0即可，此时TreeSet集合只会保留一个元素，认为两者重复
    //       注意: 如果TreeSet集合存储的对象有实现比较规则，集合也自带比较器，默认使用集合自带的比较器排序

    @Override
    public int compareTo(Apple o) {
        // 按照重量进行比较的
        return this.weight - o.weight; // 去掉重量重复的元素
        // return this.weight - o.weight >= 0 ? 1 : -1; // 保留重量重复的元素
    }
}
