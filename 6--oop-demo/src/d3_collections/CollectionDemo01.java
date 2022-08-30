package d3_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
      Ŀ�꣺Collections�������ʹ�á�

      java.utils.Collections:�Ǽ��Ϲ�����
      Collections�������ڼ��ϣ��������������ϵĹ����ࡣ
      Collections�м������õ�API:
            - public static <T> boolean addAll(Collection<? super T> c, T... elements)
                 �����϶����������Ԫ�أ�
            - public static void shuffle(List<?> list) :���Ҽ���˳��
            - public static <T> void sort(List<T> list):��������Ԫ�ذ���Ĭ�Ϲ�������(����)
            - public static <T> void sort(List<T> list��Comparator<? super T> c):��������Ԫ�ذ���ָ����������
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //names.add("������");
        //names.add("������");
        //names.add("���޼�");
        //names.add("½С��");
        Collections.addAll(names,"������","������","���޼�","½С��");
        System.out.println(names);

        // 2. public static void shuffle(List<?> list) : ���Ҽ���˳��
        Collections.shuffle(names);
        System.out.println(names);

        // 3. public static <T> void sort(List<T> list) : ��������Ԫ�ذ���Ĭ�Ϲ������� (��ֵ���Եİ���) (����)
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,12,23,2,4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
