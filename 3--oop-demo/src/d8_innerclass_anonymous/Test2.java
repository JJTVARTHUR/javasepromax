package d8_innerclass_anonymous;

/**

 目标：掌握匿名内部类的使用形式（语法）
 使用总结：匿名内部类可以作为方法的实际参数进行传递

 */

public class Test2 {
    public static void main(String[] args) {
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生在游泳");
            }
        };
        go(s1);

        System.out.println("--------------");

        Swimming s2 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师在游泳");
            }
        };
        go(s2);

        System.out.println("--------------");

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("运动员在游泳");
            }
        });
    }

    /**
     学生 老师 运动员可以一起参加游泳比赛
     */
    public static void go(Swimming s){
        System.out.println("开始。。。");
        s.swim();
        System.out.println("结束。。。");
    }
}

interface Swimming{
    void swim();
}
