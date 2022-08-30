package d9_genericity_method;

/**
      泛型方法的概述:
      1. 定义方法的同时定义了泛型的方法就是泛型方法
      2. 泛型方法的格式: 修饰符 <泛型变量> 方法返回值 方法名称 (形参列表){}
      范例: public<T> void show(T t){}

      3. 作用: 方法中可以使用泛型接收一切引用类型的参数，方法更具备通用性

      泛型方法的原理:
      1. 把出现泛型变量的地方全部替换成传输的引用数据类型

 */
public class GenericDemo {
    public static void main(String[] args) {
        Integer[] age = {11,22,33};
        ArraysToString(age);

        String[] name = {"1","2","3"};
        ArraysToString(name);

        Integer[] ages2 = getArr(age);
        String[] names2 = getArr(name);
    }

    public static <T> T[] getArr(T[] arr){
        return arr;
    }

    public static <T> void ArraysToString(T[] arr){
        if(arr != null){
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "":", ");
            }
            sb.append("]");
            System.out.println(sb);
        }else{
            System.out.println(arr);
        }
    }
}
