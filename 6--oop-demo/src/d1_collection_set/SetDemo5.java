package d1_collection_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
       TreeSet���ϸ������ص�:
       1. ���ظ� ������ ������
       2. ������: ����Ԫ�صĴ�СĬ������(��С����)����
       3. TreeSet���ϵײ��ǻ��ں���������ݽṹʵ������ģ���ɾ�Ĳ����ܶ��Ϻ�
       4. ע��: TreeSet������һ��Ҫ����ģ����Խ�Ԫ�ذ���ָ���Ĺ����������

       TreeSet����Ĭ�ϵĹ���:
       1. ������ֵ����: Integer,Double,�ٷ�Ĭ�ϰ��մ�С������������
       2. �����ַ�������: Ĭ�ϰ������ַ��ı����������(����ASCII��������)
       3. �����Զ���������Student����TreeSet�޷�ֱ������
       4. ��Ҫʹ��TreeSet�洢�Զ������ͣ���Ҫ�ƶ��������

       �Զ����������:
       1. TreeSet���ϴ洢�����ʱ�������ַ�ʽ��������Զ���ȽϹ���

       ��ʽһ
       1. ���Զ������(��ѧ����)��ʵ��Comparable�ӿ���д�����compareTo���������ƱȽϹ���
       ��ʽ��
       2. TreeSet�����в�������������������Comparator�ӿڶ�Ӧ�ıȽ������������ƱȽϹ���

       ���ַ�ʽ�У����ڷ���ֵ�Ĺ���:
       1. �����Ϊ��һ��Ԫ�ش��ڵڶ���Ԫ�ط�������������
       2. �����Ϊ��һ��Ԫ��С�ڵڶ���Ԫ�ط��ظ���������
       3. �����Ϊ��һ��Ԫ�ص��ڵڶ���Ԫ�ط���0���ɣ���ʱTreeSet����ֻ�ᱣ��һ��Ԫ�أ���Ϊ�����ظ�
       ע��: ���TreeSet���ϴ洢�Ķ�����ʵ�ֱȽϹ��򣬼���Ҳ�Դ��Ƚ�����Ĭ��ʹ�ü����Դ��ıȽ�������
 */
public class SetDemo5 {
    public static void main(String[] args) {
        Set<Integer> sets = new TreeSet<>(); // ���ظ� ������ ������
        sets.add(23);
        sets.add(24);
        sets.add(12);
        sets.add(8);
        System.out.println(sets);

        Set<String> sets1 = new TreeSet<>(); // ���ظ� ������ ������
        sets1.add("Java");
        sets1.add("Java");
        sets1.add("angela");
        sets1.add("����");
        sets1.add("Java");
        sets1.add("About");
        sets1.add("Python");
        sets1.add("UI");
        sets1.add("UI");
        System.out.println(sets1);

        System.out.println("-----------------------------");

        //        ��ʽ��
        //       2. TreeSet�����в�������������������Comparator�ӿڶ�Ӧ�ıȽ������������ƱȽϹ���
        //
        //       ���ַ�ʽ�У����ڷ���ֵ�Ĺ���:
        //       1. �����Ϊ��һ��Ԫ�ش��ڵڶ���Ԫ�ط�������������
        //       2. �����Ϊ��һ��Ԫ��С�ڵڶ���Ԫ�ط��ظ���������
        //       3. �����Ϊ��һ��Ԫ�ص��ڵڶ���Ԫ�ط���0���ɣ���ʱTreeSet����ֻ�ᱣ��һ��Ԫ�أ���Ϊ�����ظ�
        //       ע��: ���TreeSet���ϴ洢�Ķ�����ʵ�ֱȽϹ��򣬼���Ҳ�Դ��Ƚ�����Ĭ��ʹ�ü����Դ��ıȽ�������

//        Set<Apple> apples = new TreeSet<>(new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
                // return o1.getWeight() - o2.getWeight(); // ����
                // return o2.getWeight() - o1.getWeight(); // ����
                // return o2.getWeight() - o1.getWeight() >= 0 ? 1 : -1; // ���������ظ���Ԫ��
                // ע��: �����ͽ���ֱ��ʹ��Double.compare���бȽ�
                // return Double.compare(o1.getPrice(),o2.getPrice()); // ����
                // return Double.compare(o2.getPrice(),o1.getPrice()); // ����
//            }
//        })

        // Lambda��
        Set<Apple> apples = new TreeSet<>(( o1,  o2) ->  Double.compare(o2.getPrice() , o1.getPrice()));
        apples.add(new Apple("�츻ʿ", "��ɫ", 9.9, 500));
        apples.add(new Apple("��ƻ��", "��ɫ", 15.9, 300));
        apples.add(new Apple("��ƻ��", "��ɫ", 29.9, 400));
        apples.add(new Apple("��ƻ��", "��ɫ", 9.8, 500));
        System.out.println(apples);
    }
}
