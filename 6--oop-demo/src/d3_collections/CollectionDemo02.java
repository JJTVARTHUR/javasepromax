package d3_collections;

import java.util.*;

/**
      Collections�������API
      ʹ�÷�Χ: ֻ�ܶ���List���ϵ�����

      �ַ����������ַ��ı����������

      �Զ������͵ıȽϷ���API:Collections
            - public static <T> void sort(List<T> list):
                  ��������Ԫ�ذ���Ĭ�Ϲ�������
                  ע��: ����ʽ������ֱ�Ӷ��Զ������͵�List�������򣬳����Զ�������ʵ���˱ȽϹ���Comparable�ӿ�

            - public static <T> void sort(List<T> list��Comparator<? super T> c):
                  ��������Ԫ�ذ���ָ����������,�Դ��Ƚ���
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(); // �����ظ���
        apples.add(new Apple("�츻ʿ", "��ɫ", 9.9, 500));
        apples.add(new Apple("��ƻ��", "��ɫ", 15.9, 300));
        apples.add(new Apple("��ƻ��", "��ɫ", 29.9, 400));
        apples.add(new Apple("��ƻ��", "��ɫ", 9.8, 500));

        // ��ʽһ: ���Եģ�Apple���Ѿ���д��CompareTo�ıȽϹ���
        // Collections.sort(apples);
        // System.out.println(apples);

        // ��ʽ��: sort�����Դ��Ƚ�������
        // Collections.sort(apples, new Comparator<Apple>() {
        //    @Override
        //    public int compare(Apple o1, Apple o2) {
        //        return Double.compare(o1.getPrice() , o2.getPrice()); // ���ռ۸���������!!
        //    }
        //});

        Collections.sort(apples , (o1,o2) -> Double.compare(o1.getPrice(),o2.getPrice()));
        System.out.println(apples);
    }
}
