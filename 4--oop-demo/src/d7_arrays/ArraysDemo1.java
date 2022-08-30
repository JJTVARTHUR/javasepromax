package d7_arrays;

import java.util.Arrays;

/**

 Arrays类概述:
 1.数组操作工具类，专门用于操作数组元素的。

 Arrays类的常用API:
                方法名                                             说明
 public static String toString(类型[] a)                       对数组进行整理.
 public static void sort(类型[] a)                             对数组进行默认升序排列
 public static<T>void sort(类型[] a,Comparator<?superT>c)      使用比较器对象自定义排序
 public static int binarySearch(int[] a,int key)              二分搜索数组中的数据，存在返回索引，不存在返回-1

 */

public class ArraysDemo1 {
    public static void main(String[] args) {
        // 学会使用Arrays类的常用API，并理解其原理
        int[] arr = {10,2,55,23,24,100};
        System.out.println(arr);

        // 1. 返回数组内容的 toString(数组)
        String rs = Arrays.toString(arr);
        System.out.println(rs);
        System.out.println(Arrays.toString(arr));

        // 2. 排序的API(默认自动对数组元素进行升序排序)
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        // 3. 二分搜索技术(前提数组必须排好序才支持，否则出bug)
        int index1 = Arrays.binarySearch(arr,55);
        System.out.println(index1);

        // 返回不存在元素的规律:  -  (应该插入的位置索引 + 1)
        int index2 = Arrays.binarySearch(arr,22);
        System.out.println(index2);

        // 注意: 数组如果没有排好序，可能会找不到存在的元素，从而出现bug！！！
        int[] arr2 = {12,36,34,25,13,24,234,100}; // 错误示范
        System.out.println(Arrays.binarySearch(arr2,36)); // 错误示范
    }
}
