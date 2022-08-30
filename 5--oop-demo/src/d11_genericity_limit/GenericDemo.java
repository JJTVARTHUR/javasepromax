package d11_genericity_limit;

import java.util.ArrayList;

/**
      通配符: ?
      1. ? 可以在 "使用泛型" 的时候代表一切类型
      2. E T K V 是在定义泛型的时候使用的

      注意事项:
      1. 虽然BMW和BENZ都继承了Car但是ArrayList<BMW>和ArrayList<BENZ>与ArrayList<Car>没有关系的！！！

      泛型的上下限:
      1.  ? extends Car : ?必须是Car或者其子类 泛型上限
      2.  ? super Car : ?必须是Car或者其父类 泛型下限

 */

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        // go(dogs);
    }

    /**
     所有车比赛
     */
    public static void go(ArrayList<? extends Car> cars){

    }
}

class Dog{

}

class BENZ extends Car{

}

class BMW extends Car{

}

// 父类
class Car{

}