package d1_collection_set;

import java.util.LinkedHashSet;
import java.util.Set;

/**
       LinkedHshSet���ϸ������ص�:
       1. ���� ���ظ� ������
       2. ���������ָ���Ǳ�֤�洢��ȡ����Ԫ��˳��һ��
       3. ԭ��: �ײ����ݽṹ��Ȼ�ǹ�ϣ��ֻ��ÿ��Ԫ���ֶ���Ķ���һ��˫����Ļ��Ƽ�¼�洢��˳��

 */
public class SetDemo4 {
    public static void main(String[] args) {
        // ����Setϵ�м��ϵ��ص㣺 HashSet LinkedHashSet TreeSet
        Set<String> sets = new LinkedHashSet<>(); // ���� ���ظ� ������
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
