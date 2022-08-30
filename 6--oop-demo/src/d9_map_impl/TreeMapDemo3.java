package d9_map_impl;

import d1_collection_set.Apple;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
      Map������ϵ:
                        Map
           /             |            \
        HashMap        HashTable        ...
        /                 |               \
      LinkedHashMap    properties        TreeMap

      ˵��:
      1. ʹ������Map������HashMap
      2. �ص�����HashMap��linkedHashMap��TreeMap�������ĺ�����⡣

      TreeMap���ϸ������ص�:
      1. �ɼ��������ԣ����ظ� ������ ������
      2. �����򣺰��ռ����ݵĴ�СĬ������(��С����)����ֻ�ܶԼ�����
      3. ע�⣺TreeMap������һ��Ҫ����ģ�����Ĭ������Ҳ���Խ�������ָ���Ĺ����������
      4. TreeMap��TreeSetһ�����ײ�ԭ����һ����

      TreeMap�����Զ���������������֣�
      1. ��ʵ��Comparable�ӿڣ���д�ȽϹ���
      2. �����Զ���Comparator�Ƚ���������д�ȽϹ���
 */
public class TreeMapDemo3 {
    public static void main(String[] args) {
        Map<Integer, String> maps1 = new TreeMap<>();
        maps1.put(13 , "������");
        maps1.put(1 , "����");
        maps1.put(3 , "�س�");
        System.out.println(maps1);

        // TreeMap�����Դ�����  ������ ���ظ���ֻҪ��С����һ������Ϊ�ظ���  ������
        Map<Apple, String> maps2 = new TreeMap<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o2.getPrice() , o1.getPrice()); // ���ռ۸�������
            }
        });
        maps2.put(new Apple("�츻ʿ", "��ɫ", 9.9, 500), "ɽ��" );
        maps2.put(new Apple("��ƻ��", "��ɫ", 15.9, 300), "����");
        maps2.put(new Apple("��ƻ��", "��ɫ", 29.9, 400), "����");
        maps2.put(new Apple("��ƻ��", "��ɫ", 9.8, 500), "����");

        System.out.println(maps2);
    }
}
