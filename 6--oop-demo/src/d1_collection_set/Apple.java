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

    //       ��ʽһ
    //       1. ���Զ������(��ѧ����)��ʵ��Comparable�ӿ���д�����compareTo���������ƱȽϹ���
    //
    //       ���ַ�ʽ�У����ڷ���ֵ�Ĺ���:
    //       1. �����Ϊ��һ��Ԫ�ش��ڵڶ���Ԫ�ط�������������
    //       2. �����Ϊ��һ��Ԫ��С�ڵڶ���Ԫ�ط��ظ���������
    //       3. �����Ϊ��һ��Ԫ�ص��ڵڶ���Ԫ�ط���0���ɣ���ʱTreeSet����ֻ�ᱣ��һ��Ԫ�أ���Ϊ�����ظ�
    //       ע��: ���TreeSet���ϴ洢�Ķ�����ʵ�ֱȽϹ��򣬼���Ҳ�Դ��Ƚ�����Ĭ��ʹ�ü����Դ��ıȽ�������

    @Override
    public int compareTo(Apple o) {
        // �����������бȽϵ�
        return this.weight - o.weight; // ȥ�������ظ���Ԫ��
        // return this.weight - o.weight >= 0 ? 1 : -1; // ���������ظ���Ԫ��
    }
}
