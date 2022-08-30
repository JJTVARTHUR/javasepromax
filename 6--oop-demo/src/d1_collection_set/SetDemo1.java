package d1_collection_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
       Setϵ�м����ص�:
       1. ���򣺴�ȡ˳��һ��
       2. ���ظ�������ȥ���ظ�
       3. ��������û�д������ķ��������Բ���ʹ����ͨforѭ��������Ҳ����ͨ����������ȡԪ��

       Set����ʵ�����ص�:
       1. HashSet������ ���ظ� ������
       2. LinkedHashSet������ ���ظ� ������
       3. TreeSet������ ���ظ� ������

       Set���ϵĹ����ϻ�������Collection��APIһ��
 */

public class SetDemo1 {
    public static void main(String[] args) {
        // ����Setϵ�м��ϵ��ص�:  HashSet LinkedHashSet TreeSet

        Set<String> sets = new HashSet<>(); // һ�о������ ���� ���ظ� ������
        // Set<String> sets = new LinkedHashSet<>(); // ���� ���ظ� ������
        sets.add("MySQL");
        sets.add("MySQL");
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);
    }
}
